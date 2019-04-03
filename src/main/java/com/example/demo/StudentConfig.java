package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

@Configuration
public class StudentConfig {
    @Bean(name = "students")
    Students currentStudents() {
        Students students = new Students(new ArrayList<>());
        students.add(new Student(1L, "Albert"));
        return students;
    }
    
    @Bean(name = "previousStudents")
    Students previousStudents() {
        Students students = new Students(new ArrayList<>());
        students.add(new Student(2L, "Boris"));
        return students;
    }
}
