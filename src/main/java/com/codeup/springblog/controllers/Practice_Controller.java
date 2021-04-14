package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

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
}
