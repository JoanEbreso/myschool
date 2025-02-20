package com.myschool.controller;

import com.myschool.data.dto.LoginRequest;
import com.myschool.security.config.JWTUtil;
import com.myschool.service.AppUserServiceImpl;
import com.myschool.service.UserServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/auth")
@AllArgsConstructor
public class AppController {

    private final UserServiceImpl userService;

    @PostMapping("/login")
    public ResponseEntity<String> authenticate(@RequestBody LoginRequest loginRequest){

        String result = userService.login(loginRequest);
        if(result == "error"){
            return ResponseEntity.status(400).body("Some error has occurred");
        }
        else{
            return ResponseEntity.ok(result);
        }
    }
}
