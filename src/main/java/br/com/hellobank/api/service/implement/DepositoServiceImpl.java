package br.com.hellobank.api.service.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import br.com.hellobank.api.model.entity.Deposito;
import br.com.hellobank.api.model.request.DepositoRequest;
import br.com.hellobank.api.dao.DepositoDAO;
import br.com.hellobank.api.service.interfaceServ.IDepositoService;

@Component
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class DepositoServiceImpl implements IDepositoService {

    @Autowired
    DepositoDAO depositoDAO;

    @Override
    public Deposito create(DepositoRequest depositoRequest) {
        Deposito deposito = new Deposito(depositoRequest.getContaId(), depositoRequest.getValor());
        return depositoDAO.save(deposito);
    }

    @Override
    public List<Deposito> findClienteDeposito(Long id) {
        return depositoDAO.getDepositoById_conta(id);
    }

}
