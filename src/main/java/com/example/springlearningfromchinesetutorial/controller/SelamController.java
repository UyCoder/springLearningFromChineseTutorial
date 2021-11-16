package com.example.springlearningfromchinesetutorial.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

// Buradaki return yapilan datalar browser'e yazdiralacak
//@ResponseBody
//@Controller
@RestController

public class SelamController {

    @RequestMapping("/selam")
    public String hello() {
        return "Selam alaykum!";
    }
}
