package com.kitcenter.app.classwork.lesson19;


public class OrderUtil {

    public static <K, V> boolean compare(OrderPair<K, V> p1, OrderPair<K, V> p2){
        return p1.getKey().equals(p2.getKey()) && p1.getValue().equals(p2.getValue());
    }
}
