package br.com.hellobank.api.model.response;

public class DepositoResponse {
    private double valor;
    private String data;
    private String tipoTransferencia;

    public DepositoResponse(double valor, String data, String tipoTransferencia) {
        this.valor = valor;
        this.data = data;
        this.tipoTransferencia = tipoTransferencia;
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

    @Override
    public String toString() {
        return "DepositoResponse{" +
                ", valor=" + valor +
                ", data=" + data +
                ", tipoTransferencia='" + tipoTransferencia + '\'' +
                '}';
    }
    
}
