package br.com.vitor.minishop.exception.dtos;

public class ErrorResponseBase {

    private Integer code;
    private String message;

    public ErrorResponseBase(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}