package com.kitcenter.app.homework.lesson15;


public class CustomBicycle extends Bicycle {

    public int speed;
    public int gear;

    @Override
    public void setSpeed() {
        this.speed = speed;
        System.out.println("Speed: " + speed);
    }

    @Override
    public void setGear() {
        this.gear = gear;
        System.out.println("Gear: " + gear);
    }

    public void ride() {
        System.out.println("Wshhhh!");
    }
}
