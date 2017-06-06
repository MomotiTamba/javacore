package com.kitcenter.app.homework.lesson11;

import java.util.Arrays;

public class ArrayParser {

    public int[] stringToInt(String stringValue){
        String[] stringArray = stringValue.trim().split(";");
        int[] intArray = new int[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            intArray[i] = Integer.parseInt(stringArray[i]);
        }
        System.out.println(Arrays.toString(intArray));
        return intArray;
    }

    public void sortArrayAscending(int[] intArray){
        Arrays.sort(intArray);
        System.out.println(Arrays.toString(intArray));
    }

    public void sortArrayDescending(int[] intArray){
        Arrays.parallelSort(intArray);
        System.out.println(Arrays.toString(intArray));
    }
}
