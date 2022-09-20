package br.com.hellobank.api.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.hellobank.api.models.entidades.Endereco;
import br.com.hellobank.api.service.interfacesServices.EnderecoService;

@RestController
public class EnderecoController {
    
    @Autowired
    public EnderecoService enderecoService;

    @GetMapping("/enderecos")
    public ArrayList<Endereco> listarTodos(){
        return enderecoService.listarTodos();
    }

    @GetMapping("/enderecos/{cep}")
	public ResponseEntity<ArrayList<Endereco>> recuperarPeloNumero(@PathVariable String cep){
		ArrayList<Endereco> endereco = enderecoService.listarPeloCep(cep);
		if (endereco != null) {
			return ResponseEntity.ok(endereco);
		}
		return ResponseEntity.notFound().build();
    }

    @PutMapping(value = "/enderecos/update/{idEndereco}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
     public ResponseEntity<Endereco> atualizarCliente(@RequestBody Endereco atualiza){
          Endereco endereco = enderecoService.atualizarCliente(atualiza);
          if(endereco != null){
               return ResponseEntity.ok(endereco);
          }
          return ResponseEntity.badRequest().build();
     }

    @PostMapping(value = "/enderecos/create", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
     public ResponseEntity<Endereco> cadastrarNovo(@RequestBody Endereco novo){
          Endereco endereco = enderecoService.cadastarNovo(novo);
          if(endereco != null){
               return ResponseEntity.ok(endereco);
          }
          return ResponseEntity.badRequest().build();
     }
     
     @DeleteMapping(value = "/enderecos/delete/{idEndereco}")
	public ResponseEntity<Endereco> deletarEndereco(@PathVariable("idEndereco") Long idEndereco) {
		enderecoService.deletarEndereco(idEndereco);
		return ResponseEntity.ok(null);
	}
}
