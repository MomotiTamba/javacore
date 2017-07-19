package com.kitcenter.app.classwork.lesson19;


import com.kitcenter.runners.classwork.lesson19.Pair;

public class OrderUtil {

    public static <K, V extends Pair> boolean compare(Pair<K, V> p1, Pair<K, V> p2){
        return p1.getKey().equals(p2.getKey()) && p1.getValue().equals(p2.getValue());
    }

    /*public static <K , V> boolean compare(OrderPair<K, V> p1, OrderPair<K, V> p2){
        return p1.getKey().equals(p2.getKey()) && p1.getValue().equals(p2.getValue());
    }*/
}
