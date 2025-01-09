package com.myschool.data.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.Set;

@Entity
@Data
public class Teacher extends Staff{

    @OneToMany
    private Set<Course> courses;
}
