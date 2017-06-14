package com.kitcenter.runners.classwork.lesson15;

import com.kitcenter.app.classwork.lesson15.interfaces.ACME;
import com.kitcenter.app.classwork.lesson15.interfaces.BMX;
import com.kitcenter.app.classwork.lesson15.interfaces.Bicycle;
import com.kitcenter.app.classwork.lesson15.interfaces.Ukraine;


public class BicycleRunner {
    public static void main(String[] args) {
        Bicycle bmx = new BMX();
        Bicycle acme = new ACME();
        Bicycle ukraine = new Ukraine();
        bicycleActions(bmx, 20);
        bicycleActions(acme, 40);
        bicycleActions(ukraine, 60);
    }
    public static void bicycleActions(Bicycle bicycle, int value){
        bicycle.changeGear(value);
        bicycle.shift();
    }
}
