package io.zipcoder.interfaces;

import org.junit.Before;
import org.testng.annotations.Test;

import static org.junit.Assert.assertTrue;

public class TestClassRoom {

        @Before
        public void setup() {
            ZipCodeWilmington.fireStaff();
        }

        @Test
        public void testFireStaff() {
            assertTrue(ZipCodeWilmington.getInstructors().isEmpty());
        }

        @Test
        public void testHireStaff() {
            Instructor frank = new Instructor("Frank");
            ZipCodeWilmington.hire(frank);

            assertTrue(ZipCodeWilmington.getInstructors().contains(frank));
        }
    }

