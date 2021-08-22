package com.example.demo.post;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.Date;
import java.time.LocalDateTime;

@Controller
public class PostController {
    private final PostService postService;

    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }

    @PostMapping("/post")
    public String post(@RequestParam("textarea") String text, Model model){
        Post post = new Post();
        post.setBody(text);

        LocalDateTime date = LocalDateTime.now();
        post.setTime(date);
        post.setIdUser(1);
        postService.addNewPost(post);
        model.addAttribute("p",post);
        System.out.println("ngay gio : "+date);
        return "index3";
    }

    @GetMapping("/getpost")
    public String post1(){
        Post post = postService.getPostById();
        System.out.println(post);
        return post.getBody();
    }
    @PostMapping("/p")
    public void addNew(@RequestBody Post post){
        post.setIdUser(1);
        post.setBody("fghjk");
        post.setTime(LocalDateTime.now());
        postService.addNewPost(post);
    }
}
