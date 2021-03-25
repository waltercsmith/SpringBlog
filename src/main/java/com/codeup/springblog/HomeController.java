package com.codeup.springblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller //Defining a controller
public class HomeController {



//    This defines what routes the controller responds to
//    This code defines a controller that responds to the requests for "/hello"

    @GetMapping("/hello")
    @ResponseBody
    public String hello(){
        return "Hello from Spring";
    }
}
