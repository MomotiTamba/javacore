package com.kitcenter.app.classwork.lesson19;


public class GenericAdding {

    String[] strings = new String[3];
    Integer[] integers = new Integer[3];

    public void add(String item) {
        strings[strings.length - 1] = item;
    }

    public void add(Integer item) {
        integers[integers.length - 1] = item;
    }
}
