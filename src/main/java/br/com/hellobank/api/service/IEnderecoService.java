package br.com.hellobank.api.service;

import java.util.ArrayList;

import br.com.hellobank.api.model.Endereco;

public interface IEnderecoService {
    
    public ArrayList<Endereco> listarTodos();
    public ArrayList<Endereco> listarPeloCep(Integer cep);
    public Endereco cadastarNovo(Endereco cadastrar);
}
