package br.com.hellobank.api.service.implement;

import java.util.List;
import java.util.Locale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import br.com.hellobank.api.exception.BusinessException;
import br.com.hellobank.api.models.entidades.Conta;
import br.com.hellobank.api.models.entidades.Deposito;
import br.com.hellobank.api.models.entidades.Saque;
import br.com.hellobank.api.models.entidades.Transferencia;
import br.com.hellobank.api.models.enums.TipoTransferencia;
import br.com.hellobank.api.models.request.SaqueRequest;
import br.com.hellobank.api.models.request.DepositoRequest;
import br.com.hellobank.api.models.request.TransferenciaRequest;
import br.com.hellobank.api.models.response.SaqueResponse;
import br.com.hellobank.api.models.response.DepositoResponse;
import br.com.hellobank.api.models.response.TransferenciaResponse;
import br.com.hellobank.api.models.response.TransferenciasResponse;
import br.com.hellobank.api.service.interfacesServices.ContaService;
import br.com.hellobank.api.service.interfacesServices.SaqueService;
import br.com.hellobank.api.service.interfacesServices.ClienteService;
import br.com.hellobank.api.service.interfacesServices.DepositoService;
import br.com.hellobank.api.service.interfacesServices.OperacaoService;
import br.com.hellobank.api.service.interfacesServices.TransferenciaService;

@Component
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class OperacaoServiceImpl implements OperacaoService {

    @Autowired
    ClienteService clienteService;

    @Autowired
    ContaService contaService;

    @Autowired
    TransferenciaService transferenciaService;

    @Autowired
    DepositoService depositoService;

    @Autowired
    SaqueService saqueService;

    @Override
    public String getSaldo(Long contaId) {
        clienteService.checkClienteNaoExistente(clienteService.findByContaId(contaId));
        Conta conta = contaService.findById(contaId);
        return "{ \"Saldo\" : " + Double.valueOf(String.format(Locale.US, "%.2f", conta.getSaldo())) + " } ";
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public DepositoResponse deposito(DepositoRequest depositoRequest) {
        this.validaValorTransacao(depositoRequest.getValor());
        Conta conta = contaService.findById(depositoRequest.getContaId());
        contaService.checkContaExistente(conta);
        conta.deposito(depositoRequest.getValor());
        Deposito deposito = depositoService.create(new Deposito(depositoRequest));
        contaService.update(conta);
        return new DepositoResponse(deposito.getValor(), deposito.getData(),
                TipoTransferencia.DEPOSITO.name());
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public SaqueResponse saque(SaqueRequest saqueRequest) {
        Conta conta = contaService.findById(saqueRequest.getContaId());
        this.validaValorTransacao(saqueRequest.getValor());
        this.validaValorSaque(conta, saqueRequest.getValor());
        conta.saque(saqueRequest.getValor());
        Saque Saque = saqueService.create(saqueRequest);
        contaService.update(conta);
        return new SaqueResponse(Saque.getValor(), Saque.getData(),
                TipoTransferencia.SAQUE.name());
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public TransferenciaResponse transferencia(TransferenciaRequest transferenciaRequest) {
        validaTransferencia(transferenciaRequest);
        this.validaValorTransacao(transferenciaRequest.getValor());
        Conta contaSaida = contaService.findById(transferenciaRequest.getSaidaContaId());
        Conta contaRecebe = contaService.findById(transferenciaRequest.getRecebeContaId());
        validaValorTransferencia(contaSaida, transferenciaRequest.getValor());
        contaSaida.saque(transferenciaRequest.getValor());
        contaRecebe.deposito(transferenciaRequest.getValor());
        Transferencia transferencia = transferenciaService.transferencia(transferenciaRequest);
        contaService.update(contaSaida);
        contaService.update(contaRecebe);
        return new TransferenciaResponse(transferencia.getContaIdSaida(),
                transferencia.getContaIdRecebe(),
                transferencia.getValor(),
                transferencia.getData(), TipoTransferencia.TRANSFERENCIA);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public List<Transferencia> getTransferencias(Long contaId) {
        Conta conta = contaService.findById(contaId);
        List<Transferencia> transferencias = transferenciaService.getTransferencias(contaId);
        List<Deposito> depositos = depositoService.findClienteDepositos(contaId);
        List<Saque> saques = saqueService.findClienteSaques(contaId);
        TransferenciasResponse transferenciasResponse = new TransferenciasResponse(contaId, transferencias, depositos, saques);
        return transferenciasResponse.getTransacoes();
    }

    @Override
    public void validaTransferencia(TransferenciaRequest transferenciaRequest) {
        if (transferenciaRequest.getSaidaContaId().equals(transferenciaRequest.getRecebeContaId()))
            throw new BusinessException("INVALID_TRANSFERENCIA", "Não é possivel fazer uma transação para a mesma conta");
    }
    
    private void validaValorTransferencia(Conta contaSaida, double valor) {
        if(contaSaida.getSaldo()<valor)
            throw new BusinessException("VALOR_INVALIDO_TRANSFERENCIAENCIA","Saldo Insuficiente", "valor");
    }

    private void validaValorSaque(Conta conta, double valor) {
        if(conta.getSaldo()<valor)
            throw new BusinessException("VALOR_INVALIDO_SAQUE","Valor Inválido para saque","valor");
    }

    private void validaValorTransacao(double valor) {
        if(valor < 1)
            throw new BusinessException("VALOR_INVALIDO","Valor Inválido para transações","valor");
    }
}
