package com.questionnaire.service;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST, reason = "Username or password not found")
public class BadRequestException extends Exception {
    public BadRequestException(String message) {
        super(message);
    }
}