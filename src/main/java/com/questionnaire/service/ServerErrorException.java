package com.questionnaire.service;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR, reason = "Internal Server Error")
public class ServerErrorException extends Exception {
    public ServerErrorException(String message) {
        super(message);
    }
}
