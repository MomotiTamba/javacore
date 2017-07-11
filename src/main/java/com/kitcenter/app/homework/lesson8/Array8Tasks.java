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
            if (i % 2 != 0) {
                nineNineArray[i] = i;
                System.out.print(nineNineArray[i] + " ");
            }
        }
        System.out.println();
        for (int i = nineNineArray.length; i > 0; i--) {
            if (i % 2 != 0) {
                nineNineArray[i] = i;
                System.out.print(nineNineArray[i] + " ");
            }
        }
        System.out.println("\nEnd\n");
    }

    public void cTaskRandomElementsInArray() {
        int countEven = 0;
        int j = 0;
        int[] randArray = new int[15];
        System.out.print("Start\n - Task c:\nRandom Array(0;9): [");
        for (int i = 0; i < randArray.length; i++) {
            randArray[i] = (int) (Math.random() * 100);
            System.out.print(randArray[i] + " ");
            if (randArray[i] % 2 == 0 && randArray[i] != 0) {
                countEven += 1;
            }
        }
        System.out.print("\b]\nEven count: " + countEven + "\nEven array: [");
        int[] evenArray = new int[countEven];
        for (int i = 0; i < randArray.length; i++) {
            if (randArray[i] % 2 == 0 && randArray[i] != 0) {
                evenArray[j] = randArray[i];
                System.out.print(evenArray[j] + " ");
                j++;
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
        System.out.println("\nEnd\n");
    }

    public void eTaskTwoDimensionalArray() {
        System.out.println("Start\n - Task c:\nRandom array (0;99):\n");
        int[][] twoDimArray = new int[5][8];
        Random rnd = new Random();
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                twoDimArray[i][j] = rnd.nextInt(89) + 10;
            }
        }

        for (int i = 0; i < twoDimArray.length; i++, System.out.println()) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                System.out.print(twoDimArray[i][j] + " ");
            }
        }
        System.out.println("\nEnd\n");
    }

    public void fTaskTwoDimensionalSortArray() {
        System.out.println("Start\n - Task f:\nRandom Permutation List Generator\n");
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
        System.out.println("\nEnd\n");
    }

    public void gTaskInputDigits() {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        try {
            System.out.println("Start\n - Task g:\nType \"1\" - and input numbers through \"Enter\",\nType \"exit\" - if you want to stop program");
            while (sc.hasNext()) {
                String s = sc.next();
                switch (s) {
                    case "1":
                        while (sc.hasNextInt()) {
                            System.out.print("Input numbers else or \"exit\": ");
                            sum += sc.nextInt();
                        }
                        System.out.println(sum);
                        break;
                    case "exit":
                        System.out.println("Program stop!");
                        sc.close();
                        return;
                    default:
                        System.out.println("You typing something wrong, try again(type 1 or exit):");
                }
            }
        } catch (Exception e) {
            System.out.println("error " + e.getMessage());
        } finally {
            if (sc != null) {
                sc.close();
            }
        }
        System.out.println("\nEnd\n");
    }
}
