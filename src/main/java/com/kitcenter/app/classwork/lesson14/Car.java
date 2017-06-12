package com.kitcenter.app.classwork.lesson14;


public class Car {

    protected String name;
    protected int speed;

    public Car(){
    }

    public Car(String name){
        this.name = name;
    }

    public Car(String name, int speed){
        this(name);
        this.speed = speed;
    }

    public void showNameAndSpeed(){
        System.out.println(name + " " + speed);
    }

    public void drive(){
        System.out.println("Car drive");
    }

}
