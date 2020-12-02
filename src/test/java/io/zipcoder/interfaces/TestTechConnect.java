package io.zipcoder.interfaces;

import org.junit.Before;
import org.testng.annotations.Test;

import static org.junit.Assert.assertTrue;

public class TestTechConnect {

    @Before
    public void setup() {
        TechConnect.removeStudents();
    }

    @Test
    public void testRemoveStudents() {
        assertTrue(TechConnect.getStudents().isEmpty());
    }

    @Test
    public void testRecruitStudent() {
        Student buzz = new Student("Buzz");
        TechConnect.recruitStudent(buzz);

        assertTrue(TechConnect.getStudents().contains(buzz));
    }

}
