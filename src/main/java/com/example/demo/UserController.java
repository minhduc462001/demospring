package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class UserController {
    private final UserService userService;


    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/v")
    public String h1(HttpServletRequest request){
        String name = request.getParameter("name");
        System.out.println("name"+name);
        User list = userService.getUserByID();
        request.setAttribute("u",list);
        return "index";
    }
}
