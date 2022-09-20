package br.com.hellobank.api.service.interfacesServices;

import br.com.hellobank.api.models.entidades.Conta;

public interface ContaService {

    Conta findById(Long id);

    Conta create(Conta novaConta);

    Conta update(Conta conta);

    void checkContaExistente(Conta conta);
}
