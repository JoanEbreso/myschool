package com.myschool.service;

import com.myschool.data.dao.UserDao;
import com.myschool.data.entity.AppUser;
import com.myschool.data.repository.AdminRepository;
import com.myschool.data.repository.AppUserRepository;
import com.myschool.data.repository.StudentRepository;
import com.myschool.data.repository.TeacherRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class AppUserServiceImpl implements AppUserService, UserDetailsService {
    @Autowired
    AppUserRepository appUserRepository;

    @Override
    public String registerStaff(UserDao userDao) {
        return "works";
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        return appUserRepository.findByUsername(username).orElseThrow(() -> new UsernameNotFoundException(
                String.format("User with username %s not found", username)));
    }
}
