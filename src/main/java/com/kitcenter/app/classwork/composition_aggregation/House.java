package com.kitcenter.app.classwork.composition_aggregation;


public class House {

    private Flat[] flats;

    public House(Flat[] flats){
        this.flats = flats;
    }
    public Flat[] getFlats() {
        return flats;
    }
}
