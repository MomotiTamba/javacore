package com.kitcenter.app.classwork.lesson15.interfaces;


public class BMX implements Bicycle, Repair {

    @Override
    public void changeGear(int value) {
        System.out.println("Change gear to: " + value);
    }

    @Override
    public void shift() {
        fix(new BMX(), 10);
    }
}
