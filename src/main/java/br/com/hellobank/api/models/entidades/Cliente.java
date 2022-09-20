package br.com.hellobank.api.models.entidades;

import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String cpf;

    @Column(name = "conta_id")
    private Long contaId;

    private String nome;

    @Column(unique= true)
    private String rg;

    @Column(unique= true)
    private String telefone;

    @Column(unique= true)
    private String email;

    @OneToMany(mappedBy = "cliente")
	@JsonIgnoreProperties("cliente")
    private List<Endereco> listaEndereco;

    public Cliente() {
    }

    public Cliente(String cpf, String nome, String rg, String telefone, String email) {
        this.cpf = cpf;
        this.nome = nome;
        this.rg = rg;
        this.telefone = telefone;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Long getContaId() {
        return contaId;
    }

    public void setContaId(Long contaId) {
        this.contaId = contaId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public List<Endereco> getListaEndereco() {
        return listaEndereco;
    }

    public void setListaEndereco(List<Endereco> listaEndereco) {
        this.listaEndereco = listaEndereco;
    }

    @Override
    public String toString() {
        return "cliente{" + "id=" + id + ", contaId=" + contaId + ", cpf='" + cpf + '\'' + ", nome='" + nome + '\''  + ", rg='" + rg + '\'' + ", telefone='" + telefone + '\'' + ", email='" + email + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return  Objects.equals(id, cliente.id) &&
                Objects.equals(cpf, cliente.cpf) &&
                Objects.equals(contaId, cliente.contaId) &&
                Objects.equals(nome, cliente.nome) &&
                Objects.equals(rg, cliente.rg) &&
                Objects.equals(telefone, cliente.telefone) &&
                Objects.equals(email, cliente.email); 
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, contaId, cpf, nome, rg, telefone, email);
    }
}
