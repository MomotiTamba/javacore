package com.kitcenter.app.classwork.lesson15.polymorphism;


public class Student extends Person {

    public Student(String name) {
        super(name);
    }

    @Override
    public String getResponse(String question) {
        return "Eh, What is question";
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
