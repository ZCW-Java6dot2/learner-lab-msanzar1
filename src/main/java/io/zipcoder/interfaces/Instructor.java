package io.zipcoder.interfaces;

public class Instructor extends Person implements Teacher{


    public Instructor(String name) {
        super(name);
    }

    public void teach(Student student, double numberOfHours) {
        student.learn(numberOfHours);
    }

    public void lecture(Student[] student, double numberOfHours) {
        double numberOfHoursPerStudent = numberOfHours / student.length;
        for(Student student1 : student) {
            student1.learn(numberOfHoursPerStudent);
        }
    }

    public void teach(Learner learner, double numberOfHours) {

    }

    public void lecture(Learner[] learners, double numberOfHours) {

    }
}