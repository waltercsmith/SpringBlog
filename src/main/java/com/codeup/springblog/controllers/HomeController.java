package com.codeup.springblog.controllers;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {


    @GetMapping("/")
    public String welcome() {
        return "home";
    }

    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return "This is the landing page!";
    }


    @GetMapping("/hello/test")
    @ResponseBody
//    public String hey() {
//        return "More text (testing purposes)";
//    }


//    @GetMapping("hello")
//    @ResponseBody
//    public String hello(){
//        return ""
//    }

//    @GetMapping("/hello/test")
//    @ResponseBody
//    public String hey() {
//        return "More text (testing purposes)";
//    }
//}

    @GetMapping("/form")
    public String form() {
        return "practice/form";
    }

}


