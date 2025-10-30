package com.example.di;

public class Student {
    private Course course;

    public Student(Course course) {
        this.course = course;
    }

    public void showInfo() {
        System.out.println("Student enrolled in: " + course.getCourseName());
    }
}
