package com.example.demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InstructorsConfigTest {
    
    @Autowired
    @Qualifier("usaInstructors")
    Instructors usaInstructors;
    
    @Autowired
    @Qualifier("ukInstructors")
    Instructors ukInstructors;
    
    @Autowired
    @Qualifier("instructors")
    Instructors instructors;
    
    @Test
    public void tcUsaInstructorsTest() {
        Assert.assertNotNull(usaInstructors);
        Assert.assertNotNull(usaInstructors.getById(1L));
    }
    
    @Test
    public void tcUkInstructorsTest() {
        Assert.assertNotNull(ukInstructors);
        Assert.assertNotNull(ukInstructors.getById(2L));
    }
    
    @Test
    public void InstructorsTest() {
        Assert.assertNotNull(instructors);
        Assert.assertNotNull(instructors.getById(3L));
    }
}
