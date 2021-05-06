package com.example.fatascode.springbootreactfullstack.student.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND) //404 Exception
public class StudentNotFoundException extends RuntimeException {
    public StudentNotFoundException(String msg) {
        super(msg);
    }
}
