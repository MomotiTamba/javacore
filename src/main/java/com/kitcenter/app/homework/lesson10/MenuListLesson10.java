package com.kitcenter.app.homework.lesson10;


import com.kitcenter.app.classwork.lesson10.Palindrome;

import java.util.Scanner;

public class MenuListLesson10 {

    Palindrome palindrome = new Palindrome();
    Scanner sc = new Scanner(System.in);

    public void mainMenuLesson10(){

        while(sc.hasNextInt()){
            int select = sc.nextInt();
            System.out.println("You type: " + select);
            switch (select){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                default:

            }
        }
    }
}
