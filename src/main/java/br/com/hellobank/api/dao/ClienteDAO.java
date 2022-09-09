package br.com.hellobank.api.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.hellobank.api.model.Cliente;

public interface ClienteDAO extends CrudRepository<Cliente, Integer> {
    
}
