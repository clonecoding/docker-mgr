package com.jdddata.dockermgr.common.exception;

public class ValidatorException extends Exception {


    public ValidatorException(String message, Throwable cause) {
        super(message, cause);
    }

    public ValidatorException(String message) {
        super(message);
    }
}
