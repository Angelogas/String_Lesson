package com.luv2code.springbootdemo.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class FunRestController {
    // expose '/' the return "Hello World"
    @GetMapping("/")
    public String sayHello() {
        return "Hello World! Time on server is "+ LocalDateTime.now();
    }
}