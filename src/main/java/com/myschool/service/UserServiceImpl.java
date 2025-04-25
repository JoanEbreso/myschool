package com.myschool.service;

import com.myschool.data.dao.UserDao;
import com.myschool.data.dao.UserDaoMapper;
import com.myschool.data.dto.LoginRequest;
import com.myschool.data.entity.AppUser;
import com.myschool.security.config.JWTUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final AuthenticationManager authenticationManager;

    private final UserDetailsService userDetailsService;

    private final JWTUtil jwtUtil;

    private final UserDaoMapper userDaoMapper;

    @Override
    public AppUser registerStaff(UserDao userDao) {

        AppUser appUser = new AppUser();

        appUser = userDaoMapper.mapToUser(userDao);

        return appUser ;
    }

    @Override
    public String login(LoginRequest loginRequest) {
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword()));
        System.out.println("UserServiceImpl login... me..");
        UserDetails user = userDetailsService.loadUserByUsername(loginRequest.getUsername());

        if(user != null){
            return jwtUtil.generateToken(user);
        }

        return "error";
    }
}
