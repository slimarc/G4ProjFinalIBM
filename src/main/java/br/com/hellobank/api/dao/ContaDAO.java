package br.com.hellobank.api.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.hellobank.api.models.entidades.Conta;

@Repository
public interface ContaDAO extends JpaRepository<Conta, Long> {

    Optional<Conta> findById(Conta id);
}
