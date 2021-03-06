package com.kitcenter.app.classwork.lesson19;


import com.kitcenter.runners.classwork.lesson19.Pair;

public class OrderPair<K, V> implements Pair {

    private K key;
    private V value;

    public OrderPair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}
