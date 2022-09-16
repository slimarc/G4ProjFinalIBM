package br.com.hellobank.api.exception;

public class BusinessException {
    private String field;
    private String error;

    public BusinessException(String error, String response, String field) {
        super();
        this.field = field;
        this.error = error;
    }

    public BusinessException(String error, String response) {
        super();
        this.error = error;
    }

    public BusinessException(String response) {
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
