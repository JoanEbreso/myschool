package com.myschool.data.dao;

import com.myschool.data.enums.UserRole;
import jakarta.annotation.Nullable;
import lombok.Getter;

@Getter
public class UserDao{

    private String firstName;

    private String lastName;

    // Not sure why you didn't have this ? you do need email if you want some login functionality or make this nullable and make use of username in the AppUser class.
    @Nullable
    private String email;

    private String password;

    private String address;

    private UserRole role;
}
