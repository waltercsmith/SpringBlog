package com.codeup.springblog.controllers;

import com.codeup.springblog.models.BlogPost;
import com.codeup.springblog.repo.BlogPostRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostController {

//    @GetMapping("/posts")
//    @ResponseBody
//    public String indexPage(){
//        return "posts index page";
//    }
//
//    @GetMapping("/posts/{id}")
//    @ResponseBody
//    public String indvidualPost(@PathVariable String id){
//
//        return "view an individual post";
//    }
//
//    @GetMapping("/posts/create")
//    @ResponseBody
//    public String viewCreatePostForm(){
//
//        return "view the form for creating a post";
//    }
//
//    @PostMapping("/posts")
//    @ResponseBody
//    public String createPost(){
//
//        return "create a new post";
//    }


//    private final BlogPostRepository blogDao;
//
//    public PostController(BlogPostRepository blogDao){
//        this.blogDao = blogDao;
//    }
//
//    @GetMapping("/blogposts")
//    public String index(Model model){
//        model.addAttribute("blogposts", blogDao.findAll());
//        return "blogposts/index";
//    }
//    Used dependency injection to use a instance of the new BlogPostRepository interface

//    @GetMapping("/posts")
//    @ResponseBody
//    public String seeAllPosts(){
//        return "All posts will display here!!";
//    }


//    @GetMapping("/posts")
//    public String viewAllPosts(){ return "posts/index"; } //    shows all the blogposts
//
//    @GetMapping("/show/{id}")
//    public String viewAPost(@PathVariable  int id, Model vModel){
//            vModel.addAttribute("show", new BlogPost("New Blog post","Hey, how's it going"));
//        return "posts/show";}
//
//    @PostMapping("/show")
//    public String viewOnePost(){ return "posts/show";}
//
//
//
//    @GetMapping("/posts/create")
//    @ResponseBody
//    public String viewPostForm(){
//        return "You would come here to create a post.";
//    }
//
//    @PostMapping("/posts/create")
//    @ResponseBody
//    public String createPost(){
//        return "You will submit your post here.";
//    }
}
