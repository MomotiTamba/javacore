package com.kitcenter.app.classwork.lesson5;

import java.util.Scanner;

public class CircleArea {

    public static void calculate() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input value: ");
        double radius = sc.nextDouble();
        double circleArea = Math.PI * Math.pow(radius, 2);
        System.out.println("Area is " + circleArea);
    }

    public static void calculateBigger() {
        int area1 = 1;
        int area2 = 2;

        if (area1 > area2) {
            System.out.println("Area1 is bigger");
        } else {
            System.out.println("Area2 is bigger");
        }
    }

}

