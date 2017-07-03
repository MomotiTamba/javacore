package com.kitcenter.runners.classwork.lesson19;


import com.kitcenter.app.classwork.lesson19.BoxPrinterGeneric;

public class BoxPrinterGenericRunner {
    public static void main(String[] args) {
        BoxPrinterGeneric<Integer> boxPrinterGeneric = new BoxPrinterGeneric<>(new Integer(11));
        BoxPrinterGeneric<Integer> boxPrinterGeneric2 = new BoxPrinterGeneric<>(new Integer(11));
        Integer integer = boxPrinterGeneric.getVal();
        System.out.println(integer);

        BoxPrinterGeneric<String> boxPrinterGeneric1 = new BoxPrinterGeneric<>(new String("Hello"));
        String string = boxPrinterGeneric1.getVal();
        System.out.println(string);

        boolean test = BoxPrinterGeneric.compare(boxPrinterGeneric, boxPrinterGeneric2);
        System.out.println(test);
    }
}
