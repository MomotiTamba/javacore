package com.kitcenter.app.classwork.lesson15.polymorphism;


public class Teacher extends Person {


    public Teacher(String name) {
        super(name);
    }

    @Override
    public String getResponse(String question) {
        return "Do not forget to make a homework";
    }
}
