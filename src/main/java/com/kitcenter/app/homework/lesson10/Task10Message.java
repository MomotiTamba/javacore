package com.kitcenter.app.homework.lesson10;


public class Task10Message {

    public void welcomeMessage() {
        StringBuilder sb = new StringBuilder();
        sb.append("Hello! I'm Pall\n");
        sb.append("I can check your input line on the palindrome in five ways\n");
        sb.append("So, let's fun!");
        System.out.println(sb);
        mainMenuMessage();
    }

    public void mainMenuMessage() {
        StringBuilder sb = new StringBuilder();
        sb.append("Please choose one way to check palindrome:\n");
        sb.append("1. 1st method\n");
        sb.append("2. 2nd method\n");
        sb.append("3. 3rd method\n");
        sb.append("4. 4th method\n");
        sb.append("5. 5th method\n");
        sb.append("\n0. Stop the program\n");
        sb.append("\nInput your choice: ");
        System.out.print(sb);
    }
}
