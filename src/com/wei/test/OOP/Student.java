package com.wei.test.OOP;

public class Student {

    private String name;
    
    private int age;
    
    public static class StudentUtil {
        
        public static Student buildStudent(String name, int age){
            return new Student(name, age);
        }
    }
    private Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    
}
