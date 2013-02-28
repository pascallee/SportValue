package com.tinubu.first.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author Pascal Lee
 */
@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class UserFileTechnicalException extends RuntimeException{

    public UserFileTechnicalException() {
    }

    public UserFileTechnicalException(String s) {
        super(s);
    }

    public UserFileTechnicalException(String s, Throwable throwable) {
        super(s, throwable);
    }

    public UserFileTechnicalException(Throwable throwable) {
        super(throwable);
    }
}
