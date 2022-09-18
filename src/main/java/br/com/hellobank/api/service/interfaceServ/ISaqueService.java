package br.com.hellobank.api.service.interfaceServ;

import java.util.List;

import br.com.hellobank.api.model.entidades.Saque;
import br.com.hellobank.api.model.request.SaqueRequest;

public interface ISaqueService {

    Saque create(SaqueRequest saqueRequest);

    List<Saque> findClienteSaques(Integer id);
}
