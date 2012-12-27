package com.wei.test.OOP;

public class StudentBuilder {

    public StudentBuilder() {
    }

    public static Student createStudent(String name, int age) {
        return Student.StudentUtil.buildStudent(name, age);
    }
}
