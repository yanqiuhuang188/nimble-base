package com.nimble.common.exception;


import com.nimble.common.constants.responseCode.ResponseCodeInterface;

public class BaseException extends RuntimeException {

    private String code;
    private String description;

    public BaseException(ResponseCodeInterface responseCode, Throwable cause) {
        super(responseCode.toString(), cause);
        this.code = responseCode.getCode();
        this.description = responseCode.getDescription();
    }

    public BaseException(String code, String description, Throwable cause) {
        super("[ " + code + " ] : " + description, cause);
        this.code = code;
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

}
