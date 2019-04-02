package com.example.demo;

import java.util.Iterator;

public class Students extends People<Student> {
    Students(){}
    Students(Student student){
        super.add(student);
    }
    
    public Iterator<Student> iterator() {
        return null;
    }
}
