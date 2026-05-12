package com.example.SPRINGPRACTICE.springboot_runners;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;


@Component
public class ApplicationRunnerImpl implements ApplicationRunner {
    @Override

    public void run (ApplicationArguments args)throws Exception{
        System.out.println("********application runner impl******");
    }
}
