package com.kitcenter.app.homework.lesson11;


public class Task11Message {
    public void welcomeMessageTask11() {
        StringBuilder sb = new StringBuilder();
        sb.append("Hello! I'm Stacy\n");
        sb.append("I know some magic things about strings\n");
        sb.append("So, let's fun!");
        System.out.println(sb);
        mainMenuMessageTask11();
    }

    public void mainMenuMessageTask11() {
        StringBuilder sb = new StringBuilder();
        sb.append("Please choose one way to check it:\n");
        sb.append("1. Converts a string to an array and then sort\n");
        sb.append("2. Input own separator and enter line via this separator\n");
        sb.append("3. Input string line and a keyword\n");
        sb.append("4. Encryption algorithm Enigma\n");
        sb.append("\n0. Stop the program\n");
        sb.append("\nInput your choice: ");
        System.out.print(sb);
    }
}
