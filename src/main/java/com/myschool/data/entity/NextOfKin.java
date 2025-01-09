package com.myschool.data.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Data
public class NextOfKin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fullName;

    private String relWithStudent;

    private String address;

    private String phoneNumber;

    @OneToMany
    private Set<Student> students;


}
