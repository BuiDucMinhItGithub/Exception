package com.example.exception;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {

  private final ServiceA serviceA;

  public Controller(ServiceA serviceA) {
    this.serviceA = serviceA;
  }

  @GetMapping("/{number}")
  public String get(@PathVariable int number){
    return serviceA.business(number);
  }
}
