package br.com.hellobank.api.service.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import br.com.hellobank.api.dao.DepositoDAO;
import br.com.hellobank.api.models.entidades.Deposito;
import br.com.hellobank.api.service.interfacesServices.DepositoService;

@Component
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class DepositoServiceImpl implements DepositoService {

    @Autowired
    DepositoDAO depositoRepository;

    @Override
    public Deposito create(Deposito novoDeposito) {
        return depositoRepository.save(novoDeposito);
    }

    @Override
    public List<Deposito> findClienteDepositos(Long id) {
        return depositoRepository.findClienteDepositos(id);
    }
}
