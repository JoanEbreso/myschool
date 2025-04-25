package com.myschool.service;

import com.myschool.data.dao.UserDao;
import com.myschool.data.dto.LoginRequest;
import com.myschool.data.entity.AppUser;

public interface UserService {

    AppUser registerStaff(UserDao userDao);

    String login(LoginRequest loginRequest);
}
