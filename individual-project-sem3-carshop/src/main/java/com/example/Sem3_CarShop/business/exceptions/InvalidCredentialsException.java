package com.example.Sem3_CarShop.business.exceptions;

import lombok.Generated;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

@Generated
public class InvalidCredentialsException extends ResponseStatusException {
    public InvalidCredentialsException() {
            super(HttpStatus.BAD_REQUEST, "INVALID_CREDENTIALS");
        }
    }
