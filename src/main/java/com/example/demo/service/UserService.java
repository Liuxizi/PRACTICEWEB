package com.example.demo.service;


import com.example.demo.dao.UserDao;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserDao userDao;

    public boolean login(String username, String password){
        User user = userDao
    }


}
