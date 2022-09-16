package br.com.hellobank.api.exception;

public class NotFoundException {
    
    private String field;
    private String error;

    public NotFoundException(String error, String response, String field) {
        super();
        this.field = field;
        this.error = error;
    }

    public NotFoundException(String response) {
        super();
    }

    public String getField() {
        return this.field;
    }

    public String getError() {
        return error;
    }

	public String getMessage() {
		return null;
	}
}
