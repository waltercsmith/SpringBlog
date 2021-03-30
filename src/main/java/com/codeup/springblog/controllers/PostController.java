package com.codeup.springblog.controllers;

import com.codeup.springblog.repo.BlogPostRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostController {


    private final BlogPostRepository blogDao;

    public PostController(BlogPostRepository blogDao){
        this.blogDao = blogDao;
    }

    @GetMapping("/blogposts")
    public String index(Model model){
        model.addAttribute("blogposts", blogDao.findAll());
        return "blogposts/index";
    }
//    Used dependency injection to use a instance of the new BlogPostRepository interface

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
