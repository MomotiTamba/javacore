package com.kitcenter.app.classwork.lesson14;


public class BMW extends Car {

    private String owner = "BMW";

    public BMW(){
    }

    public BMW(String name){
        super(name);
    }

    public BMW(String name, int speed){
        super(name, speed);
    }

    @Override
    public void showNameAndSpeed(){
        super.showNameAndSpeed();
        System.out.println(owner);
    }

    @Override
    public void drive(){
        System.out.println("BMW drive");
    }

}
