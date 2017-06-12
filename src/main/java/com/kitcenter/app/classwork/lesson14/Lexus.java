package com.kitcenter.app.classwork.lesson14;


public class Lexus extends Car{

    private String owner = "Lexus";

    public Lexus(){
    }

    public Lexus(String name){
        super(name);
    }
    public Lexus(String name, int speed){
        super(name, speed);
    }

    @Override
    public void showNameAndSpeed(){
        super.showNameAndSpeed();
        System.out.println(owner);
    }

    @Override
    public void drive(){
        System.out.println("Lexus drive");
    }
}
