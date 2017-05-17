package com.kitcenter.app.classwork.lesson8;


public class ArrayUtil {

    public int[][] createAndFill(int dimension, int length) {
        int[][] intArray = new int[dimension][length];
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray[i].length; j++) {
                intArray[i][j] = i * j;
            }
        }
        return intArray;
    }

    public int[] createAndFill(int dim) {
        int[] intArray = new int[dim];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i;
        }
        return intArray;
    }
}
