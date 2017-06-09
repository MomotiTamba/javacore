package com.kitcenter.app.homework.lesson11;


import com.kitcenter.app.classwork.lesson11.Encoder;

import java.util.Scanner;

public class MenuListLesson11 {

    private boolean key = true;
    Scanner sc = new Scanner(System.in);
    ArrayParser arrayParser = new ArrayParser();
    Encoder encoder = new Encoder();
    Task11Message task11Message = new Task11Message();

    private Scanner creationScanner(){
        Scanner scanner = new Scanner(System.in);
        return scanner;
    }

    public void mainMenuListLesson11() {
        task11Message.welcomeMessageTask11();
        while (key) {
            int choice = creationScanner().nextInt();
            switch (choice) {
                case 1:
                    subMenuFirstList1Lesson11();
                    task11Message.mainMenuMessageTask11();
                    break;
                case 2:
                    subMenuFirstList2Lesson11();
                    task11Message.mainMenuMessageTask11();
                    break;
                case 3:
                    subMenuFirstList3Lesson11();
                    task11Message.mainMenuMessageTask11();
                    break;
                case 4:
                    subMenuFirstList4Lesson11();
                    task11Message.mainMenuMessageTask11();
                    break;
                case 0:
                    sc.close();
                    return;
                default:
                    System.out.println("Wrong choice, try again:");
            }
        }
    }

    private void subMenuFirstList1Lesson11() {
        while (key) {
            System.out.println("1. Begin to input string\n0. back to main");
            int choice = creationScanner().nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Input integers through a semicolon(\";\"):");
                    int[] intArray = new int[0];
                    try {
                        intArray = arrayParser.stringToInt(creationScanner().next());
                    } catch (Exception e) {
                        System.out.println("You type a wrong format, please input only int digits");
                    }
                    subMenuSecondList1Lesson11(intArray);
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Wrong choice, try again:");
            }
        }
    }

    private void subMenuSecondList1Lesson11(int[] intArray) {
        while (key) {
            System.out.println("1. Sort your line ascending\n2. Sort your line descending\n0. back to main");
            int choice = creationScanner().nextInt();
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

    private void subMenuFirstList2Lesson11() {
        while (key) {
            System.out.println("1. Begin to input string\n0. back to main");
            int choice = creationScanner().nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Input your separator and then input your line via this separator(Exceptions: *, ^, $, ?, [, ], |):");
                    try {
                        arrayParser.userSeparatorArray(creationScanner().nextLine(), creationScanner().nextLine());
                    } catch (Exception e) {
                        System.out.println("You type wrong format, please type correct separator(Exceptions: *, ^, $, ?, [, ], |)");
                    }
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Wrong choice, try again:");
            }
        }
    }

    private void subMenuFirstList3Lesson11() {
        while (key) {
            System.out.println("1. Begin to input string\n0. back to main");
            int choice = creationScanner().nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Input your line and then enter the keyword:");
                    arrayParser.userKeywordLine(creationScanner().nextLine(), creationScanner().nextLine());
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Wrong choice, try again:");
            }
        }
    }

    private void subMenuFirstList4Lesson11() {
        while (key) {
            System.out.println("1. Begin to input string\n0. back to main");
            int choice = creationScanner().nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Input your string for encryption:");
                    encoder.stringEncode(creationScanner().nextLine());
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Wrong choice, try again:");
            }
        }
    }
}
