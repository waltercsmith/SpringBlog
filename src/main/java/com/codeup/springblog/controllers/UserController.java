package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @GetMapping("/profile-test")
    @ResponseBody
    public String profileTest(){return "This is the profile page";}

    @GetMapping("/profile")
    public String profilePageView(){return "profile";}

}
