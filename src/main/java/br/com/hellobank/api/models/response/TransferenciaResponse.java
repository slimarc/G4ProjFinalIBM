package br.com.hellobank.api.models.response;

import br.com.hellobank.api.models.enums.TipoTransferencia;

public class TransferenciaResponse {

    private String tipoTransferencia;
    private Long contaIdSaida;
    private Long contaIdRecebe;
    private double valor;
    private String data;

    public TransferenciaResponse(Long contaIdSaida, Long contaIdRecebe, double valor, String data, TipoTransferencia tipoTransferencia) {
        this.tipoTransferencia = tipoTransferencia.name();
        this.contaIdSaida = contaIdSaida;
        this.contaIdRecebe = contaIdRecebe;
        this.valor = valor;
        this.data = data;
    }

    public String getTipoTransferencia() {
        return tipoTransferencia;
    }

    public void setTipoTransferencia(String tipoTransferencia) {
        this.tipoTransferencia = tipoTransferencia;
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

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "TransferenciaResponse{" +
                "tipoTransferencia='" + tipoTransferencia + '\'' +
                ", contaIdSaida=" + contaIdSaida +
                ", contaIdRecebe=" + contaIdRecebe +
                ", valor=" + valor +
                ", data=" + data +
                '}';
    }
}
