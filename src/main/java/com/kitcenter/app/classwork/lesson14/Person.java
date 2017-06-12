package com.kitcenter.app.classwork.lesson14;


public class Person {

    protected String name;
    protected int age;

    public Person(String name){
        this.name = name;
    }
    public Person(String name, int age){
        this(name);
        this.age = age;
    }

    public void showClassName(){
        System.out.println("Person class");
    }

    /*public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }*/
}
