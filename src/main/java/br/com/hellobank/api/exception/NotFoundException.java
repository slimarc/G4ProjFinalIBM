package br.com.hellobank.api.exception;

public class NotFoundException {
    
    private String field;
    private String error;

    public NotFoundException(String error, String response, String field) {
        super(response);
        this.field = field;
        this.error = error;
    }

    public NotFoundException(String response) {
        super(response);
    }

    public String getField() {
        return this.field;
    }

    public String getError() {
        return error;
    }
}
