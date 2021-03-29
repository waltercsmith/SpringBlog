package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller //Defining a controller
public class HomeController {



//    This defines what routes the controller responds to
//    This code defines a controller that responds to the requests for "/hello"


//
//    @GetMapping("/")
//    @ResponseBody
//    public String hello(){
//        return "This is a landing page";
//    }


//    Returns a view
    @GetMapping("/home")
    public String welcome() {
        return "home";
    }



}