package com.kitcenter.app.classwork.lesson15.interfaces;


public interface Bicycle {

    double PI = 3.14d;

    void changeGear(int value);

    void shift();

    default int changeSpeed(int speed){
        System.out.println("Default method, speed is: " + speed);
        return speed;
    }
}
