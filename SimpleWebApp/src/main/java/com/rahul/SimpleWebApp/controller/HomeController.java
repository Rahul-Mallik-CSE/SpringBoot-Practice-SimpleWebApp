package com.rahul.SimpleWebApp.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {
    
    @RequestMapping("/")
    public String greet(){
        return "Welcome to Spring Boot Practice Project";
    }

    @RequestMapping("/about")
    public String about(){
        return "I am doing this project to learn Spring Boot Framework";
    }



}
