package com.kitcenter.app.classwork.lesson19;


public class OrderPair<K, V> {

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
