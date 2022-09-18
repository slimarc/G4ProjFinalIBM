package br.com.hellobank.api.service.interfaceServ;

import java.util.List;

import br.com.hellobank.api.model.entidades.Transferencia;
import br.com.hellobank.api.model.request.TransferenciaRequest;

public interface ITransferenciaService {

	Transferencia create(TransferenciaRequest transferenciaRequest);

    List<Transferencia> findClienteTransferencia(Integer id);
}
