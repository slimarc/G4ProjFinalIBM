package br.com.hellobank.api.models.entidades;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.com.hellobank.api.util.DateHour;

@Entity
public class Conta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "data_criacao")
    private LocalDateTime dataCriacao;

    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Conta() {
    }

    public Conta(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
        this.saldo = 0;
    }

    public Conta(LocalDateTime dataCriacao, double saldo) {
        this.dataCriacao = dataCriacao;
        this.saldo = saldo;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setdataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public String getdataCriacao() {
        return DateHour.format(dataCriacao);
    }

    public void deposito(double value) {
        this.saldo += value;
    }

    public void saque(double value) {
        this.saldo -= value;
    }

    @Override
    public String toString() {
        return "Conta{" +"id=" + id +", dataCriacao=" + dataCriacao +", saldo=" + saldo +'}';
    }
}
