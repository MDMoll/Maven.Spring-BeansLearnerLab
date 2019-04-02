package com.example.demo;

public class Instructor extends Person implements Teacher {
    
    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }
    
    public void lecture(Iterable<? extends Learner> learners, double numberOfHours) {
        int count = 0;
        double numberOfHoursPerLearner = numberOfHours / count;
        for (Learner learner : learners){
            count++;
        }
        for (Learner learner : learners){
            learner.learn(numberOfHoursPerLearner);
        }
    }
}
