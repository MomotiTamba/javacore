package com.kitcenter.app.homework.lesson11;

import java.util.Arrays;

public class ArrayParser {

    public int[] stringToInt(String stringValue) {
        String[] stringArray = stringValue.trim().split(";");
        int[] intArray = new int[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            intArray[i] = Integer.parseInt(stringArray[i]);
        }
        System.out.println(Arrays.toString(intArray));
        return intArray;
    }

    public void sortArrayAscending(int[] intArray) {
        Arrays.sort(intArray);
        System.out.println(Arrays.toString(intArray));
    }

    public void sortArrayDescending(int[] intArray) {
        Arrays.parallelSort(intArray);
        System.out.println(Arrays.toString(intArray));
    }

    public String[] userSeparatorArray(String separator, String stringLine) {
        String[] stringArray = stringLine.trim().split(separator);
        System.out.println(Arrays.toString(stringArray));
        return stringArray;
    }

    public String userKeywordLine(String stringLine, String keyword) {
        if (stringLine != null || stringLine.length() > 1) {
            String[] stringArray = stringLine.split(" ");
            for (int i = 0; i < stringArray.length; i++) {
                if (stringArray[i].equalsIgnoreCase(keyword)) {
                    stringArray[i] = "";
                    System.out.println("Keyword is: " + keyword);
                }
            }
            System.out.println("String line: " + Arrays.toString(stringArray).replaceAll("\\W", " "));
        } else {
            System.out.println("Wrong string line");
        }
        return stringLine;
    }
}
