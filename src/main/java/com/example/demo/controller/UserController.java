package com.example.demo.controller;


import org.apache.catalina.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/admin")
public class UserController {



    //登录模块
    @RequestMapping("/login")
    public String login() {
        return "/admin/login";
    }


}
