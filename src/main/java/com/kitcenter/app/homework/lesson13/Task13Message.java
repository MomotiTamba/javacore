package com.kitcenter.app.homework.lesson13;


public class Task13Message{

    public void welcomeMessageTask13() {
        StringBuilder sb = new StringBuilder();
        sb.append("Hello! I'm Eva\n");
        sb.append("I can check your string for valid input\n");
        sb.append("I guess, we should check it!");
        System.out.println(sb);
        mainMenuMessageTask13();
    }

    public void mainMenuMessageTask13() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nPlease choose one way to check it:\n");
        sb.append("1. Check company name for valid input\n");
        sb.append("2. Inputting Name, age and company name\n");
        sb.append("0. Stop the program\n");
        sb.append("\nInput your choice: ");
        System.out.print(sb);
    }
}
