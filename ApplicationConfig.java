package com.example.education.config;

import com.example.education.model.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class ApplicationConfig {

    @Bean
    public List<Student> akaDB(){
        return new ArrayList<>();
    }
}
