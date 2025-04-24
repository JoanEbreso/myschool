package com.myschool.service;

import com.myschool.data.repository.AppUserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@Primary
@Slf4j
public class AppUserServiceImpl implements UserDetailsService {
    @Autowired
    AppUserRepository appUserRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // I added this log statement to see if this method is being called, when I tried to login, it was called.
        log.info("AppUserServiceImpl loadUserByUsername... me.., username: {}", username);
        return appUserRepository.findByUsername(username).orElseThrow(() -> new UsernameNotFoundException(
                String.format("User with username %s not found", username)));
    }
}
