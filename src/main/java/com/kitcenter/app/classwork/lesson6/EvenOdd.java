package com.kitcenter.app.classwork.lesson6;


public class EvenOdd {

    public int checkEvenOdd(int evenOddValue) {
        if (evenOddValue % 2 == 0) {
            System.out.println("Value " + evenOddValue + " is even");
        } else {
            System.out.println("Value " + evenOddValue + " is odd");
        }
        return evenOddValue;
    }

}
