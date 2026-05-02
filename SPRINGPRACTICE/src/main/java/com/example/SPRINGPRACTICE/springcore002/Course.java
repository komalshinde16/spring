package com.example.SPRINGPRACTICE.springcore002;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor

public class Course {

    private int id;
    private String name;
    private String description;

}
