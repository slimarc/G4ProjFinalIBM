package br.com.hellobank.api.service.interfaceServ;

import java.util.List;

import br.com.hellobank.api.model.entity.Saque;
import br.com.hellobank.api.model.request.SaqueRequest;

public interface ISaqueService {

    Saque create(SaqueRequest saqueRequest);

    List<Saque> findClienteSaques(Long id);
}
