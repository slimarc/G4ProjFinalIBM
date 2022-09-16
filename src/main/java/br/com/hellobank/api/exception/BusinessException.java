package br.com.hellobank.api.exception;

public class BusinessException {
    private String field;
    private String error;

    public BusinessException(String error, String response, String field) {
        super(response);
        this.field = field;
        this.error = error;
    }

    public BusinessException(String error, String response) {
        super(response);
        this.error = error;
    }

    public BusinessException(String response) {
        super(response);
    }

    public String getField() {
        return this.field;
    }

    public String getError() {
        return error;
    }
}
