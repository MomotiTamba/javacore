package com.kitcenter.app.classwork.lesson15.polymorphism;

public class Person {
    protected String name;

    public Person(String name) {
        this.name = name;
    }

    public String getResponse(String question){
        return "My answer is" + question;
    }
}
