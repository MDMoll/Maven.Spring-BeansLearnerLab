package com.example.demo;

public class Instructor extends Person implements Teacher {
    Long id;
    String name;
    
    Instructor() {
    }
    
    Instructor(Long id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }
    
    public void lecture(Iterable<? extends Learner> learners, double numberOfHours) {
        int count = 0;
        double numberOfHoursPerLearner = numberOfHours / count;
        for (Learner learner : learners) {
            count++;
        }
        for (Learner learner : learners) {
            learner.learn(numberOfHoursPerLearner);
        }
    }
}
