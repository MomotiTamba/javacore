package com.kitcenter.runners.classwork.lesson18;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapRunner {
    public static void main(String[] args) {
        /*Map map = new HashMap();
        map.put(1, "hello");
        map.put(3, "qwerty");
        map.put(2, "123");
        map.put(2, "ABC");
        System.out.println(map.get(2));
        System.out.println(map);*/


        Set fullNameA = new HashSet();
        fullNameA.add("Aftar Petrov");
        fullNameA.add("Antaras Petrovych");
        fullNameA.add("Abramov Petrov");
        fullNameA.add("Avtonim Petrov");
        fullNameA.add("Arbitr Petrov");

        Set fullNameB = new HashSet();
        fullNameB.add("Brol Petrov");
        fullNameB.add("Boron Petrovych");
        fullNameB.add("Baskov Petrov");
        fullNameB.add("Basoi Petrov");
        fullNameB.add("Bida Petrov");

        Map addressBook = new HashMap();
        addressBook.put("A", fullNameA);
        addressBook.put("B", fullNameB);

        //System.out.println(addressBook.get("A"));

        Map mapAlphabetA = new HashMap();
        Map mapAlphabetB = new HashMap();
        Map mapName = new HashMap();

        mapAlphabetA.put("A", fullNameA);
        mapAlphabetB.put("B", fullNameB);

        mapName.put("A", mapAlphabetA);
        mapName.put("B", mapAlphabetB);

        System.out.println(mapName.get("B"));

        HashMap<String, String > map = new HashMap<>();
        map.put("qwe", ":qwe");
        map.put("234t", "sazxc");
        Set set1 = map.entrySet();
        for (Map.Entry entry: map.entrySet()){
            System.out.println(entry.getKey().toString() + entry.getValue().toString());
        }
    }
}
