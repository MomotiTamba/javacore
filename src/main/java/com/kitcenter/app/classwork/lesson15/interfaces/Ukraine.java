package com.kitcenter.app.classwork.lesson15.interfaces;


public class Ukraine implements Bicycle, Repair {

    @Override
    public void changeGear(int value) {
        System.out.println("Change gear to: " + value);
    }

    @Override
    public void shift() {
    }
}
