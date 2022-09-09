package br.com.hellobank.api.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.hellobank.api.model.Endereco;
import br.com.hellobank.api.service.IEnderecoService;

@RestController
public class EnderecoController {
    
    @Autowired
    public IEnderecoService service;

    @GetMapping("/enderecos")
    public ArrayList<Endereco> listarTodos(){
        return service.listarTodos();
    }

    @GetMapping("/enderecos/{cep}")
	public ResponseEntity<ArrayList<Endereco>> recuperarPeloNumero(@PathVariable Integer cep){
		ArrayList<Endereco> endereco = service.listarPeloCep(cep);
		if (endereco != null) {
			return ResponseEntity.ok(endereco);
		}
		return ResponseEntity.notFound().build();
    }

    @PostMapping("/enderecos")
     public ResponseEntity<Endereco> cadastrarNovo(@RequestBody Endereco novo){
          Endereco endereco = service.cadastarNovo(novo);
          if(endereco != null){
               return ResponseEntity.ok(endereco);
          }
          return ResponseEntity.badRequest().build();
     } 
}
