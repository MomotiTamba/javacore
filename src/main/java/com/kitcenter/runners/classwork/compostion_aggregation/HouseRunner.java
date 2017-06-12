package com.kitcenter.runners.classwork.compostion_aggregation;


import com.kitcenter.app.classwork.composition_aggregation.Flat;
import com.kitcenter.app.classwork.composition_aggregation.House;



public class HouseRunner {
    public static void main(String[] args) {
        Flat[] flats = new Flat[3];

        Flat flat97 = new Flat();
        Flat flat98 = new Flat() ;
        Flat flat99 = new Flat() ;

        flats[0] = flat97;
        flats[1] = flat98;
        flats[2] = flat99;

        //Composition, creates a house only once with flats
        House house = new House(flats);
        Flat[] houseFlats = house.getFlats();
        for (Flat flat : houseFlats){
            flat.setItem("Standard doors");
            flat.setFacilities("Standard wiring");
        }

        //Aggregation - replacing with a new door
        Flat houseFlat97 = houseFlats[0];
        houseFlat97.setItem("New door");
        houseFlat97.setFacilities("New wiring");
        for (Flat flat : houseFlats){
            System.out.println(flat.getItem() + "; " + flat.getFacilities());
        }
    }
}
