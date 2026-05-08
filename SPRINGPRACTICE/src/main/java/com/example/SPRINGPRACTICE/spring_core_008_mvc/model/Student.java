package com.example.SPRINGPRACTICE.spring_core_008_mvc.model;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Builder
public class Student {
    private int id;
    private String name;
    private int age;
}