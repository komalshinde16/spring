package com.example.SPRINGPRACTICE.springcore003javaway;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;





@Configuration
@ComponentScan(basePackages = {"com.itshaala"})


public class SpringConfig {

    @Bean(name = "course")
    public Course getCourse(){
        return new Course(1,"Spring Framework","java way config");
    }

}
