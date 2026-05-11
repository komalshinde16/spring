package com.example.SPRINGPRACTICE.spring_mvc_011_web_service.model;

import jakarta.persistence.*;


@Entity
@Table(name = "student")




public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int id;
    private int age;
    private String name;
    private String address;

}
