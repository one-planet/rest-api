package com.example.creditapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreditController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, world!";
    }

    @PostMapping("/echo")
    public String echo(@RequestBody String message) {
        return message;
    }
}