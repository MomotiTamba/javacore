package com.kitcenter.app.homework.lesson13;


public class Human {
    private String name;
    private int age;

    public Human() {
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 1 || age < 121) {
            System.out.println("New age setted");
            this.age = age;
        } else {
            System.out.println("Age invalid");
        }
    }
}
