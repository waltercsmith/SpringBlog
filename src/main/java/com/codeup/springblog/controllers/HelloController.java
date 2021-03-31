package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@Controller
public class HelloController {

//    @GetMapping("/hello")
//    @ResponseBody
//    public String sayHello(){
//        return "Hello from Spring";
//    }

//    @GetMapping("/hello/{name}")
//    @ResponseBody
//    public String sayHello(@PathVariable String name) {
//        return "Hello " + name + "!";
//    }

//    @RequestMapping("/increment/{number}")
//    @ResponseBody
//    public String addOne(@PathVariable int number) {
//        return number + " plus one is " + (number + 1) + "!";
//    }



    @GetMapping("/hello/{name}")
    public String sayHello(@PathVariable String name, Model model){
//        model.addAttribute("name", name);

        List<String> names = new ArrayList<>();

        names.add("Sam");
        names.add("Dorian");
        names.add("Diego");

        model.addAttribute("aName", name.toUpperCase());
        model.addAttribute("admin", name.equals("fer"));
        model.addAttribute("nameList", names);

        return "hello";


    }

    @GetMapping("/join")
    public String showJoinForm() {
        return "join";
    }

    @PostMapping("/join/")
    public String joinCohort(@RequestParam(name = "cohort") String cohort, Model model) {
        model.addAttribute("cohort", "Welcome to " + cohort + "!");
        return "join";
    }

}
