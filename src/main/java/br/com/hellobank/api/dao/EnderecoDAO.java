package br.com.hellobank.api.dao;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.hellobank.api.model.entidades.Endereco;

public interface EnderecoDAO extends JpaRepository<Endereco, Integer> {
    ArrayList<Endereco> findByCep(String cep);
}
