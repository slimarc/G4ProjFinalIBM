package br.com.hellobank.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.hellobank.api.models.entidades.Cliente;
import br.com.hellobank.api.models.entidades.Conta;

@Repository
public interface ClienteDAO extends JpaRepository<Cliente, Long> {

    Cliente findByCpf(String cpf);

    Cliente findByContaId(Long conta);

    void deleteById(Long id);
}
