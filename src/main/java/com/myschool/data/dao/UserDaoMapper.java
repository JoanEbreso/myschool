package com.myschool.data.dao;

import com.myschool.data.entity.AppUser;

public class UserDaoMapper {

    public AppUser mapToUser(UserDao userDao){

        AppUser newUser = new AppUser();
        newUser.setFirstName(userDao.getFirstName());
        newUser.setLastName(userDao.getLastName());
        newUser.setEmail(userDao.getEmail());
        newUser.setAddress(userDao.getAddress());
        newUser.setRole(userDao.getRole());
        newUser.setRole(userDao.getRole());


        return null;
    }
}
