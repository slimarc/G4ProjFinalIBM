package br.com.hellobank.api.service.implement;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import br.com.hellobank.api.exception.NotFoundException;

import br.com.hellobank.api.dao.ContaDAO;

import br.com.hellobank.api.models.entidades.Conta;
import br.com.hellobank.api.service.interfacesServices.ContaService;

@Component
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class ContaServiceImpl implements ContaService {

    @Autowired
    private ContaDAO contaDAO;

    @Override
    public Conta findById(Long id) {
        Optional<Conta> optionalConta = contaDAO.findById(id);
        if (!optionalConta.isPresent())
            throw new NotFoundException("Conta Inexistente");
        return optionalConta.get();
    }

    @Override
    public Conta create(Conta novaConta) {
        return contaDAO.save(novaConta);
    }

    @Override
    public Conta update(Conta conta) {
        return contaDAO.save(conta);
    }

    @Override
    public void checkContaExistente(Conta conta) {
        if (conta == null)
            throw new NotFoundException("Conta Inexistente");
    }
}
