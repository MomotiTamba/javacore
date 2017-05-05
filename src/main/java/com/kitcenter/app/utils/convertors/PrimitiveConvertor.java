package com.kitcenter.app.utils.convertors;


public class PrimitiveConvertor {

    public char floatToChar(float floatValue) {
        char charValue = (char) floatValue;
        System.out.println("Input float value is " + floatValue + ". Output char value is " + charValue);
        return charValue;
    }

    public char intToChar(int intValue) {
        char charValue = (char) intValue;
        System.out.println("Input float value is " + intValue + ". Output char value is " + charValue);
        return charValue;
    }

    public int charToInt(char charValue) {
        int intValue = (int) charValue;
        System.out.println("Input float value is " + charValue + ". Output char value is " + intValue);
        return charValue;
    }
}
