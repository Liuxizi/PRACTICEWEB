package com.example.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class UserController {



    //登录模块
    @RequestMapping("/login")
    public String login() {
        return "/admin/login";
    }
}
