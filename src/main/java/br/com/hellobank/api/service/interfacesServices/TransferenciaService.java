package br.com.hellobank.api.service.interfacesServices;

import java.util.List;

import br.com.hellobank.api.models.entidades.Transferencia;
import br.com.hellobank.api.models.request.TransferenciaRequest;

public interface TransferenciaService {

    Transferencia transferencia(TransferenciaRequest transferenciaRequest);

    List<Transferencia> getTransferencias(Long id);
}
