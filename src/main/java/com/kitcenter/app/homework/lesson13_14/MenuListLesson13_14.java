package com.kitcenter.app.homework.lesson13_14;


import java.util.Scanner;

public class MenuListLesson13_14 {

    WhiteCollar whiteCollar = new WhiteCollar();
    Task13Message task13Message = new Task13Message();

    private Scanner creationScanner() {
        Scanner scanner = new Scanner(System.in);
        return scanner;
    }

    public void menuListLesson13() {
        task13Message.welcomeMessageTask13();
        while (true) {
            int choice = creationScanner().nextInt();
            switch (choice) {
                case 1:
                    subMenuFirstList1Lesson11();
                    task13Message.mainMenuMessageTask13();
                    break;
                case 2:
                    subMenuFirstList2Lesson11();
                    task13Message.mainMenuMessageTask13();
                    break;
                case 0:
                    creationScanner().close();
                    return;
                default:
                    System.out.println("Wrong choice try again");
            }
        }
    }

    private void subMenuFirstList1Lesson11() {
        while (true) {
            System.out.println("1. Begin to input string\n0. back to main");
            int choice = 0;
            try {
                choice = creationScanner().nextInt();
            } catch (Exception e) {
                System.out.println("Wrong input, please type integers 1 or 0");
            }
            switch (choice) {
                case 1:
                    whiteCollar.setCompanyName(creationScanner().nextLine());
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Wrong choice, try again:");
            }
        }
    }

    private void subMenuFirstList2Lesson11() {
        while (true) {
            System.out.println("1. Begin to input string\n0. back to main");
            int choice = 0;
            try {
                choice = creationScanner().nextInt();
            } catch (Exception e) {
                System.out.println("Wrong input, please type integers 1 or 0");
            }
            switch (choice) {
                case 1:
                    System.out.println("Input \'name\', \'age\' and \'company name\' through \"Enter\": ");
                    try {
                        new WhiteCollar(creationScanner().nextLine(), creationScanner().nextInt(), creationScanner().nextLine());
                    } catch (Exception e) {
                        System.out.println("You type wrong format, please type first name - strings, second - integers and third - strings");
                    }
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Wrong choice, try again:");
            }
        }
    }
}
