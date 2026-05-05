package com.example.SPRINGPRACTICE.spring_core_005_propertysource;

import com.example.SPRINGPRACTICE.springcore_004_stereotype.Course;
import com.example.SPRINGPRACTICE.springcore_004_stereotype.SpringConfig;
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
