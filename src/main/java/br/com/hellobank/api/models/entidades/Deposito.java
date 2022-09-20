package br.com.hellobank.api.models.entidades;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.com.hellobank.api.models.request.DepositoRequest;
import br.com.hellobank.api.util.DateHour;

@Entity
public class Deposito {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long id_conta;
    private double valor;
    private LocalDateTime data;

    public Deposito(){}

    public Deposito(DepositoRequest depositoRequest) {
        this.id_conta = depositoRequest.getContaId();
        this.valor = depositoRequest.getValor();
        this.data = LocalDateTime.now();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId_conta() {
        return id_conta;
    }

    public void setId_conta(Long id_conta) {
        this.id_conta = id_conta;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getData() {
        return DateHour.format(data);
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Deposito{" +"id=" + id +", id_conta=" + id_conta + ", valor=" + valor +", data_deposito=" + data +'}';
    }
}
