package com.kitcenter.app.classwork.lesson19;


public class BoxPrinter {

    private Object val;

    public BoxPrinter(Object val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return "{" + val + "}";
    }

    public Object getVal() {
        return val;
    }
}
