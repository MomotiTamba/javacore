package com.kitcenter.app.homework.lesson16.Task1;


public abstract class SportsClub {
    private String name;
    private String location;
    private String statistic;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getStatistic() {
        return statistic;
    }

    public void setStatistic(String statistic) {
        this.statistic = statistic;
    }

    public void showName(){
        System.out.println(getName());
    }

    public void showLocation(){
        System.out.println(getLocation());;
    }

    public void showStatistic(){
        System.out.println(getStatistic());
    }

    public abstract void wins();
    public abstract void draws();
    public abstract void defeats();

}

