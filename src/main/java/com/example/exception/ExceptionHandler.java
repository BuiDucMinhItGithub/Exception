package com.example.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class ExceptionHandler {

  @org.springframework.web.bind.annotation.ExceptionHandler(NullPointerException.class)
  @ResponseStatus(HttpStatus.NOT_FOUND)
  public Map<String, String> handlerException(NullPointerException e){
    HashMap<String, String> errors = new HashMap<>();
    errors.put("Message ",e.getMessage());
    errors.put("Status ", String.valueOf(HttpStatus.NOT_FOUND.value()));
    return errors;
  }
}
