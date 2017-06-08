package com.kitcenter.app.classwork.lesson13;


public class Bicycle {
    public int wheelSize;
    public String color;
    private String name;
    private double price;

    public Bicycle(){
        System.out.println("Override default constructor");
    }

    public Bicycle(String name){
        this.name = name;
    }

    public Bicycle(String name, String color){
        this(name);
        this.color = color;
    }

    public Bicycle(int wheelSize, String color, String name) {
        this(color, name);
        this.wheelSize = wheelSize;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void printMe(){
        System.out.println("Print " + showNameAndColor());
    }

    private String showNameAndColor(){
        return name + " " + color;
    }
}
