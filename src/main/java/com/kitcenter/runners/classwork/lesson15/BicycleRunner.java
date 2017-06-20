package com.kitcenter.runners.classwork.lesson15;

import com.kitcenter.app.classwork.lesson15.interfaces.*;


public class BicycleRunner {
    public static void main(String[] args) {
        Bicycle bmx = new BMX();
        Bicycle acme = new ACME();
        Bicycle ukraine = new Ukraine();
        bicycleActions(bmx, 20, 5);
        bicycleActions(acme, 40, 10);
        bicycleActions(ukraine, 60, 15);

    }

    public static void bicycleActions(Bicycle bicycle, int value, int speed) {
        bicycle.changeGear(value);
        bicycle.shift();
        bicycle.changeSpeed(speed);
    }
}
