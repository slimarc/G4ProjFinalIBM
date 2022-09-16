package br.com.hellobank.api.model.entity;

import br.com.hellobank.api.model.enums.TipoTransferencia;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Transacao {

    private String tipoTransacao;
    private double valor;
    private String data;
    private Long contaIdSaida;
    private Long contaIdRecebe;

    public Transacao(Long contaIdSaida, String data, double valor, TipoTransferencia tipo) {
        this.contaIdSaida = contaIdSaida;
        this.data = data;
        this.valor = valor;
        this.tipoTransacao = tipo.name();
    }

    public Transacao(TipoTransferencia tipo, Long contaIdRecebe, String data, double valor) {
        this.contaIdRecebe = contaIdRecebe;
        this.data = data;
        this.valor = valor;
        this.tipoTransacao = tipo.name();
    }

    public Transacao(String data, double valor, TipoTransferencia tipo) {
        this.contaIdSaida = contaIdSaida;
        this.data = data;
        this.valor = valor;
        this.tipoTransacao = tipo.name();
    }

    public Long getContaIdSaida() {
        return contaIdSaida;
    }

    public void setContaIdSaida(Long contaIdSaida) {
        this.contaIdSaida = contaIdSaida;
    }

    public Long getContaIdRecebe() {
        return contaIdRecebe;
    }

    public void setContaIdRecebe(Long contaIdRecebe) {
        this.contaIdRecebe = contaIdRecebe;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getTipoTransacao() {
        return tipoTransacao;
    }

    public void setTipoTransacao(String tipoTransacao) {
        this.tipoTransacao = tipoTransacao;
    }

    @Override
    public String toString() {
        return "Transação{" +
                "  contaIdSaida=" + contaIdSaida +
                ", contaIdRecebe=" + contaIdRecebe +
                ", data=" + data +
                ", valor=" + valor +
                '}';
    }
}
