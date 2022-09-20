package br.com.hellobank.api.service.implement;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import br.com.hellobank.api.dao.ClienteDAO;
import br.com.hellobank.api.exception.BusinessException;
import br.com.hellobank.api.exception.NotFoundException;
import br.com.hellobank.api.models.entidades.Cliente;
import br.com.hellobank.api.models.entidades.Conta;
import br.com.hellobank.api.models.request.ClienteRequest;
import br.com.hellobank.api.models.response.ClienteResponse;
import br.com.hellobank.api.service.interfacesServices.ContaService;
import br.com.hellobank.api.service.interfacesServices.ClienteService;

@Component
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteDAO clienteDAO;

    @Autowired
    private ContaService contaService;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public ClienteResponse create(ClienteRequest clienteRequest) {
        this.checkCpfExistentes(clienteRequest.getCpf());
        Conta conta = contaService.create(new Conta());
        Cliente cliente = new Cliente();
        cliente.setNome(clienteRequest.getNome());
        cliente.setCpf(clienteRequest.getCpf());
        cliente.setRg(clienteRequest.getRg());
        cliente.setTelefone(clienteRequest.getTelefone());
        cliente.setEmail(clienteRequest.getEmail());
        cliente.setContaId(conta.getId());
        clienteDAO.save(cliente);
        return new ClienteResponse(cliente.getNome(), cliente.getCpf(), cliente.getRg(), cliente.getTelefone(), cliente.getEmail(), cliente.getContaId());
    }

    @Override
    public ArrayList<Cliente> buscarTodos() {
        ArrayList<Cliente> lista;
		lista=(ArrayList<Cliente>)clienteDAO.findAll();
		return lista;
    }
    
    @Override
    public ClienteResponse findByContaIdResponse(Long conta) {
        Cliente cliente = clienteDAO.findByContaId(conta);
        this.checkClienteNaoExistente(cliente);
        return new ClienteResponse(cliente.getNome(), cliente.getCpf(), cliente.getRg(), cliente.getTelefone(), cliente.getEmail(), cliente.getContaId());
    }

    @Override
    public Cliente findByContaId(Long conta) {
        Cliente cliente = clienteDAO.findByContaId(conta);
        this.checkClienteNaoExistente(cliente);
        return cliente;
    }

    @Override
    public ClienteResponse findByCpf(String cpf) {
        Cliente cliente = clienteDAO.findByCpf(cpf);
        this.checkClienteNaoExistente(cliente);
        return new ClienteResponse(cliente.getNome(), cliente.getCpf(), cliente.getRg(), cliente.getTelefone(), cliente.getEmail(), cliente.getContaId());
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public ClienteResponse update(ClienteRequest clienteRequest, Long conta) {
        Cliente clienteUpdated = this.findByContaId(conta);
        clienteUpdated.setNome(clienteRequest.getNome());
        clienteUpdated.setCpf(clienteRequest.getCpf());
        clienteUpdated.setRg(clienteRequest.getRg());
        clienteUpdated.setTelefone(clienteRequest.getTelefone());
        clienteUpdated.setEmail(clienteRequest.getEmail());
        clienteDAO.save(clienteUpdated);
        return new ClienteResponse(clienteUpdated.getNome(), clienteUpdated.getCpf(), clienteUpdated.getRg(), clienteUpdated.getTelefone(), clienteUpdated.getEmail(), clienteUpdated.getContaId());
    }

    @Override
    public void checkCpfExistentes(String cpf) {
        Cliente cliente = clienteDAO.findByCpf(cpf);
        this.checkClienteExistentes(cliente);
    }

    @Override
    public void checkClienteExistentes(Cliente cliente) {
        if (cliente != null)
            throw new BusinessException("O cliente já possui cadastro no banco");
    }

    @Override
    public void checkClienteNaoExistente(Cliente cliente) {
        if (cliente == null)
            throw new NotFoundException("A conta não existe");
    }

    @Override
    public void deletarCliente(Long id) {
        clienteDAO.deleteById(id);
        
    }
}