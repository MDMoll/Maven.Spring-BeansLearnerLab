package com.example.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
public class ClassroomConfig {
    @Bean
    @DependsOn({"instructors", "students"})
    Classroom currentCohort(Instructors instructors, Students students) {
        return new Classroom(instructors, students);
    }
    
    @Bean
    @DependsOn({"instructors", "previousStudents"})
    Classroom previousCohort(Instructors instructors, @Qualifier("previousStudents") Students previousStudents) {
        return new Classroom(instructors, previousStudents);
    }
}
