package com.kitcenter.runners.classwork.lesson8;


import com.kitcenter.app.classwork.lesson5.Car;
import com.kitcenter.app.classwork.lesson5.Flat;
import com.kitcenter.app.classwork.lesson8.ArrayUtil;

import java.util.Arrays;

public class ArrayRunner {
    public static void main(String[] args) {

        int[] intArr = {3, 4, 5, 6};
        int[] intArrInitial = new int[4];
        intArrInitial[0] = 3;
        intArrInitial[1] = 4;
        intArrInitial[2] = 5;
        intArrInitial[3] = 6;
        intArrInitial[0] = 7;
        System.out.println(intArrInitial[0]);

        for (int item : intArr) {
            System.out.println(item);
        }
        for (int i = 0; i < intArr.length; i++) {
            System.out.println(intArr[i]);
        }
        Car[] carArr = new Car[2];
        Car bmw = new Car();
        bmw.name = "BMW";
        Car audi = new Car();
        audi.name = "Audi";
        carArr[0] = bmw;
        carArr[1] = audi;

        for (Car car : carArr) {
            System.out.println(car.name);
        }

        long[] longArray = new long[4];
        long tmp = 1000000000000000000L;
        for (int i = 0; i < longArray.length; i++) {
            tmp *= 999999999;
            longArray[i] = tmp;
        }

        for (long lArr : longArray) {
            System.out.println(lArr);
        }

        Flat[] flatArray = new Flat[2];
        Flat adress1 = new Flat();
        Flat adress2 = new Flat();
        adress1.name = "Shevchenko 1, 2";
        adress2.name = "Gagarina 15, 25";
        flatArray[0] = adress1;
        flatArray[1] = adress2;

        for (Flat flat : flatArray) {
            System.out.println("Adress " + flat.name);
        }

        int[][] a = new int[2][2];
        a[0][0] = 1;
        a[0][1] = 2;
        a[1][0] = 3;
        a[1][1] = 4;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = i*j;
                System.out.println(a[i][j]);
            }
        }

        int[][] multiDimenEmpty = new int[2][];
        multiDimenEmpty[0] = new int[3];
        multiDimenEmpty[1] = new int[4];

        int[][] multiDimenFull = new int[2][];
        multiDimenFull[0] = new int[]{3, 4, 5};
        multiDimenFull[1] = new int[]{5, 6, 7, 8};
        System.out.println("*****Array one*****");
        int [][] intArray = new int[2][3];
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray[i].length; j++) {
                intArray[i][j] = i*j;
                System.out.println(Arrays.deepToString(intArray));
            }
        }
        System.out.println("*******Array two******");
        ArrayUtil arrayUtil = new ArrayUtil();
        int [][] intArrayU1 = arrayUtil.createAndFill(2, 3);
        System.out.println(Arrays.deepToString(intArrayU1));

        System.out.println("******Array three******");

        for (int[] itemArray : intArrayU1){
            for (int item : itemArray){
                System.out.println(item);
            }
        }
        int[] intArrayU2 = arrayUtil.createAndFill(3);
        System.out.println(Arrays.toString(intArrayU2));
        for(int item : intArrayU2){
            System.out.println(item);
        }
    }
}
