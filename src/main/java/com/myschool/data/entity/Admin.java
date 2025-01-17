package com.myschool.data.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Admin extends Staff{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
