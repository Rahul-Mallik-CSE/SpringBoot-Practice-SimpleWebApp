package com.rahul.SimpleWebApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {
    
    @RequestMapping("/")
    public String greet(){
        return "Welcome to Sprint Boot Practice Project";
    }



}
