package com.kitcenter.app.classwork.lesson14;


public class Student extends Person {

    public Student(String name) {
        super(name);
    }

    public Student(String name, int age){
        super(name, age);
    }

    public void showName(){
        System.out.println(name);
    }

    public void showNameAndAge(){
        System.out.println(name + " " + age);
    }

    @Override
    public void showClassName(){
        System.out.println("Student class");
    }
}
