package com.example.SPRINGPRACTICE.spring_core_005_propertysource;

import com.example.SPRINGPRACTICE.springcore_004_stereotype.SpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;

public class App2 {

    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);
        Environment environment = context.getEnvironment();
        System.out.println(environment.getProperty("id"));
        System.out.println(environment.getProperty("name"));
        System.out.println(environment.getProperty("desc"));
    }
}
