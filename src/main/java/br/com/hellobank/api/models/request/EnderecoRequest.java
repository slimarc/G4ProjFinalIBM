package br.com.hellobank.api.models.request;

import java.util.Objects;

import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class EnderecoRequest {

    
    @NotBlank(message = "O campo logradouro deve ser informado")
    private String logradouro;

    @NotBlank(message = "O campo numero deve ser informado")
    private String numero;

    @NotBlank(message = "O campo bairro deve ser informado")
    private String bairro;

    @NotBlank(message = "O campo cidade deve ser informado")
    private String cidade;

    @NotBlank(message = "O campo UF deve ser informado")
    private String uf;

    @NotBlank(message = "O campo CEP deve ser informado")
    private String cep;

    @NotBlank(message = "O campo cliente deve ser informado")
    private Integer cliente;

    @JsonCreator(mode = JsonCreator.Mode.DEFAULT)
    public EnderecoRequest(
            @JsonProperty("logradouro") String logradouro,
            @JsonProperty("numero") String numero,
            @JsonProperty("bairro") String bairro,
            @JsonProperty("cidade") String cidade,
            @JsonProperty("uf") String uf,
            @JsonProperty("cep") String cep,
            @JsonProperty("cliente") Integer cliente) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
        this.cep = cep;
        this.cliente = cliente;
    }

    
    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Integer getCliente() {
        return cliente;
    }

    public void setCliente(Integer cliente) {
        this.cliente = cliente;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EnderecoRequest that = (EnderecoRequest) o;
        return Objects.equals(logradouro, that.logradouro) &&
               Objects.equals(numero, that.numero)   && 
               Objects.equals(bairro, that.bairro)   && 
               Objects.equals(cidade, that.cidade)   && 
               Objects.equals(uf, that.uf)           && 
               Objects.equals(cep, that.cep)         && 
               Objects.equals(cliente, that.cliente); 
    }

    @Override
    public int hashCode() {
        return Objects.hash(logradouro, numero, bairro, cidade, uf, cep, cliente);
    }

    @Override
    public String toString() {
        return "EnderecoRequest{" +
                "logradouro='" + logradouro + '\'' +
                ", numero='" + numero + '\'' +
                ", bairro='" + bairro + '\'' +
                ", cidade='" + cidade + '\'' +
                ", uf='" + uf + '\'' +
                ", cep='" + cep + '\'' +
                ", cliente='" + cliente + '\'' +
                '}';
    }
}
