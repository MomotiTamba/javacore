package com.kitcenter.runners.classwork.lesson16;


import com.kitcenter.app.classwork.lesson16.Car;

public class CarRunner {
    public static void main(String[] args) {
        Car audi = new Car();
        audi.setSpeed(200);
        Car BMW = new Car();
        BMW.setSpeed(250);

        System.out.println(BMW.equals(audi));

    }
}
