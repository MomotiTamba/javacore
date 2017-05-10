package com.kitcenter.app.classwork.lesson5;

import java.util.Scanner;

public class CircleArea {

    public static void calculate(double radius) {
        /*Scanner sc = new Scanner(System.in);
        System.out.print("Input value: ");
        double radius = sc.nextDouble();*/
        double circleArea = Math.PI * Math.pow(radius, 2);
        System.out.println("Area is " + circleArea);
    }

    /*public static void calculateBigger() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input area1: ");
        double area1 = sc.nextDouble();
        System.out.print("Input area2: ");
        double area2 = sc.nextDouble();

        if (area1 > area2) {
            System.out.println("Area1 is a bigger");
        } else {
            System.out.println("Area2 is a bigger");
        }
    }*/

    public static void calculateRadiusAreaBigger(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input first radius: ");
        double radius1 = sc.nextDouble();
        System.out.print("Input second radius: ");
        double radius2 = sc.nextDouble();

        System.out.print("Input area1: ");
        double area1 = sc.nextDouble();
        System.out.print("Input area2: ");
        double area2 = sc.nextDouble();
        if(radius1 > radius2 || area1 > area2) {
            calculate(radius1);
            System.out.println("Area1 is bigger");
        } else {
            calculate(radius2);
            System.out.println("Area2 is bigger");
        }
    }

}

