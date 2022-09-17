package br.com.hellobank.api.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.hellobank.api.model.entity.Conta;

public interface ContaDAO extends CrudRepository <Conta, Integer>{

}
