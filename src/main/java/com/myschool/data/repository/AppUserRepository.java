package com.myschool.data.repository;

import com.myschool.data.entity.AppUser;
import com.myschool.data.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AppUserRepository extends JpaRepository<AppUser, Long> {

    Optional<AppUser> findByUsername (String username);
}
