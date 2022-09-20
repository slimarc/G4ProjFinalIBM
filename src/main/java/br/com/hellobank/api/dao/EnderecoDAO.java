package br.com.hellobank.api.dao;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.hellobank.api.models.entidades.Endereco;

public interface EnderecoDAO extends JpaRepository<Endereco, Long> {

    ArrayList<Endereco> findByCep(String cep);

    void deleteById(Long idEndereco);
}
