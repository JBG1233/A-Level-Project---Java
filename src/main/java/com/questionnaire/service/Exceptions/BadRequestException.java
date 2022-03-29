package com.questionnaire.service.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST, reason = "BAD INPUT - FAILED VALIDATION")
public class BadRequestException extends Exception {
    public BadRequestException(String message) {
        super(message);
    }
}