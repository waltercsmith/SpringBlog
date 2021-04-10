package com.codeup.springblog.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AnotherPageController {


    @GetMapping("/anotherpage")
    public String anotherPage(){
        return "Hey, it's another page! Welcome!";
    }

}
