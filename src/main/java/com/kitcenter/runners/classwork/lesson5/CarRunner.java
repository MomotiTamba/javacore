package com.kitcenter.runners.classwork.lesson5;

import com.kitcenter.app.classwork.lesson5.Car;

public class CarRunner {

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.name = "BMW";
        System.out.println(car1.name);
        System.out.println(Car.speed);
        Car car2 = new Car();
        Car.speed = 15;
        Car.showSpeed();
        car2.name = "Audi";
        System.out.println(car2.name);

    }
}


