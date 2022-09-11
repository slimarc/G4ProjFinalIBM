package br.com.hellobank.api.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.hellobank.api.dao.EnderecoDAO;
import br.com.hellobank.api.model.Endereco;

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
