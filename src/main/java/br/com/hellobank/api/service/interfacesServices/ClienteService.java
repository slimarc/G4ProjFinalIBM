package br.com.hellobank.api.service.interfacesServices;

import java.util.ArrayList;

import br.com.hellobank.api.models.entidades.Cliente;
import br.com.hellobank.api.models.entidades.Conta;
import br.com.hellobank.api.models.request.ClienteRequest;
import br.com.hellobank.api.models.response.ClienteResponse;

public interface ClienteService {

    ArrayList<Cliente> buscarTodos();
    
    ClienteResponse findByContaIdResponse(Long conta);

    Cliente findByContaId(Long conta);

    void deletarCliente(Long id);

    ClienteResponse findByCpf(String cpf);

    ClienteResponse create(ClienteRequest clienteRequest);

    ClienteResponse update(ClienteRequest clienteRequest, Long conta);

    void checkClienteExistentes(Cliente cliente);

    void checkCpfExistentes(String cpf);

    void checkClienteNaoExistente(Cliente cliente);
}
