package br.com.hellobank.api.models.request;

import java.util.Objects;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class DepositoRequest {

    @NotBlank(message = "Informe o id da conta para receber deposito")
    private Long contaId;

    @NotBlank(message = "Insira o valor do deposito")
    @Pattern(regexp = "^(?:[1-9]\\d*|0)?(?:\\.\\d+)?$\n", message = "O valor não é válido.")
    private double valor;

    @JsonCreator(mode = JsonCreator.Mode.DEFAULT)
    public DepositoRequest(
            @JsonProperty("contaId") Long contaId,
            @JsonProperty("valor") double valor) {
        this.contaId = contaId;
        this.valor = valor;
    }

    public Long getContaId() {
        return contaId;
    }

    public void setContaId(Long contaId) {
        this.contaId = contaId;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DepositoRequest that = (DepositoRequest) o;
        return Double.compare(that.valor, valor) == 0 && Objects.equals(contaId, that.contaId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contaId, valor);
    }

    @Override
    public String toString() {
        return "DepositoRequest{" + "contaId=" + contaId + ", valor=" + valor + '}';
    }
}

