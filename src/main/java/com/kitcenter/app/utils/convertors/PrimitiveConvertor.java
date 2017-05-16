package com.kitcenter.app.utils.convertors;


public class PrimitiveConvertor {

    public char floatToChar(float floatValue) {
        char charValue = (char) floatValue;
        System.out.println("Input float value is " + floatValue + ". Output char value is " + charValue);
        return charValue;
    }

    public char intToChar(int intValue) {
        char charValue = (char) intValue;
        System.out.println("Input int value is " + intValue + ". Output char value is " + charValue);
        return charValue;
    }

    public char doubleToChar(double doubleValue) {
        char charValue = (char) doubleValue;
        System.out.println("Input string value is " + doubleValue + ". Output char value is " + charValue);
        return charValue;
    }
}
