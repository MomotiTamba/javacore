package com.kitcenter.app.homework.lesson10;


public class TaskMessage {

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
        sb.append("1. \n");
        sb.append("2. Guess even or odd\n");
        sb.append("3. Calculator\n");
        sb.append("4. Calculate the circle area\n");
        sb.append("\n0. Stop the program\n");
        sb.append("\nInput your point: ");
        System.out.print(sb);
    }
}
