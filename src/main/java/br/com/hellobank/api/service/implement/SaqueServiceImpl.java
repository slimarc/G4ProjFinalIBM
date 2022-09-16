package br.com.hellobank.api.service.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import br.com.hellobank.api.model.entity.Saque;
import br.com.hellobank.api.model.request.SaqueRequest;
import br.com.hellobank.api.dao.SaqueDAO;
import br.com.hellobank.api.service.interfaceServ.ISaqueService;

@Component
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class SaqueServiceImpl implements ISaqueService {

    @Autowired
    SaqueDAO saqueDAO;

    @Override
    public Saque create(SaqueRequest saqueRequest) {
        Saque saque = new Saque(saqueRequest.getContaId(), saqueRequest.getValor());
        return saqueDAO.save(saque);
    }

    @Override
    public List<Saque> findClienteSaques(Long id) {
        return saqueDAO.getSaqueById_conta(id);
    }
}
