package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Practice_Controller {

    @GetMapping("/practice")
    public String showFrame(){
        return "practice/frame";
    }

    @GetMapping("/practice/{name}")
    public String addPlaceholder(@PathVariable String name, Model model){
        model.addAttribute("name", name);
        return "practice/frame";
    }

    @GetMapping("/join")
    public String showJoinForm(){
        return "practice/join";
    }

    @PostMapping("/join")
    public String joinCohort(@RequestParam(name = "cohort") String cohort, Model model){
        model.addAttribute("cohort", "Welcome to " + cohort + "!");

        return "practice/join";
    }
}
