package com.kitcenter.runners.classwork.lesson17;


import java.util.ArrayList;

public class CollectionsRunner {
    public static void main(String[] args) {
        String abc = "abc";
        String abc2 = "abc2";
        ArrayList<String> myStringArrayList = new ArrayList<>();
        myStringArrayList.add(abc);
        myStringArrayList.add(abc);
        myStringArrayList.add(abc);
        myStringArrayList.add(abc);
        myStringArrayList.add(abc);
        myStringArrayList.add(abc);
        myStringArrayList.add(abc);
        myStringArrayList.add(abc);
        myStringArrayList.add(abc);
        myStringArrayList.add(abc);
        myStringArrayList.add(abc);
        System.out.println("Before remove: " + myStringArrayList.size());
        myStringArrayList.remove(10);
        System.out.println("After remove: " + myStringArrayList.size());
        System.out.println(myStringArrayList.get(9));
        System.out.println(myStringArrayList.size());
                /*System.out.println(myStringArrayList);
        myStringArrayList.remove(1);
        myStringArrayList.clear();
        System.out.println(myStringArrayList);*/
    }
}
