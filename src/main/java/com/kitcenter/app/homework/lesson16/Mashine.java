package com.kitcenter.app.homework.lesson16;


public abstract class Mashine implements Run {

    public static final int MAX_SPEED = 189;
    public static final int MIN_SPEED = 1;
    public static final int MAX_PASSENGER = 21;
    public static final int MIN_PASSENGER = 1;
    protected String name;
    protected int speed;

    public Mashine(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }
}
