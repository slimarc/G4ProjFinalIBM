package br.com.hellobank.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.hellobank.api.model.entidades.Conta;

public interface ContaDAO extends JpaRepository <Conta, Integer>{

}
