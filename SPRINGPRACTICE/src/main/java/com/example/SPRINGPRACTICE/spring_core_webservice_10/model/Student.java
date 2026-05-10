package com.example.SPRINGPRACTICE.spring_core_webservice_10.model;

import jakarta.annotation.security.DenyAll;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@ToString
@Table(name = "student")



public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int id;
    private int age;
    private String name;
    private String address;
}
