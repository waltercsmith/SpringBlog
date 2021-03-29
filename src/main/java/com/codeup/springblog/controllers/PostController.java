package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostController {

    @GetMapping("/posts")
    @ResponseBody
    public String seeAllPosts(){
        return "All posts will display here!!";
    }

    @GetMapping("/posts/create")
    @ResponseBody
    public String viewPostForm(){
        return "You would come here to create a post.";
    }

    @PostMapping("/posts/create")
    @ResponseBody
    public String createPost(){
        return "You will submit your post here.";
    }
}
