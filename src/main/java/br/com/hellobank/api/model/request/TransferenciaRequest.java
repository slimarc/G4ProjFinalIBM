package br.com.hellobank.api.model.request;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class TransferenciaRequest {

    @NotBlank(message = "Informe a conta de origem para a Transferência!")
    private Integer contaIdSaida;

    @NotBlank(message = "Informe a conta de destino para a Transferência!")
    private Integer contaIdRecebe;

    @NotBlank(message = "O campo deve ser informado!")
    @Min(1)
    private double valor;

    @JsonCreator(mode = JsonCreator.Mode.DEFAULT)
    public TransferenciaRequest(
        @JsonProperty("saidaContaId") Integer contaIdSaida,
        @JsonProperty("recebeContaId") Integer contaIdRecebe,
        @JsonProperty("valor") double valor) {
        this.contaIdSaida = contaIdSaida;
        this.contaIdRecebe = contaIdRecebe;
        this.valor = valor;
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



    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "TransferenciaRequest{" +
                "saidaContaId=" + contaIdSaida +
                ", recebeContaId=" + contaIdRecebe +
                ", valor=" + valor +
                '}';
    }
}
