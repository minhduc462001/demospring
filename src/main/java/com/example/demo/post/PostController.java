package com.example.demo.post;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

@Controller
public class PostController {
    @PostMapping("/post")
    public String post(@RequestParam("textarea") String text, Model model){
        Post post = new Post();
        post.setBody(text);

        LocalDateTime date = LocalDateTime.now();
        post.setTime(date);
        model.addAttribute("p",post);
        System.out.println("ngay gio : "+date);
        return "index3";
    }
}
