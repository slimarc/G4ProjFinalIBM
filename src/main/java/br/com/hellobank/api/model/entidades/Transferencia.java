package br.com.hellobank.api.model.entidades;

import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;

import br.com.hellobank.api.model.request.TransferenciaRequest;
import br.com.hellobank.api.util.DateHour;

@Entity
@Table(name = "transferencia")
public class Transferencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer contaIdSaida;
    private Integer contaIdRecebe;
    private LocalDateTime data;

    @Min(value = 0l)
    private double valor;

    public Transferencia(){}

    public Transferencia(TransferenciaRequest transferenciaRequest) {
        this.contaIdSaida = transferenciaRequest.getContaIdSaida();
		this.contaIdRecebe = transferenciaRequest.getContaIdRecebe();
		this.valor = transferenciaRequest.getValor();
		this.data = LocalDateTime.now();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Integer getContaIdSaida() {
        return contaIdSaida;
    }

    public void setContaIdSaida(Integer contaIdSaida) {
        this.contaIdSaida = contaIdSaida;
    }

    public Integer getContaIdRecebe() {
        return contaIdRecebe;
    }

    public void setContaIdRecebe(Integer contaIdRecebe) {
        this.contaIdRecebe = contaIdRecebe;
    }

    @Override
    public String toString() {
        return "Transferencia [contaIdRecebe=" + contaIdRecebe + ", contaIdSaida=" + contaIdSaida + ", data=" + data
                + ", id=" + id + ", valor=" + valor + "]";
    }

   
}
