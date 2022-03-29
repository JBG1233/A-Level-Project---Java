package com.questionnaire.service.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.CONFLICT, reason = "CONFLICT WITH AN EXISTING OBJECT IN DATABASE")
public class ConflictException extends Exception {
        public ConflictException(String message) {
                super(message);
        }
}

