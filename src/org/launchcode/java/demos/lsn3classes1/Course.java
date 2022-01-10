package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;
import java.util.HashMap;

public class Course {

    private String name;
    private String courseNumber;
    private int credits;
    private HashMap<Student, Double> grades;
    private ArrayList<Student> enrollment;

    public Course(String name, String courseNumber, int credits, HashMap<Student, Double> grades, ArrayList<Student> enrollment) {
        this.name = name;
        this.courseNumber = courseNumber;
        this.credits = credits;
        this.grades = grades;
        this.enrollment = enrollment;
    }

    public String getName() {
        return name;
    }

    public void setName(String aName) {
        name = aName;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String aCourseNumber) {
        courseNumber = aCourseNumber;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int aCredits) {
        credits = aCredits;
    }

    public HashMap<Student, Double> getGrades() {
        return grades;
    }

    public void setGrades(HashMap<Student, Double> someGrades) {
        grades = someGrades;
    }

    public ArrayList<Student> getEnrollment() {
        return enrollment;
    }

    public void setEnrollment(ArrayList<Student> someEnrollment) {
        enrollment = someEnrollment;
    }
}
