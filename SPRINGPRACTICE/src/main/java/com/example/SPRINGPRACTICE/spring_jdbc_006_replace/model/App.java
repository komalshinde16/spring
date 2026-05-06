package com.example.SPRINGPRACTICE.spring_jdbc_006_replace.model;

import com.example.SPRINGPRACTICE.spring_jdbc_006_replace.model.controller.CourseController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);
        CourseController courseController = context.getBean(CourseController.class);
        courseController.update(Course.builder()
                .id(4)
                .name("spring Data jdbc 1")
                .description("abstraction layer built on top jdbc")
                .price(99)
                .duration("1 day")
                .build());
    }
}
