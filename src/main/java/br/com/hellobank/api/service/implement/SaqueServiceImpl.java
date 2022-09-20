package br.com.hellobank.api.service.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import br.com.hellobank.api.dao.SaqueDAO;
import br.com.hellobank.api.models.entidades.Saque;
import br.com.hellobank.api.models.request.SaqueRequest;
import br.com.hellobank.api.service.interfacesServices.SaqueService;

@Component
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class SaqueServiceImpl implements SaqueService {

    @Autowired
    SaqueDAO saqueRepository;

    @Override
    public Saque create(SaqueRequest saqueRequest) {
        Saque saque = new Saque(saqueRequest.getContaId(), saqueRequest.getValor());
        return saqueRepository.save(saque);
    }

    @Override
    public List<Saque> findClienteSaques(Long id) {
        return saqueRepository.getSaqueById_conta(id);
    }
}
