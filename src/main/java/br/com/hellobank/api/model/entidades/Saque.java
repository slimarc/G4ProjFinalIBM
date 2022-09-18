package br.com.hellobank.api.model.entidades;

import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.hellobank.api.util.DateHour;

@Entity
@Table(name = "saque")
public class Saque {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer contaId;
    private double valor;
    private LocalDateTime data;

    public Saque(){}

    public Saque(Integer contaId, double valor) {
        this.contaId = contaId;
        this.valor = valor;
        this.data = LocalDateTime.now();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getContaId() {
        return contaId;
    }

    public void setContaId(Integer contaId) {
        this.contaId = contaId;
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
        return "Saque{" +"id=" + id +", contaId=" + contaId +", valor=" + valor +", data=" + data +'}';
    }
}
