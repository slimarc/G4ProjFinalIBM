package br.com.hellobank.api.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import br.com.hellobank.api.model.entidades.Deposito;

@Repository
public interface DepositoDAO extends JpaRepository<Deposito, Integer> {

    @Query(value = "SELECT * FROM deposito WHERE conta_id = ?1", name ="findDeposito", nativeQuery = true)
    List<Deposito> getDepositoById_conta(Integer contaId);
}
