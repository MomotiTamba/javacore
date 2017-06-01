package com.kitcenter.app.classwork.lesson10;


import java.util.Arrays;

import static com.sun.xml.internal.bind.WhiteSpaceProcessor.replace;

public class StringToDisplay {

    public void setCharToString() {
        String stringToDisplay = "";
        char[] charArrayToString = {'a', 'b', 'c', 'd'};

        for (int i = 0; i < charArrayToString.length; i++) {
            stringToDisplay += charArrayToString[i];
        }
        System.out.println(stringToDisplay);
    }

    public void setCharToString(char[] charArray) {

        String stringToDisplay = "";

        for (int i = 0; i < charArray.length; i++) {
            stringToDisplay += charArray[i];
        }
        System.out.println(stringToDisplay);
    }

    public void setAutoCharToString() {

        String stringToDisplay = "";
        char[] charArrayToString = {'a', 'b', 'c', 'd'};
        stringToDisplay = Arrays.toString(charArrayToString);
        stringToDisplay.replace(",","");
        stringToDisplay.replace("[", "");
        stringToDisplay.replace("]", "");
        stringToDisplay.replace(" ", "");
        stringToDisplay.trim();
        System.out.println(stringToDisplay);
    }


}
