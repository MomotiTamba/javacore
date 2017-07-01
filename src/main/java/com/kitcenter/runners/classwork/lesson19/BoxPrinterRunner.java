package com.kitcenter.runners.classwork.lesson19;

import com.kitcenter.app.classwork.lesson19.BoxPrinter;

public class BoxPrinterRunner {
    public static void main(String[] args) {
        BoxPrinter boxPrinter = new BoxPrinter(new Integer(10));
        BoxPrinter boxPrinter1 = new BoxPrinter(new String("Hello"));
        System.out.println(boxPrinter);

        Integer integer = (Integer) boxPrinter.getVal();
        String string = (String) boxPrinter1.getVal();
    }
}
