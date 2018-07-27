package com.example.demo.service;


import com.example.demo.dao.UserDao;
import com.example.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserDao userDao;

    public boolean login(String username, String password){
        User user = userDao.findByUsernameAndPassword(username, password);
        if(null == user){

            return false;
        }else {

            return true;
        }
    }
}