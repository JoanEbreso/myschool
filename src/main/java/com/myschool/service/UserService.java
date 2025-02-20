package com.myschool.service;

import com.myschool.data.dao.UserDao;
import com.myschool.data.dto.LoginRequest;

public interface UserService {

    String registerStaff(UserDao userDao);

    String login(LoginRequest loginRequest);
}
