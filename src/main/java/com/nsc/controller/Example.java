package com.nsc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Example")
public class Example {
    @RequestMapping("/test")
    public String test(){
        return "Fuck!!!!!!";
    }
}
