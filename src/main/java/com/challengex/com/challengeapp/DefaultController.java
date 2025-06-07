package com.challengex.com.challengeapp;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/")
@RestController
public class DefaultController {

    @GetMapping
    public String sayHi() {
        return "Hi, Your Challenge Application Has Started";
    }
}
