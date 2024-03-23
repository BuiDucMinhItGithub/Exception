package com.example.exception;

import org.springframework.stereotype.Service;

@Service
public class ServiceA {

  public String business(int number){
    if (number > 2) {
      throw new NullPointerException("Can not find what you want");
    }
    return "okay";
  }
}
