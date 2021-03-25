package com.codeup.springblog;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

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



}
