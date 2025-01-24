package com.myschool.controller;

import com.myschool.data.dao.UserDao;
import com.myschool.service.AppUserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/user_registration")
public class AppUserController {

    @Autowired
    AppUserServiceImpl appUserService;

    public String register(@RequestBody UserDao userDao){
        return appUserService.registerStaff(userDao);
    }
}
