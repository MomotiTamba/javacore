package com.kitcenter.app.homework.lesson16;


public class Tractor extends Mashine {

    public int passenger;
    public int weight;
    public int wheel;

    public Tractor(String name, int speed) {
        super(name, speed);
        System.out.println("Name: " + name + ", Speed: " + speed);
    }

    public int getPassenger() {
        return passenger;
    }

    public void setPassenger(int passenger) {
        this.passenger = passenger;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWheel() {
        return wheel;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }

    @Override
    public String transportName() {
        System.out.println(name);
        return name;
    }

    @Override
    public int transportSpeed() {
        System.out.println(speed);
        return speed;
    }

    @Override
    public int transportWeight() {
        return getWeight();
    }

    @Override
    public int transportPassengers() {
        return getPassenger();
    }

    @Override
    public int transportWheels() {
        return getWheel();
    }

    @Override
    public String toString() {
        return "Tractor: " + name + "{" +
                "passenger=" + passenger +
                ", weight=" + weight +
                ", wheel=" + wheel +
                '}';
    }
}
