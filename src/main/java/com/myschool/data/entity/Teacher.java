package com.myschool.data.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Data
public class Teacher extends AppUser {

    @OneToMany
    private Set<Course> courses;
}
