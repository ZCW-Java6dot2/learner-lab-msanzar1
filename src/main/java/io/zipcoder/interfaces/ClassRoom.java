package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.HashMap;

public class ClassRoom {
    private ArrayList<Student> students = TechConnect.getStudents();
    private ArrayList<Instructor> instructors = ZipCodeWilmington.getInstructors();
    private HashMap<String, Person> roster = new HashMap<String, Person>();




    public HashMap<String,Person> getRoster() {
        for(Student student1 : students) {
            roster.put(student1.getName(),student1);
        }
        for(Instructor instructor1 : instructors) {
            roster.put(instructor1.getName(),instructor1);
        }
        return roster;
    }

}
