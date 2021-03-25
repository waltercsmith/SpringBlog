package com.codeup.springblog;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class PostController {

    @GetMapping("/posts")
    @ResponseBody
    public String seeAllPosts(){
        return "All posts will display here!!";
    }


}
