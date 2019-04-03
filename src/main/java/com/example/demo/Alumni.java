package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Alumni {
    
    @Autowired
    Students previousStudents;
    
    @Autowired
    Instructors instructors;
    
    
    @PostConstruct
    public void executeBootCamp() {
        int numberOfInstructors = getInstructors().size();
        int numberOfStudents = getPreviousStudents().size();
        double numberOfHoursToTeachEachStudent = 1200;
        double numberOfHoursToTeach = numberOfHoursToTeachEachStudent * numberOfStudents;
        double numberOfHoursPerInstructor = numberOfHoursToTeach / numberOfInstructors;
        
        for (Instructor instructor : instructors) {
            instructor.lecture(previousStudents, numberOfHoursPerInstructor);
        }
    }
    
    public Students getPreviousStudents() {
        return previousStudents;
    }
    
    public Instructors getInstructors() {
        return instructors;
    }
    
    
    public void setPreviousStudents(Students previousStudents) {
        this.previousStudents = previousStudents;
    }
    
    public void setInstructors(Instructors instructors) {
        this.instructors = instructors;
    }
    
}
