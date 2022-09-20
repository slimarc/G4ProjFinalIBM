package br.com.hellobank.api.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.hellobank.api.models.entidades.Deposito;

@Repository
public interface DepositoDAO extends JpaRepository<Deposito, Long> {

    @Query(value = "SELECT * FROM deposito WHERE id_conta = ?1", name =
            "findDepositos", nativeQuery = true)
    List<Deposito> findClienteDepositos(Long id);
}
