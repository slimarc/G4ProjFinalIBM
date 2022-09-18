package br.com.hellobank.api.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import br.com.hellobank.api.model.entidades.Saque;

@Repository
public interface SaqueDAO extends JpaRepository<Saque, Integer> {

    @Query(value = "SELECT * FROM saque WHERE conta_id = ?1", name ="findSaque", nativeQuery = true)
    List<Saque> getSaqueById_conta(Integer contaId);
}
