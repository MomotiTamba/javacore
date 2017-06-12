package com.kitcenter.runners.classwork.lesson14;


import com.kitcenter.app.classwork.lesson14.BMW;
import com.kitcenter.app.classwork.lesson14.Car;
import com.kitcenter.app.classwork.lesson14.Lexus;

public class CarRunner {
    public static void main(String[] args) {


        Car bmw = new BMW("BMW Seven", 300);
        bmw.showNameAndSpeed();
        bmw.drive();

        Car lexus = new Lexus("Lexus Qwert", 310);
        lexus.showNameAndSpeed();
        lexus.drive();

    }
}
