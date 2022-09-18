package br.com.hellobank.api.dao;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import br.com.hellobank.api.model.entidades.Cliente;

public interface ClienteDAO extends CrudRepository<Cliente, Integer> {
    
    ArrayList<Cliente> findBynomeContaining(String nome);
    ArrayList<Cliente> findBycpf(String cpf);
    ArrayList<Cliente> findByrg(String rg);

}
