package br.com.hellobank.api.service.implement;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.hellobank.api.dao.ContaDAO;
import br.com.hellobank.api.model.entidades.Conta;
import br.com.hellobank.api.service.interfaceServ.IContaService;

@Service
public class ContaService implements IContaService {

    @Autowired
    private ContaDAO dao;
    
     //GET
     @Override
     public ArrayList<Conta> listarContas() {
         return (ArrayList<Conta>) dao.findAll();
     }
     
     @Override
     public Conta listarContaPeloId(Integer id) {
         return dao.findById(id).orElse(null);
     }
      
     //POST
    @Override
     public Conta cadastrarConta(Conta cadastrar) {
         return dao.save(cadastrar);
     }


    //PUT
    @Override
    public Conta atualizarConta(Conta atualizar) {
        return dao.save(atualizar);
    }

    //DELETE
    @Override
    public void deletarConta(Integer id) {
        dao.deleteById(id);
    }

}
