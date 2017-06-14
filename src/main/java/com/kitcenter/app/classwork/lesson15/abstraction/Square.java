package com.kitcenter.app.classwork.lesson15.abstraction;


public class Square extends Figure {

    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }
}
