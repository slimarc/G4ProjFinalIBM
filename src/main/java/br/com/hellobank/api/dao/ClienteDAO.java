package br.com.hellobank.api.dao;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.hellobank.api.model.entidades.Cliente;

public interface ClienteDAO extends JpaRepository<Cliente, Integer> {
    
    ArrayList<Cliente> findBynomeContaining(String nome);
    ArrayList<Cliente> findBycpf(String cpf);
    ArrayList<Cliente> findByrg(String rg);

}
