package br.com.hellobank.api.controller;

import java.util.ArrayList;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.hellobank.api.models.entidades.Cliente;
import br.com.hellobank.api.models.request.ClienteRequest;
import br.com.hellobank.api.models.response.ClienteResponse;
import br.com.hellobank.api.service.interfacesServices.ClienteService;

@RestController
@RequestMapping(path = "/cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @PostMapping(value = "/create", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity create(@Valid @RequestBody ClienteRequest clienteRequest) {
        ClienteResponse clienteResponse = clienteService.create(clienteRequest);
        return new ResponseEntity<>(clienteResponse, HttpStatus.CREATED);
    }
    
    @GetMapping(value = "/lista", produces = MediaType.APPLICATION_JSON_VALUE)
    public ArrayList<Cliente> recuperarTodos(){
		return clienteService.buscarTodos();
		
	}

    @GetMapping(value = "/{contaId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity get(@PathVariable("contaId") Integer contaId) {
        ClienteResponse cliente = clienteService.findByContaIdResponse(Long.valueOf(contaId));
        return new ResponseEntity<>(cliente, HttpStatus.OK);
    }

    @PutMapping(value = "/update/{contaId}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity update(@PathVariable("contaId") Integer contaId, @Valid @RequestBody ClienteRequest clienteRequest) {
        ClienteResponse clienteResponse = clienteService.update(clienteRequest, Long.valueOf(contaId));
        return new ResponseEntity<>(clienteResponse, HttpStatus.OK);
    }

    @DeleteMapping(value = "/{id}")
	public ResponseEntity<Cliente> deletarCliente(@PathVariable("id") Long id) {
		clienteService.deletarCliente(id);
		return ResponseEntity.ok(null);
	}

}