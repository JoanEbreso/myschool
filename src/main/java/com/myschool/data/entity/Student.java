package com.myschool.data.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Student extends AppUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private ClassOfStudy classOfStudy;

    private String address;

    @OneToOne
    private NextOfKin nextOfKin;
}
