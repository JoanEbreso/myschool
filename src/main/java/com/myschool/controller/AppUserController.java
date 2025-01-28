package com.myschool.controller;

import com.myschool.data.dao.UserDao;
import com.myschool.service.AppUserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/v1/user")
public class AppUserController {

    @Autowired
    AppUserServiceImpl appUserService;

    @PostMapping
    public String register(@RequestBody UserDao userDao) {
        return appUserService.registerStaff(userDao);
    }


}
