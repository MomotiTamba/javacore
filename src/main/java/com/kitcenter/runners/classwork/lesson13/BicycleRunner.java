package com.kitcenter.runners.classwork.lesson13;


import com.kitcenter.app.classwork.lesson13.Bicycle;

public class BicycleRunner {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle();
        System.out.println(bicycle.getName());
        Bicycle bicycle1 = new Bicycle();
        bicycle1.setName("KOMANCHE-PRO2");
        bicycle1.printMe();
        System.out.println(bicycle1.getName());
        String color = "Red";
        Bicycle bicycle2 = new Bicycle(color);
        System.out.println(bicycle2.getName() + ", " + bicycle2.color);
        bicycle1.setPrice(25.4);
        System.out.println(bicycle1.getPrice());


    }
}
