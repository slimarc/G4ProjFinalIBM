package br.com.hellobank.api.service.interfaceServ;

import java.util.ArrayList;

import br.com.hellobank.api.model.entidades.Cliente;

public interface IClienteService {
    
    //GET
    public ArrayList<Cliente> listarTodos();
    public Cliente listarPeloId(Integer id);
    public ArrayList<Cliente> listarPeloNome(String nome);
    
    //POST
    public Cliente cadastrarNovo(Cliente novo);

    //PUT
    public Cliente atualizarCliente(Cliente atualiza);

    //DELETE
    public void deletarCliente(Integer id);
    
}
