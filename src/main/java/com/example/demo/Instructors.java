package com.example.demo;

import java.util.Iterator;

public class Instructors extends People<Instructor> {
    Instructors(Instructor instructor) {
        super.add(instructor);
    }
    
    public Iterator<Instructor> iterator() {
        return null;
    }
}
