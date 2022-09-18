package br.com.hellobank.api.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import br.com.hellobank.api.model.entidades.Transferencia;

@Repository
public interface TransferenciaDAO extends JpaRepository<Transferencia, Integer> {

    @Query(value = "SELECT * FROM transferencia WHERE conta_id = ?1", name ="findTransferencia", nativeQuery = true)
    List<Transferencia> getTransferenciaById_conta(Integer contaId);
}
