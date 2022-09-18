package br.com.hellobank.api.service.implement;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.hellobank.api.dao.EnderecoDAO;
import br.com.hellobank.api.model.entidades.Endereco;
import br.com.hellobank.api.service.interfaceServ.IEnderecoService;

@Service
public class EnderecoService implements IEnderecoService {

    @Autowired
    private EnderecoDAO dao;
    
    //GET
    @Override
    public ArrayList<Endereco> listarTodos() {
        return (ArrayList<Endereco>) dao.findAll();
    }

    @Override
    public ArrayList<Endereco> listarPeloCep(String cep) {
        return dao.findByCep(cep);
    }

   
    //POST
    @Override
    public Endereco cadastarNovo(Endereco cadastrar) {
        return dao.save(cadastrar);
    }


    
}
