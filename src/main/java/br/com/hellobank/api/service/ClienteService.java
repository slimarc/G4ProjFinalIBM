package br.com.hellobank.api.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.hellobank.api.dao.ClienteDAO;
import br.com.hellobank.api.model.Cliente;

@Service
public class ClienteService implements IClienteService {

    @Autowired
    private ClienteDAO dao;

    //GET
    @Override
    public ArrayList<Cliente> listarTodos() {
        return (ArrayList<Cliente>)dao.findAll();
    }

    @Override
    public Cliente listarPeloId(Integer id) {
        return dao.findById(id).orElse(null);
    }

    //******
    @Override
    public Cliente listarPeloCpf(String cpf) {
        return null;
    }

    //******
    @Override
    public Cliente listarPeloRg(String rg) {
        return null;
    }

    //POST
    @Override
    public Cliente cadastrarNovo(Cliente novo) {
        return dao.save(novo);
    }
    
    //PUT
    @Override
    public Cliente atualizarCliente(Cliente atualiza) {
        return dao.save(atualiza);
    }

    //DELETE
    @Override
    public void deletarCliente(Integer id) {
        dao.deleteById(id);
    }
    
}
