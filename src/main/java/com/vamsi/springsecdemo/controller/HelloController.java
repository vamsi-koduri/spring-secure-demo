package com.vamsi.springsecdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String greet(){
        return "Hello world";
    }

    @GetMapping("/about")
    public String about(){
        return "vamsi";
    }

}
