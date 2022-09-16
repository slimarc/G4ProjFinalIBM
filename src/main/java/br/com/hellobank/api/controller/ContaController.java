package br.com.hellobank.api.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import br.com.hellobank.api.model.entity.Conta;
import br.com.hellobank.api.service.interfaceServ.IContaService;

@RestController
public class ContaController {
    @Autowired
    public IContaService service;

    @GetMapping("/contas")
    public ArrayList<Conta> listarContas(){
        return service.listarContas();
    }

    @GetMapping("/contas/{id}")
	public ResponseEntity<Conta> listarContaPeloId(@PathVariable Integer id){
		Conta conta = service.listarContaPeloId(id);
		if (conta != null) {
			return ResponseEntity.ok(conta);
		}
		return ResponseEntity.notFound().build();
    }

    @PostMapping("/contas")
     public ResponseEntity<Conta> cadastrarConta(@RequestBody Conta cadastrar){
          Conta conta = service.cadastrarConta(cadastrar);
          if(conta != null){
               return ResponseEntity.ok(conta);
          }
          return ResponseEntity.badRequest().build();
     }

     @PutMapping("/contas/")
     public ResponseEntity<Conta> atualizarCliente(@RequestBody Conta atualizar){
          Conta conta = service.atualizarConta(atualizar);
          if(conta != null){
               return ResponseEntity.ok(conta);
          }
          return ResponseEntity.badRequest().build();
     }
     
     @DeleteMapping("/contas/{id}")
     public ResponseEntity<Conta> deletarConta(@PathVariable Integer id){
          service.deletarConta(id);
          return ResponseEntity.ok(null);
     }


}
