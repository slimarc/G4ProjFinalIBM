package br.com.hellobank.api.models.request;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class TransferenciaRequest {

    @NotBlank(message = "O campo deve ser informado")
    private Long saidaContaId;

    @NotBlank(message = "O campo deve ser informado")
    private Long recebeContaId;

    @NotBlank(message = "O campo deve ser informado")
    @Min(1)
    private double valor;

    @JsonCreator(mode = JsonCreator.Mode.DEFAULT)
    public TransferenciaRequest(
            @JsonProperty("saidaContaId") Long saidaContaId,
            @JsonProperty("recebeContaId") Long recebeContaId,
            @JsonProperty("valor") double valor) {
        this.saidaContaId = saidaContaId;
        this.recebeContaId = recebeContaId;
        this.valor = valor;
    }

    public Long getSaidaContaId() {
        return saidaContaId;
    }

    public void setSaidaContaId(Long saidaContaId) {
        this.saidaContaId = saidaContaId;
    }

    public Long getRecebeContaId() {
        return recebeContaId;
    }

    public void setRecebeContaId(Long recebeContaId) {
        this.recebeContaId = recebeContaId;
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
                "saidaContaId=" + saidaContaId +
                ", recebeContaId=" + recebeContaId +
                ", valor=" + valor +
                '}';
    }
}
