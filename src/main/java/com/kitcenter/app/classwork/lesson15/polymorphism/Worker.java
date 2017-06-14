package com.kitcenter.app.classwork.lesson15.polymorphism;


public class Worker extends Person {
    public Worker(String name) {
        super(name);
    }

    @Override
    public String getResponse(String question) {
        return "I'm a worker, fuck off\n" + question;
    }
}
