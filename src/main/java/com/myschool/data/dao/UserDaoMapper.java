package com.myschool.data.dao;

import com.myschool.data.entity.AppUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class UserDaoMapper {

    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;

    public AppUser mapToUser(UserDao userDao){

        AppUser newUser = new AppUser();

        if(userDao.getEmail() != null){
            newUser.setEmail(userDao.getEmail());
        }
        newUser.setFirstName(userDao.getFirstName());
        newUser.setLastName(userDao.getLastName());
        newUser.setAddress(userDao.getAddress());
        newUser.setRole(userDao.getRole());
        newUser.setRole(userDao.getRole());
        newUser.setUsername("defaultUsername");
        newUser.setPassword(bCryptPasswordEncoder.encode(userDao.getPassword()));


        return newUser;
    }
}
