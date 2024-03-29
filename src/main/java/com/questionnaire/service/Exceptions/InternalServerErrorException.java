package com.questionnaire.service.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR, reason = "SERVER IS UNDERGOING TECHNICAL ISSUES")
public class InternalServerErrorException extends Exception {
    public InternalServerErrorException (String message) {
        super(message);
    }
}