package br.com.hellobank.api.service.interfacesServices;

import java.util.List;

import br.com.hellobank.api.models.entidades.Saque;
import br.com.hellobank.api.models.request.SaqueRequest;

public interface SaqueService {

    Saque create(SaqueRequest saqueRequest);

    List<Saque> findClienteSaques(Long id);
}
