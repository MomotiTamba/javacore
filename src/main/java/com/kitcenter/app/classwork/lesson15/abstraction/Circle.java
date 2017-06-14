package com.kitcenter.app.classwork.lesson15.abstraction;


public class Circle extends Figure {

    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2* Math.PI * radius;
    }
}
