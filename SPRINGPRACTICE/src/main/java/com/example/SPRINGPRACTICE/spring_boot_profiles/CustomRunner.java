package com.example.SPRINGPRACTICE.spring_boot_profiles;


import lombok.AllArgsConstructor;
import org.hibernate.tool.schema.spi.CommandAcceptanceException;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class CustomRunner implements CommandLineRunner {

    //by default, it will read the application.properties file
    private Environment environment;

    @Override

    public void run(String... args) throws Exception {
        System.out.println("username = " + environment.getProperty("mysql.username"));
        System.out.println("password = " + environment.getProperty("mysql.password"));
        System.out.println("url = " + environment.getProperty("mysql.url"));
    }
}
