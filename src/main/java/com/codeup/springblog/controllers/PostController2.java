//package com.codeup.springblog.controllers;
//import com.codeup.springblog.models.Post;
//import com.codeup.springblog.repos.PostRepository;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import java.util.List;
//
//public class PostController2 {
//
//
//    @GetMapping("/posts")
//    public String seeAllPosts(Model viewModel){
////        List<Post> postsFromDB = postDao.searchByBodyLike("post");
////        viewModel.addAttribute("posts", postsFromDB);
//        return "posts/index";
//    }
//
//
//    @GetMapping("/posts/{id}")
//    public String showOnePost(@PathVariable int id, Model vModel){
//        vModel.addAttribute("post", new Post("iPad", "Pro 11in"));
//        return "posts/show";
//    }
//
//}
