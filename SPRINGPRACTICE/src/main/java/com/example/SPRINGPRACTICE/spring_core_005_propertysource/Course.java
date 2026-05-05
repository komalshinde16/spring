package com.example.SPRINGPRACTICE.spring_core_005_propertysource;

import lombok.Data;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;


@Data
@ToString
@Component //stereotype annotation
@PropertySource("classpath*:application.properties")
public class Course {

    @Value("${id}")
    private int id;

    @Value("${name}")
    private String name;

    @Value("${desc}")
    private String description;
}
