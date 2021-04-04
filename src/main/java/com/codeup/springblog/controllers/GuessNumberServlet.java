package com.codeup.springblog.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GuessNumberServlet {
    @GetMapping("/roll-dice")
    public String guess(){
        return "roll-dice";
    }


    @GetMapping("/roll-dice/{number}")
    @ResponseBody
    public String guessNumber(@PathVariable int number){

        return "The number you choose is: " + number;
    }



    @GetMapping("/roll-dice/{number}")
    @ResponseBody
    public String guessNumberDouble(@PathVariable double number){

        return "The number you choose is: " + number;
    }


}
