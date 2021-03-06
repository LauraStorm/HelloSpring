package com.example.hellospring.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    //1.1 Exercise: Hello Spring
    @GetMapping("/welcome")
    public String hello(){
        return "Hello and welcome ";
    }

    //1.2 Exercise: Echo
    @GetMapping("/echo")
    public String echo (@RequestParam String input){        //parameter = Get
        return input;                                       //eks. : http://localhost:8080/echo?input=hej   --> så printer den 'hej
    }
}
