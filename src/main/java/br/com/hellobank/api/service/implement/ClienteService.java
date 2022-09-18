package br.com.hellobank.api.service.implement;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.hellobank.api.dao.ClienteDAO;
import br.com.hellobank.api.model.entidades.Cliente;
import br.com.hellobank.api.service.interfaceServ.IClienteService;

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

    @Override
    public ArrayList<Cliente> listarPeloNome(String nome) {
        return dao.findBynomeContaining(nome);
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
