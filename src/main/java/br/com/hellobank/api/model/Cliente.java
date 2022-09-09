package br.com.hellobank.api.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Column(name = "id_cliente")
    private Integer id;
    
    @Column(name = "nome", length = 45, nullable = false)
    private String nome;

    @Column(name = "cpf", length = 45, nullable = false, unique = true)
    private String cpf;

    @Column(name = "rg", length = 45, nullable = false, unique = true)
    private String rg;
    
    @Column(name = "dataNascimento")
    private LocalDate dataNasc ;

    @Column(name = "telefone", length = 45, nullable = false)
    private String telefone;

    @Column(name = "email", length = 45, nullable =  false, unique = true)
    private String email;

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
