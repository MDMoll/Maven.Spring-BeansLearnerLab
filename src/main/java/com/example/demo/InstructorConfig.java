package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import java.util.ArrayList;
import java.util.List;

public class InstructorConfig {
    @Bean
    Instructors tcUsaInstructors(){
        List<Instructor> usaInstructors = new ArrayList<>();
        usaInstructors.add(new Instructor(1L, "Andrew"));
        return (Instructors) usaInstructors;
    }
    @Bean
    Instructors tcUkInstructors(){
        List<Instructor> ukInstructors = new ArrayList<>();
        ukInstructors.add(new Instructor(2L, "Alfie"));
        return (Instructors) ukInstructors;
    }
    @Primary
    @Bean
    Instructors instructors(){
        List<Instructor> instructors = new ArrayList<>();
        instructors.add(new Instructor(3L, "Leon"));
        return (Instructors) instructors;
    }
}
