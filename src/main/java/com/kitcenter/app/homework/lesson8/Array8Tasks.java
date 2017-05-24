package com.kitcenter.app.homework.lesson8;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Array8Tasks {
    public void aTaskEvenElementsInArray() {
        System.out.println("Start\n - Task a:");
        int[] twentyArray = new int[21];
        for (int i = 0; i < twentyArray.length; i++) {
            if (i % 2 == 0 && i != 0) {
                twentyArray[i] = i;
                System.out.print(twentyArray[i] + " ");
            }
        }

        for (int i = 0; i < twentyArray.length; i++) {
            if (i % 2 == 0 && i != 0) {
                twentyArray[i] = i;
                System.out.print("\n" + twentyArray[i]);

            }
        }
        System.out.println("\nEnd\n");
    }

    public void bTaskOddElementsInArray() {
        System.out.println("Start\n - Task b:");
        int[] nineNineArray = new int[100];
        for (int i = 0; i < nineNineArray.length; i++) {
            if (i % 2 != 0 && i != 0) {
                nineNineArray[i] = i;
                System.out.print(nineNineArray[i] + " ");
            }
        }
        System.out.println();

        for (int i = nineNineArray.length; i > 0; i--) {
            if (i % 2 != 0 && i != 0) {
                nineNineArray[i] = i;
                System.out.print(nineNineArray[i] + " ");
            }
        }
        System.out.println("\nEnd\n");
    }

    public void cTaskRandomElemetnsInArray() {
        int count = 0;
        int[] randArray = new int[15];
        int[] evenArray = new int[15];

        System.out.print("Start\n - Task c:\nRandom Array(0;9): [");
        for (int i = 0; i < randArray.length; i++) {
            randArray[i] = (int) (Math.random() * 10);
            System.out.print(randArray[i] + " ");
            if (randArray[i] % 2 == 0 && randArray[i] != 0) {
                count += 1;
                evenArray[i] = randArray[i];
            }
        }
        System.out.print("\b]\nCount even: " + count + "\nEven Array: [");
        for (int j = 0; j < randArray.length; j++) {
            if (randArray[j] != 0) {
                System.out.print(evenArray[j] + " ");
            }
        }
        System.out.print("\b]\nEnd\n");
    }

    public void dTaskMinMaxElementsInArray() {
        int[] randArray = new int[15];

        System.out.print("Start\n - Task d: \nRandom Array(0;999): [");
        for (int i = 0; i < randArray.length; i++) {
            randArray[i] = (int) (Math.random() * 1000);
            System.out.print(randArray[i] + " ");
        }
        System.out.println("\b]");
        int max = randArray[0];
        int min = randArray[0];
        for (int i = 0; i < randArray.length; i++) {
            if (max < randArray[i]) {
                max = randArray[i];
            }
            if (min > randArray[i]) {
                min = randArray[i];
            }
        }
        System.out.println("Max element in array: " + max);
        System.out.println("Min element in array: " + min);
    }

    public void eTaskTwoDimensionalArray() {
        System.out.println("\nRandom array (0;99):\n");
        int[][] twoDimArray = new int[5][8];
        Random rnd = new Random();
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                twoDimArray[i][j] = rnd.nextInt( 89) + 10;
            }
        }

        for (int i = 0; i < twoDimArray.length; i++, System.out.println()) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                System.out.print(twoDimArray[i][j] + " ");
            }
        }
    }

    public void fTaskTwoDimensionalSortArray() {
        System.out.println("\nRandom Permutation List Generator\n");
        int[][] twoDimArray = new int[5][8];
        Random rnd = new Random();
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                twoDimArray[i][j] = rnd.nextInt(998) + 1;
            }
        }

        for (int i = 0; i < twoDimArray.length; i++, System.out.println()) {
            System.out.print("Line " + i + ": ");
            for (int j = 0; j < twoDimArray[i].length; j++) {
                System.out.print(twoDimArray[i][j] + "\t");
            }
        }
    }

    public void gTaskInputDigits(){
        String exit = "exit";
        Scanner sc = new Scanner(System.in);
        System.out.println("Input digits. If you want to quit, type \"exit\"");
        int digits = 0;
        while(sc.hasNextInt()){
            System.out.println("Input again:");
            int typeDigits = sc.nextInt();
            digits+=typeDigits;
        }
        System.out.println(digits);
    }
}
