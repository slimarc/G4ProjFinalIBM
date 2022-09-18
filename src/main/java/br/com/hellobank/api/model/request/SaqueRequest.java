package br.com.hellobank.api.model.request;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SaqueRequest {

    @NotBlank(message = "O campo deve ser informado!")
    private Integer contaId;

    @NotBlank(message = "O campo deve ser informado!")
    @Min(1)
    private double valor;

    @JsonCreator(mode = JsonCreator.Mode.DEFAULT)
    public SaqueRequest(
        @JsonProperty("contaId") @NotBlank(message = "O campo deve ser informado!") Integer contaId,
        @JsonProperty("valor") double valor) {
        this.contaId = contaId;
        this.valor = valor;
    }

    public @NotBlank(message = "O campo deve ser informado!") Integer getContaId() {
        return contaId;
    }

    public void setContaId(@NotBlank(message = "O campo deve ser informado!") Integer contaId) {
        this.contaId = contaId;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "SaqueRequest{" +
                "contaId=" + contaId +
                ", valor=" + valor +
                '}';
    }
}
