package com.fisa.reliefmap_backend.common.response;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fisa.reliefmap_backend.common.response.status.ResponseStatus;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@JsonPropertyOrder({"code", "status", "message"})
public class BaseErrorResponse implements ResponseStatus {

    private final int code;
    private final HttpStatus status;
    private final String message;

    public BaseErrorResponse(ResponseStatus status) {
        this.code = status.getCode();
        this.status = status.getStatus();
        this.message = status.getMessage();
    }

    public BaseErrorResponse(ResponseStatus status, String message) {
        this.code = status.getCode();
        this.status = status.getStatus();
        this.message = message;
    }

    @Override
    public int getCode() {
        return code;
    }

    @Override
    public HttpStatus getStatus() {
        return status;
    }

    @Override
    public String getMessage() {
        return message;
    }
}