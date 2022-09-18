package br.com.hellobank.api.model.entidades;

import br.com.hellobank.api.model.enums.TipoTransferencia;
import com.fasterxml.jackson.annotation.JsonInclude;

//A anotação JsonInclude(JsonInclude.Include.NON_NULL) indica que a entidade Transacao
//será omitida caso seus atributos (tipoTransacao, valor, data, contaIdSaida e contaIdRecebe)
//sejam nulos.
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Transacao {

    private String tipoTransacao;
    private double valor;
    private String data;
    private Integer contaIdSaida;
    private Integer contaIdRecebe;

    public Transacao(Integer contaIdSaida, String data, double valor, TipoTransferencia tipo) {
        this.contaIdSaida = contaIdSaida;
        this.data = data;
        this.valor = valor;
        this.tipoTransacao = tipo.name();
    }

    public Transacao(TipoTransferencia tipo, Integer contaIdRecebe, String data, double valor) {
        this.contaIdRecebe = contaIdRecebe;
        this.data = data;
        this.valor = valor;
        this.tipoTransacao = tipo.name();
    }

    public Transacao(String data, double valor, TipoTransferencia tipo) {
        //this.contaIdSaida = contaIdSaida;
        this.data = data;
        this.valor = valor;
        this.tipoTransacao = tipo.name();
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
