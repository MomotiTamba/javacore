package com.kitcenter.runners.classwork.lesson10;


import com.kitcenter.app.classwork.lesson10.Palindrome;
import com.kitcenter.app.classwork.lesson10.StringToDisplay;

public class Lesson10Runner {
    public static void main(String[] args) {
        StringToDisplay stringToDisplay = new StringToDisplay();
        stringToDisplay.setCharToString();
        stringToDisplay.setCharToString(new char[]{'p', 'r', 'i', 'v', 'e', 't'});
        stringToDisplay.setAutoCharToString();

        /*String toFloat = "0.44";
        float fir = Float.valueOf(toFloat);
        float fir1 = Float.parseFloat(toFloat);
        System.out.println(fir);
        System.out.println(fir1);

        String aString = "11";
        int aInt = Integer.valueOf(aString);
        double aDouble = Double.valueOf(aString);
        long aLong = Long.valueOf(aString);
        boolean aBoolean = Boolean.valueOf(aString);
        System.out.println(aInt);
        System.out.println(aDouble);
        System.out.println(aLong);
        System.out.println(aBoolean);

        String center = new String("KIT");
        String center2 = new String("KIT");
        System.out.println(center == center2);
        System.out.println(center.equals(center2));*/

        /*String center3 = "KIT";
        //System.out.println(center.intern() == center3);
        String text = "3, 4, 5, 6, 7";
        String[] splitText = text.split(",");
        System.out.println(splitText[0]);
        String trimText = text.trim();
        System.out.println(trimText);
        int iText = text.hashCode();
        System.out.println(iText);
        boolean matchesText = text.matches("3, 4, 5, 6, 7");
        System.out.println(matchesText);
        int compareText = text.compareTo(", 4, 5, 6, 7");
        System.out.println(compareText);*/

        Palindrome palindrome = new Palindrome();
        System.out.println(palindrome.isPalindrome("mozom"));
        System.out.println(palindrome.isPalindromeString("mozom"));
    }
}
