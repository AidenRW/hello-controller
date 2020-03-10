package com.galvanize.hellocontroller.controllers;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class HelloController {

    @RequestMapping ("/hello")

    public String hello(@RequestParam(required=false, default="World") String name){
        return String.format("Hello %s from my first Spring Boot Application!", name);
    }

    public String sayHello(){
        return "Hello World";
    }
}
