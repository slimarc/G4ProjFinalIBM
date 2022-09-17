package br.com.hellobank.api.service.interfaceServ;

import java.util.List;

import br.com.hellobank.api.model.entity.Transferencia;
import br.com.hellobank.api.model.request.SaqueRequest;
import br.com.hellobank.api.model.request.DepositoRequest;
import br.com.hellobank.api.model.request.TransferenciaRequest;
import br.com.hellobank.api.model.response.SaqueResponse;
import br.com.hellobank.api.model.response.DepositoResponse;
import br.com.hellobank.api.model.response.TransferenciaResponse;

public interface IOperacaoService {

    String getSaldo(Long contaId);

    DepositoResponse deposito(DepositoRequest depositoRequest);

    TransferenciaResponse transferencia(TransferenciaRequest transferenciaRequest);

    SaqueResponse saque(SaqueRequest saqueRequest);

    List<Transferencia> getTransferencias(Long id);

    void validaTransferencia(TransferenciaRequest transferenciaRequest);
}
