package br.com.hellobank.api.models.request;

import java.util.Objects;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;


import org.hibernate.validator.constraints.br.CPF;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ClienteRequest {

    @NotBlank(message = "O campo nome de ser informado")
    private String nome;

    @CPF(message = "O CPF informado está inválido")
    @NotBlank(message = "O campo cpf deve ser informado")
    private String cpf;

    @NotBlank(message = "O campo rg deve ser informado")
    private String rg;

    @NotBlank(message = "O campo telefone deve ser informado")
    private String telefone;

    @Email(message = "O email informado está inválido")
    @NotBlank(message = "O campo do email deve ser informado")
    private String email;


    @JsonCreator(mode = JsonCreator.Mode.DEFAULT)
    public ClienteRequest(
            @JsonProperty("nome") String nome,
            @JsonProperty("cpf") String cpf,
            @JsonProperty("rg") String rg,
            @JsonProperty("telefone") String telefone,
            @JsonProperty("email") String email){
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.telefone = telefone;
        this.email = email;
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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClienteRequest that = (ClienteRequest) o;
        return Objects.equals(nome, that.nome) &&
               Objects.equals(cpf, that.cpf)   && 
               Objects.equals(rg, that.rg)   && 
               Objects.equals(telefone, that.telefone)   && 
               Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, cpf, rg, telefone, email);
    }

    @Override
    public String toString() {
        return "ClienteRequest{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", rg='" + rg + '\'' +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }


}
