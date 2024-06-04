package com.tuuniversidad.demo.exception;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

public class LibroException extends RuntimeException {
    public LibroException(String message) {
        super(message);
    }
}