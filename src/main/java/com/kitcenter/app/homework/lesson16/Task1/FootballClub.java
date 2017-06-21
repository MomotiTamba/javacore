package com.kitcenter.app.homework.lesson16.Task1;


public class FootballClub extends SportsClub{

    @Override
    public void wins() {
        System.out.println("wins");
    }

    @Override
    public void draws() {
        System.out.println("draws");
    }

    @Override
    public void defeats() {
        System.out.println("defeat");
    }
}
