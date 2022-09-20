package br.com.hellobank.api.service.interfacesServices;

import java.util.List;

import br.com.hellobank.api.models.request.SaqueRequest;
import br.com.hellobank.api.models.entidades.Transferencia;
import br.com.hellobank.api.models.request.DepositoRequest;
import br.com.hellobank.api.models.request.TransferenciaRequest;
import br.com.hellobank.api.models.response.SaqueResponse;
import br.com.hellobank.api.models.response.DepositoResponse;
import br.com.hellobank.api.models.response.TransferenciaResponse;

public interface OperacaoService {

    String getSaldo(Long contaId);

    DepositoResponse deposito(DepositoRequest depositoRequest);

    TransferenciaResponse transferencia(TransferenciaRequest transferenciaRequest);

    SaqueResponse saque(SaqueRequest saqueRequest);

    List<Transferencia> getTransferencias(Long id);

    void validaTransferencia(TransferenciaRequest transferenciaRequest);
}
