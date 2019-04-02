package com.example.demo;

public class Student extends Person implements Learner {
    public double totalStudyTime;
    
    Student(){}

    Student(Long id, String name){}
    
    public void learn(double numberOfHours){
       totalStudyTime += numberOfHours;
    }
    
    public double getTotalStudyTime(){
        return totalStudyTime;
    }
    
}
