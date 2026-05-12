package com.example.SPRINGPRACTICE.springboot_runners;


import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TaskRunner implements CommandLineRunner {


@Override

public void run (String... args)  throws Exception{
    System.out.println("command line runner and inputs given to the runner");
    for (String arg : args){
        System.out.println(arg);
    }

}

}
