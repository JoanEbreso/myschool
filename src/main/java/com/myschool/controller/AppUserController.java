package com.myschool.controller;

import com.myschool.service.AppUserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/user")
public class AppUserController {

    @Autowired
    AppUserServiceImpl appUserService;

    // You need to first implement the register method in AppUserServiceImpl, so that a valid user with encoded password is created.
    @PostMapping
    public String register() {

//        return appUserService.registerStaff(userDao);
        return "works";
    }

}
