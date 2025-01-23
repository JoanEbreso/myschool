package com.myschool.data.entity;

import com.myschool.data.enums.ClassOfStudy;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Student extends AppUser {

    @Enumerated(EnumType.STRING)
    private ClassOfStudy classOfStudy;

    private String address;

    @OneToOne
    private NextOfKin nextOfKin;
}
