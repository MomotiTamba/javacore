package com.kitcenter.runners.classwork.lesson19;


import com.kitcenter.app.classwork.lesson19.GenericAdding;

public class WithoutGeneric {
    public static void main(String[] args) {

        GenericAdding genericAdding = new GenericAdding();
        genericAdding.add("String");
        genericAdding.add(777);
    }
}
