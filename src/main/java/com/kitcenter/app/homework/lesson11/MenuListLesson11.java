package com.kitcenter.app.homework.lesson11;


import java.util.Scanner;

public class MenuListLesson11 {

    private boolean key = true;
    Scanner sc = new Scanner(System.in);
    ArrayParser arrayParser = new ArrayParser();
    Task11Message task11Message = new Task11Message();

    public void mainMenuListLesson11() {
        task11Message.welcomeMessageTask11();
        while (key) {
            int choice = sc.nextInt();
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
                case 0:
                    return;
                default:
                    System.out.println("Wrong choice, try again:");
            }
        }
    }

    private void subMenuFirstList1Lesson11() {
        while (key) {
            System.out.println("1. Begin to input string\n0. back to main");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Input integers through a semicolon(\";\"):");
                    int[] intArray = arrayParser.stringToInt(sc.next());
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

    private void subMenuFirstList2Lesson11() {
        while (key) {
            System.out.println("1. Begin to input string\n0. back to main");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Input your separator and then input your line via this separator(Exceptions: *, ^, $, ?, [, ], |):");
                    arrayParser.userSeparatorArray(sc.next(), sc.next());
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
            Scanner sc1 = new Scanner(System.in);
            System.out.println("1. Begin to input string\n0. back to main");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Input your line and then enter the keyword:");
                    arrayParser.userKeywordLine(sc1.nextLine(), sc1.nextLine());
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Wrong choice, try again:");
            }
        }
    }
}
