package com.example.demo;

public class Student extends Person implements Learner {
    public double totalStudyTime;
    Long id;
    String name;
    
    Student(){}

    Student(Long id, String name){
        super(id, name);
    }
    
    public void learn(double numberOfHours){
       totalStudyTime += numberOfHours;
    }
    
    public double getTotalStudyTime(){
        return totalStudyTime;
    }
    
}
