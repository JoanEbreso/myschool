package com.myschool.service;

import com.myschool.data.dao.UserDao;
import com.myschool.data.entity.AppUser;


public interface AppUserService {

    String registerStaff(UserDao userDao);
}
