package com.example.demo;


public class Instructors extends People<Instructor> {
    Instructors(Instructor instructor) {
        super.add(instructor);
    }
}
