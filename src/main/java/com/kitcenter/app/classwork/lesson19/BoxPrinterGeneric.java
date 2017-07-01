package com.kitcenter.app.classwork.lesson19;


public class BoxPrinterGeneric<T> {
    private T val;

    public BoxPrinterGeneric(T val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return "{" + val + "}";
    }

    public T getVal() {
        return val;
    }

    public static <T> boolean compare(BoxPrinterGeneric<T> bpg1, BoxPrinterGeneric<T> bpg2){
        return bpg1.getVal().equals(bpg2.getVal());
    }
}
