package com.kitcenter.app.homework.lesson11;


import java.util.Scanner;

public class MenuListLesson11 {

    private boolean key = true;
    Scanner sc = new Scanner(System.in);
    ArrayParser arrayParser = new ArrayParser();
    Task11Message task11Message = new Task11Message();

    public void mainMenuListLesson11() {
        while (key) {
            task11Message.welcomeMessageTask11();
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    subMenuListLesson11();
                    task11Message.mainMenuMessageTask11();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Wrong choice, try again:");
            }
        }
    }

    private void subMenuListLesson11() {
        while (key) {
            System.out.println("1. Begin to input string through \";\"\n0. back to main");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Input your string:");
                    int[] intArray = arrayParser.stringToInt(sc.next());
                    subOneMenuListLesson11(intArray);
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Wrong choice, try again:");
            }
        }
    }

    private void subOneMenuListLesson11(int[] intArray) {
        while (key) {
            System.out.println("1. Sort your massive ascending\n2. Sort your massive descending\n0. back to main");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    arrayParser.sortArrayAscending(intArray);
                    return;
                case 2:
                    arrayParser.sortArrayDescending(intArray);
                    return;
                case 0:
                    return;
                default:
                    System.out.println("Wrong choice, try again:");
            }
        }
    }
}
