package br.com.hellobank.api.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.hellobank.api.models.entidades.Transferencia;

@Repository
public interface TransferenciaDAO extends JpaRepository<Transferencia, Long> {

    @Query(value = "SELECT * FROM transferencia WHERE conta_id_recebe = ?1 OR conta_id_saida = ?1", name =
            "findTransacoes", nativeQuery = true)
    List<Transferencia> findByTransacaoPeloId(Long id);
}
