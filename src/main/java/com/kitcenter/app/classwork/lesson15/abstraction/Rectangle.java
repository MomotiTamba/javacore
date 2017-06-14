package com.kitcenter.app.classwork.lesson15.abstraction;


public class Rectangle extends Figure{

    private int side1;
    private int side2;

    public Rectangle(int side1, int side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public double getPerimeter() {
        return side1 * side2;
    }
}
