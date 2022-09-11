package br.com.hellobank.api.dao;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import br.com.hellobank.api.model.Endereco;

public interface EnderecoDAO extends CrudRepository<Endereco, Integer> {
    ArrayList<Endereco> findByCep(String cep);
}
