package com.kitcenter.app.classwork.lesson5;

public class CircleArea {

    public double calculateCircleArea(double radius) {
        double circleArea = Math.PI * Math.pow(radius, 2);
        System.out.println("Area is " + circleArea);
        return circleArea;
    }

    public double calculateRadiusAreaBigger(double radius1, double radius2){
        double area1 = calculateCircleArea(radius1);
        double area2 = calculateCircleArea(radius2);
        if(radius1 > radius2 || area1 > area2) {
            System.out.println("Area1 is bigger");
            return radius1;
        } else {
            System.out.println("Area2 is bigger");
            return radius2;
        }
    }

}

