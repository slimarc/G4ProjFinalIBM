package br.com.hellobank.api.service.interfaceServ;

import java.util.List;

import br.com.hellobank.api.model.entity.Deposito;
import br.com.hellobank.api.model.request.DepositoRequest;

public interface IDepositoService {

    Deposito create(DepositoRequest depositoRequest);

    List<Deposito> findClienteDeposito(Long id);
}
