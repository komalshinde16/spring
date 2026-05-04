package com.example.SPRINGPRACTICE.springcore_004_stereotype;

import com.example.SPRINGPRACTICE.springcore003javaway.Course;
import com.example.SPRINGPRACTICE.springcore003javaway.SpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);
        Course course = context.getBean("course", Course.class);
        System.out.println(course);
    }
}
