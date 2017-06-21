package com.kitcenter.runners.classwork.lesson17;


import java.util.ArrayList;

public class CollectionsRunner {
    public static void main(String[] args) {
        String abc = "abc";
        String abc2 = "abc2";
        ArrayList<String> myStringArrayList = new ArrayList<>();
        myStringArrayList.add(0, abc);
        myStringArrayList.add(1, abc2);
        int size = myStringArrayList.size();
        System.out.println(size);
        System.out.println(myStringArrayList);
        myStringArrayList.remove(1);
        myStringArrayList.clear();
        System.out.println(myStringArrayList);
    }
}
