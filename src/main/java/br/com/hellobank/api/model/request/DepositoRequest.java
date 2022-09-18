package br.com.hellobank.api.model.request;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class DepositoRequest {

    //NotBlank indica que os atibutos contaId e valor não podem estar em branco
    @NotBlank(message = "Informe a conta de destino para o Deposito!")
    private Integer contaId;

    @NotBlank(message = "O campo deve ser preenchido!")
    @Min(1)
    private double valor;

    @JsonCreator(mode = JsonCreator.Mode.DEFAULT)
    public DepositoRequest(
        @JsonProperty("contaId") @NotBlank(message = "O dinheiro vai ser depositado em qual conta?") Integer contaId,
        @JsonProperty("valor") double valor) {
        this.contaId = contaId;
        this.valor = valor;
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

    @Override
    public String toString() {
        return "DepositoRequest{" +
                "contaId=" + contaId +
                ", valor=" + valor +
                '}';
    }
}
