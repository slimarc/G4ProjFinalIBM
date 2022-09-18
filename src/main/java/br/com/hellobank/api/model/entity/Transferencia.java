package br.com.hellobank.api.model.entity;

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
@Table(name = "transferencia")
public class Transferencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idconta")
    private Integer idconta;

    @Column(name = "cliente_idcliente", length = 45, nullable = true)
    private Integer cliente_idcliente;

    @Column(name = "tipo", length = 45, nullable = false, unique = true)
    private Integer tipo;

    @Column(name = "saldo", length = 45, nullable = false, unique = true)
    private Double saldo;

    public Integer getidconta() {
        return idconta;
    }

    public void setidconta(Long Integer) {
        this.idconta = idconta;
    }

    public Integer getcliente_idcliente() {
        return cliente_idcliente;
    }

    public void setcliente_idcliente(Integer cliente_idcliente) {
        this.cliente_idcliente = cliente_idcliente;
    }

    public Integer gettipo() {
        return tipo;
    }

    public void settipo(Integer tipo) {
        this.tipo = tipo;
    }

    public Double getsaldo() {
        return  saldo;
    }

    public void setsaldo(Double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Transferencia{" +"idconta=" + idconta +", cliente_idcliente=" + cliente_idcliente +", tipo=" + tipo +", saldo=" + saldo +'}';
    }
}
