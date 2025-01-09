package com.myschool.data.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

public class Staff {

    private String firstName;

    private String lastName;

    private String email;

    private String address;

    private String phoneNumber;
}
