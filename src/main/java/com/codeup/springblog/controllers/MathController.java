package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MathController {

    @GetMapping("/add/{numOne}/and/{numTwo}")
    @ResponseBody
    public int add(@PathVariable int numOne, @PathVariable int numTwo){
        return numOne + numTwo;
    }

    @GetMapping("/multiply/{numOne}/and/{numTwo}")
    @ResponseBody
    public int product(@PathVariable int numOne, @PathVariable int numTwo){
        return numTwo * numOne;
    }

    @GetMapping("/subtract/{numOne}/from/{numTwo}")
    @ResponseBody
    public int subtract(@PathVariable int numOne, @PathVariable int numTwo){
        return numTwo - numOne;
    }


    @GetMapping("/divide/{numOne}/by/{numTwo}")
    @ResponseBody
    public float divide(@PathVariable float numOne, @PathVariable float numTwo){
        return numOne/numTwo;
    }

    @GetMapping("/square/{numOne}")
    @ResponseBody
    public float square(@PathVariable float numOne){
        return numOne * numOne;
    }

    @GetMapping("/cube/{numOne}")
    @ResponseBody
    public float cubed(@PathVariable float numOne){
        return numOne * numOne * numOne;
    }


}
