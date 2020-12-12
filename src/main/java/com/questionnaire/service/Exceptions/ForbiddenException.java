package com.questionnaire.service.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.FORBIDDEN, reason = "Forbidden")
public class ForbiddenException extends Exception {
    public ForbiddenException(String message) {
        super(message);
    }
}