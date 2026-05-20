package com.example.helpdesk;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControler {

   //@GetMapping("/")
    public String hello() {
        return "Hello, Help Desk!";
    }
}