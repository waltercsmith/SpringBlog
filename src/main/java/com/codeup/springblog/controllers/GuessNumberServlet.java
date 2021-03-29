package com.codeup.springblog.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GuessNumberServlet {
    @GetMapping("/roll-dice")
    public String guess(){
        return "roll-dice";
    }

}
