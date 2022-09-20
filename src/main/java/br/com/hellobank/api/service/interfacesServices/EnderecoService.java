package br.com.hellobank.api.service.interfacesServices;

import java.util.ArrayList;

import br.com.hellobank.api.models.entidades.Endereco;

public interface EnderecoService {
    
    ArrayList<Endereco> listarTodos();
    ArrayList<Endereco> listarPeloCep(String cep);
    Endereco cadastarNovo(Endereco cadastrar);
    Endereco atualizarCliente(Endereco atualiza);
    void deletarEndereco(Long idEndereco);
}
 