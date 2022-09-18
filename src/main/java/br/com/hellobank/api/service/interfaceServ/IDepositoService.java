package br.com.hellobank.api.service.interfaceServ;

import java.util.List;

import br.com.hellobank.api.model.entidades.Deposito;
import br.com.hellobank.api.model.request.DepositoRequest;

public interface IDepositoService {

    Deposito create(DepositoRequest depositoRequest);
    List<Deposito> findClienteDeposito(Integer id);
}
