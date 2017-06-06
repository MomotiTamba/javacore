package com.kitcenter.app.homework.lesson10;


import com.kitcenter.app.classwork.lesson10.Palindrome;

import java.util.Scanner;

public class MenuListLesson10 {

    private boolean key = true;
    Palindrome palindrome = new Palindrome();
    Scanner sc = new Scanner(System.in);
    TaskMessage taskMessage = new TaskMessage();

    public void mainMenuLesson10() {
        taskMessage.welcomeMessage();
        while (sc.hasNextInt()) {
            int select = sc.nextInt();
            switch (select) {
                case 1:
                    subMenu1Lesson10();
                    taskMessage.mainMenuMessage();
                    break;
                case 2:
                    subMenu2Lesson10();
                    taskMessage.mainMenuMessage();
                    break;
                case 3:
                    subMenu3Lesson10();
                    palindrome.isPalindromeBuilder2(sc.nextLine());
                    taskMessage.mainMenuMessage();
                    break;
                case 4:
                    subMenu4Lesson10();
                    taskMessage.mainMenuMessage();
                    break;
                case 5:
                    subMenu5Lesson10();
                    taskMessage.mainMenuMessage();
                    break;
                case 0:
                    System.out.println("Quit\nCall me later");
                    return;
                default:
                    System.out.println("Wrong choice, try again");
            }
        }
    }

    public void subMenu1Lesson10() {
        while (key) {
            System.out.println("1. Begin to input string\n0. back to main");
            int choiceTrigger = sc.nextInt();
            switch (choiceTrigger) {
                case 1:
                    System.out.print("Input your string: " + sc.nextLine());
                    System.out.println("Your string is palindrome: " + palindrome.isPalindromeString(sc.nextLine()));
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Wrong choice, try again");
            }
        }
    }

    public void subMenu2Lesson10() {
        while (key) {
            System.out.println("1. Begin to input string\n0. back to main");
            int choiceTrigger = sc.nextInt();
            switch (choiceTrigger) {
                case 1:
                    System.out.print("Input your string: " + sc.nextLine());
                    System.out.println("Your string is palindrome: " + palindrome.isPalindromeBuilder1(sc.nextLine()));
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Wrong choice, try again:");
            }
        }
    }

    public void subMenu3Lesson10() {
        while (key) {
            System.out.println("1. Begin to input string\n0. back to main");
            int choiceTrigger = sc.nextInt();
            switch (choiceTrigger) {
                case 1:
                    System.out.print("Input your string: " + sc.nextLine());
                    System.out.println("Your string is palindrome: " + palindrome.isPalindromeBuilder2(sc.nextLine()));
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Wrong choice, try again");
            }
        }
    }

    public void subMenu4Lesson10() {
        while (key) {
            System.out.println("1. Begin to input string\n0. back to main");
            int choiceTrigger = sc.nextInt();
            switch (choiceTrigger) {
                case 1:
                    System.out.print("Input your string: " + sc.nextLine());
                    System.out.println("Your string is palindrome: " + palindrome.isPalindromeReverse1(sc.nextLine()));
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Wrong choice, try again");
            }
        }
    }

    public void subMenu5Lesson10() {
        while (key) {
            System.out.println("1. Begin to input string\n0. back to main");
            int choiceTrigger = sc.nextInt();
            switch (choiceTrigger) {
                case 1:
                    System.out.print("Input your string: " + sc.nextLine());
                    System.out.println("Your string is palindrome: " + palindrome.isPalindromeReverse2(sc.nextLine()));
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Wrong choice, try again");
            }
        }
    }
}
