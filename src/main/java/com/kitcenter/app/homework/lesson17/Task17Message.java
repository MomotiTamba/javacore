package com.kitcenter.app.homework.lesson17;


public class Task17Message {

    public void welcomeMessageTask17() {
        StringBuilder sb = new StringBuilder();
        sb.append("Hello! I'm Guessman\n");
        sb.append("And we are now play the guessing game\n");
        sb.append("I'll ask you a famous name and you must tell the age");
        System.out.println(sb);
    }

    public void mainMenuMessageTask17() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nChoose one:\n");
        sb.append("1. Try guessing the famous people age\n");
        sb.append("2. Try guessing the famous people is a live or not\n");
        sb.append("0. Stop the program\n");
        sb.append("\nInput your choice: ");
        System.out.print(sb);
    }
}
