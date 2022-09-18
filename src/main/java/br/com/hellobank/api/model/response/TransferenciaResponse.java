package br.com.hellobank.api.model.response;

import br.com.hellobank.api.model.enums.TipoTransferencia;

public class TransferenciaResponse {
    private String tipoTransferencia;
    private Integer contaIdSaida;
    private Integer contaIdRecebe;
    private double valor;
    private String data;

  
    public TransferenciaResponse(Integer contaIdSaida, Integer contaIdRecebe, double valor, String data, TipoTransferencia tipoTransferencia) {
        this.tipoTransferencia = tipoTransferencia.name();
        this.contaIdSaida = contaIdSaida;
        this.contaIdRecebe = contaIdRecebe;
        this.valor = valor;
        this.data = data;
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

    public String getTipoTransferencia() {
        return tipoTransferencia;
    }

    public void setTipoTransferencia(String tipoTransferencia) {
        this.tipoTransferencia = tipoTransferencia;
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
        return "TransferenciaResponse{" +
                "tipoTransferencia='" + tipoTransferencia + '\'' +
                ", contaIdSaida=" + contaIdSaida +
                ", contaIdRecebe=" + contaIdRecebe +
                ", valor=" + valor +
                ", data=" + data +
                '}';
    }

  
}
