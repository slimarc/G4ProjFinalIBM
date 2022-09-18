package br.com.hellobank.api.service.implement;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import br.com.hellobank.api.model.entidades.Transferencia;
import br.com.hellobank.api.model.request.TransferenciaRequest;
import br.com.hellobank.api.dao.TransferenciaDAO;
import br.com.hellobank.api.service.interfaceServ.ITransferenciaService;

@Component
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public  class TransferenciaImpl implements ITransferenciaService {

    @Autowired
    TransferenciaDAO transferenciaDAO;

    @Override
    public Transferencia transferencia(TransferenciaRequest transferenciaRequest) {
        return transferenciaDAO.save(new Transferencia(transferenciaRequest));
    }

    @Override
    public List<Transferencia> getTransferencias(Integer id) {
        List<Transferencia> transferencia = new ArrayList<>();
        transferencia = transferenciaDAO.getTransferenciaById_conta(id);
        return transferencia;
    }

 
    
}
