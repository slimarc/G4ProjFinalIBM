package br.com.hellobank.api.service.implement;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import br.com.hellobank.api.dao.TransferenciaDAO;
import br.com.hellobank.api.models.entidades.Transferencia;
import br.com.hellobank.api.models.request.TransferenciaRequest;
import br.com.hellobank.api.service.interfacesServices.TransferenciaService;

@Component
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class TransferenciaServiceImpl implements TransferenciaService {

    @Autowired
    private TransferenciaDAO transferenciaRepository;

    @Override
    public Transferencia transferencia(TransferenciaRequest transferenciaRequest) {
        return transferenciaRepository.save(new Transferencia(transferenciaRequest));
    }

    @Override
    public List<Transferencia> getTransferencias(Long idConta) {
        List<Transferencia> transferencia = new ArrayList<>();
        transferencia = transferenciaRepository.findByTransacaoPeloId(idConta);
        return transferencia;
    }
}
