package com.myschool.controller;

import com.myschool.data.dao.UserDao;
import com.myschool.service.AppUserServiceImpl;
import com.myschool.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/user")
public class AppUserController {

    @Autowired
    UserServiceImpl userService;

    // You need to first implement the register method in AppUserServiceImpl, so that a valid user with encoded password is created.
    @PostMapping
    public ResponseEntity<String> register(UserDao userDao) {

        return  ResponseEntity.ok(String.valueOf(userService.registerStaff(userDao)));

    }

}
