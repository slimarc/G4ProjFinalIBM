package br.com.hellobank.api.service.interfacesServices;

import java.util.List;

import br.com.hellobank.api.models.entidades.Deposito;

public interface DepositoService {

    Deposito create(Deposito novoDeposito);

    List<Deposito> findClienteDepositos(Long id);
}
