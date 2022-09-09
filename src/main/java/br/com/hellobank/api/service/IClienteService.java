package br.com.hellobank.api.service;

import java.util.ArrayList;

import br.com.hellobank.api.model.Cliente;

public interface IClienteService {
    
    //GET
    public ArrayList<Cliente> listarTodos();
    public Cliente listarPeloId(Integer id);
    public Cliente listarPeloCpf(String cpf);
    public Cliente listarPeloRg (String rg);
    
    //POST
    public Cliente cadastrarNovo(Cliente novo);

    //PUT
    public Cliente atualizarCliente(Cliente atualiza);

    //DELETE
    public void deletarCliente(Integer id);
    
}
