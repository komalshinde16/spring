package com.example.SPRINGPRACTICE.springcore003javaway;

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