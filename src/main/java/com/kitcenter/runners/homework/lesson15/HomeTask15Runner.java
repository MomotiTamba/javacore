package com.kitcenter.runners.homework.lesson15;


import com.kitcenter.app.homework.lesson15.Bicycle;
import com.kitcenter.app.homework.lesson15.BicycleWithRing;
import com.kitcenter.app.homework.lesson15.BicycleWithRingInterface;
import com.kitcenter.app.homework.lesson15.CustomBicycle;

public class HomeTask15Runner {
    public static void main(String[] args) {
        BicycleWithRingInterface bicycleWithRing = new BicycleWithRing();
        bicycleWithRing.ring();
        Bicycle bicycle  = new CustomBicycle();
        bicycle.ride();
        bicycle.setGear();
    }
}
