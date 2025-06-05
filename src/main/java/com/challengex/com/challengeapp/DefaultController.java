package com.challengex.com.challengeapp;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {

    @GetMapping("/")
    public String sayHi() {
        return "Hi, Your Application Has Started";
    }
}
