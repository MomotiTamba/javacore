package com.kitcenter.app.classwork.lesson6;


import java.util.Scanner;

public class EvenOdd {

    Scanner sc = new Scanner(System.in);

    public void checkEvenOdd() {
        System.out.print("Input a value: ");
        int input = sc.nextInt();
        if (input % 2 == 0) {
            System.out.println("Value " + input + " is even");
        } else {
            System.out.println("Value " + input + " is odd");
        }
    }

}
