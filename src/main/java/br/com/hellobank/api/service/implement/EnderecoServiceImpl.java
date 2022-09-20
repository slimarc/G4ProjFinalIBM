package br.com.hellobank.api.service.implement;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mapping.AccessOptions.SetOptions.Propagation;
import org.springframework.stereotype.Service;

import br.com.hellobank.api.dao.EnderecoDAO;
import br.com.hellobank.api.models.entidades.Endereco;
import br.com.hellobank.api.models.request.EnderecoRequest;
import br.com.hellobank.api.models.response.EnderecoResponse;
import br.com.hellobank.api.service.interfacesServices.EnderecoService;

@Service
public class EnderecoServiceImpl implements EnderecoService {

    @Autowired
    private EnderecoDAO enderecoDAO;
    
    //GET
    @Override
    public ArrayList<Endereco> listarTodos() {
        return (ArrayList<Endereco>) enderecoDAO.findAll();
    }

    @Override
    public ArrayList<Endereco> listarPeloCep(String cep) {
        return enderecoDAO.findByCep(cep);
    }

    //POST
    @Override
    public Endereco cadastarNovo(Endereco cadastrar) {
        return enderecoDAO.save(cadastrar);
    }
    
    //PUT
    @Override
    public Endereco atualizarCliente(Endereco atualiza) {
        return enderecoDAO.save(atualiza);
    }

    //DELETE
    @Override
    public void deletarEndereco(Long idEndereco) {
        enderecoDAO.deleteById(idEndereco);
        
    }
    
}
