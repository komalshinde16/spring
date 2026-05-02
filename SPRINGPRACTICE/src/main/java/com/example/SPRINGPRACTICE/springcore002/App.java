package com.example.SPRINGPRACTICE.springcore002;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.cfg.xml");
        Course course = context.getBean("course", Course.class);
        System.out.println(course);
    }
}
