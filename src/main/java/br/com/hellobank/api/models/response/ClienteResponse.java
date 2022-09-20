package br.com.hellobank.api.models.response;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;



public class ClienteResponse {

    private String nome;

    private String cpf;
    
    private String rg;
    
    private String telefone;

    private String email;

    private Long contaId;

    @JsonCreator(mode = JsonCreator.Mode.DEFAULT)
    public ClienteResponse(
            @JsonProperty("nome") String nome,
            @JsonProperty("cpf") String cpf,
            @JsonProperty("rg") String rg,
            @JsonProperty("telefone") String telefone,
            @JsonProperty("email") String email,
            @JsonProperty("conta") Long contaId) {

        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.telefone = telefone;
        this.email = email;
        this.contaId = contaId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }


    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getContaId() {
        return contaId;
    }

    public void setContaId(Long contaId) {
        this.contaId = contaId;
    }
}
