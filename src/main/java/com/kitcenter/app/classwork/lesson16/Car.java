package com.kitcenter.app.classwork.lesson16;


public class Car {

    private String name;
    private int speed;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;

        Car car = (Car) o;

        return getSpeed() == car.getSpeed();
    }

    @Override
    public int hashCode() {
        return getSpeed();
    }
}
