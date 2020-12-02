package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestInstructor {
    Instructor instructor = new Instructor("Christian");
    Student student;

    public TestInstructor() {
        student = new Student("Mike");
    }

    @Test
    public void testImplementation() {
        assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void testInheritance() {
        assertTrue(instructor instanceof Person);
    }

    @Test
    public void testTeach() {
        Double expectedStudyTime = 8.0;
        instructor.teach(student, expectedStudyTime);
        Double actualStudyTime = student.getTotalStudyTime();

        assertEquals(expectedStudyTime,actualStudyTime);
    }

    @Test
    public void testLecture() {
        Student buzz = new Student("Buzz");
        Student mike = new Student("Mike");
        Student[] students = {buzz, mike};

        Double expectedTotalHours = 10.0;
        Double expectedHoursPerStudent = 5.0;

        instructor.lecture(students, expectedTotalHours);
        Double actualHoursPerStudent = buzz.getTotalStudyTime();

        assertEquals(expectedHoursPerStudent,actualHoursPerStudent);
    }
}