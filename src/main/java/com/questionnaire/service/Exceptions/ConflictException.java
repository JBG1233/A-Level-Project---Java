package com.questionnaire.service.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.CONFLICT, reason = "User already Exists")
public class ConflictException extends Exception {
        public ConflictException(String message) {
                super(message);
        }
}

