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
        /*if (keyword == null || keyword == ""){
            return stringLine;
        }*/
        String[] stringArray = stringLine.split(" ");
        //System.out.println(Arrays.toString(stringArray));
        /*for (int i = 0; i < stringArray.length; i++) {
            if (i == keyword) {
                String s = stringArray.toString().replace(keyword, " ");
                System.out.println(s);
            }
            //System.out.println(Arrays.toString(stringArray));
        }*/
        return stringLine;
    }
}
