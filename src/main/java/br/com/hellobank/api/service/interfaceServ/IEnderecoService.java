package br.com.hellobank.api.service.interfaceServ;

import java.util.ArrayList;

import br.com.hellobank.api.model.entidades.Endereco;

public interface IEnderecoService {
    
    public ArrayList<Endereco> listarTodos();
    public ArrayList<Endereco> listarPeloCep(String cep);
    /* public ArrayList<Endereco> listarPeloIdCliente(Integer cliente_idcliente); */
    public Endereco cadastarNovo(Endereco cadastrar);
}
