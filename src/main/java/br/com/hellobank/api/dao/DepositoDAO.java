package br.com.hellobank.api.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import br.com.hellobank.api.model.entidades.Deposito;
import br.com.hellobank.api.model.request.DepositoRequest;

@Repository
public interface DepositoDAO extends JpaRepository<Deposito, Integer> {

    @Query(value = "SELECT * FROM deposito WHERE id_conta = ?1", name =
            "findDepositos", nativeQuery = true)
    List<Deposito> findClienteDepositos(Integer id);

    Deposito save(DepositoRequest depositoRequest);
}
