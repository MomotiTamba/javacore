package com.kitcenter.app.classwork.lesson15.interfaces;


public interface Repair {

    default String fix(Bicycle bicycle, int value){
        bicycle.changeGear(value);
        return "Change it";
    }
}
