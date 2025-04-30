package com.java.progarm100;

class Person {
    void displayInfo() {
        System.out.println("Welcome To My Profile");
    }
}

class Student extends Person {
    @Override
    void displayInfo() {
        System.out.println("I am  a student.");
    }

    void studentDetails(String name, int age, String school) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("College: " + school);
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Person person = new Person();
        person.displayInfo();  
        Student student = new Student();
        student.displayInfo();  // Calls Student's overridden displayInfo
        student.studentDetails("Gagan", 20, "PDEA College");
    }
}

