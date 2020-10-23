package com.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/")
    public String homePage(){
        return "Hello world!";
    }

    @GetMapping("/user")
    public String user(){
        return "Hello all users!";
    }

    @GetMapping("/admin")
    public String admin(){
        return "Hello admin!";
    }

}
