package com.likelion.springsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.GeneratedValue;

@Controller
public class WebController {
    @GetMapping(value={"/","/home"})
    public String homepage(){
        return "home";
    }
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
}
