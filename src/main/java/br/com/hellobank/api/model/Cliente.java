package br.com.hellobank.api.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "Cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Column(name = "idcliente")
    private Integer id;
    
    @Column(name = "nome", length = 45, nullable = false)
    private String nome;

    @Column(name = "cpf", length = 45, nullable = false, unique = true)
    private String cpf;

    @Column(name = "rg", length = 45, nullable = false, unique = true)
    private String rg;
    
    @Column(name = "data_nascimento")
    private LocalDate dataNasc ;

    @Column(name = "tel", length = 45, nullable = false)
    private String telefone;

    @Column(name = "email", length = 45, nullable =  false, unique = true)
    private String email;

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("cliente")
    private List<Endereco> listaEndereco;

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("cliente")
    private List<Conta> listaConta;

    public List<Conta> getlistaConta() {
        return listaConta;
    }

    public void setlistaConta(List<Conta> listaConta) {
        this.listaConta = listaConta;
    }

    public List<Endereco> getListaEndereco() {
        return listaEndereco;
    }

    public void setListaEndereco(List<Endereco> listaEndereco) {
        this.listaEndereco = listaEndereco;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public LocalDate getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(LocalDate dataNasc) {
        this.dataNasc = dataNasc;
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
    public String toString() {
        return "Cliente [cpf=" + cpf + ", dataNasc=" + dataNasc + ", email=" + email + ", id=" + id + ", nome=" + nome
                + ", rg=" + rg + ", telefone=" + telefone + "]";
    }

    
    
}
