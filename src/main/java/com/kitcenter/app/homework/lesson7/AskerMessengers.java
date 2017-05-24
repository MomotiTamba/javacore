package com.kitcenter.app.homework.lesson7;


public class AskerMessengers {
    public void askerWelcome() {
        StringBuilder sb = new StringBuilder();
        sb.append("Hello! I'm Tristy\n");
        sb.append("I know a lots of difficult things, but don't worry, we start with the simplest :)\n");
        System.out.println(sb);
        askerMainMenu();
    }

    public void askerMainMenu() {
        StringBuilder sb = new StringBuilder();
        sb.append("That's what I can propose to you:\n");
        sb.append("1. Convect primitives\n");
        sb.append("2. Guess even or odd\n");
        sb.append("3. Calculator\n");
        sb.append("4. Calculate the circle area\n");
        sb.append("\n0. Stop the program\n");
        sb.append("\nInput your point: ");
        System.out.print(sb);
    }

    public void askerConvectPrimitivesMenu() {
        StringBuilder sb = new StringBuilder();
        sb.append("You choose \"1\" - Convect primitives\n");
        System.out.print(sb);
        askerConvectPrimitivesSubMenu();
    }

    public void askerConvectPrimitivesSubMenu(){
        StringBuilder sb = new StringBuilder();
        sb.append("I can convect:\n");
        sb.append("1. float to char\n");
        sb.append("2. int to char\n");
        sb.append("3. double to char\n");
        sb.append("\n0. Back to main menu\n");
        sb.append("\nInput your point: ");
        System.out.println(sb);
    }

    public void askerEvenOddMenu() {
        StringBuilder sb = new StringBuilder();
        sb.append("You choose \"2\" - Guess even or odd\n");
        System.out.println(sb);
        askerEvenOddSubMenu();
    }

    public void askerEvenOddSubMenu(){
        StringBuilder sb = new StringBuilder();
        sb.append("1. Even or odd\n");
        sb.append("\n0. Back to main menu\n");
        System.out.println(sb);
    }

    public void askerCalculatorMenu() {
        StringBuilder sb = new StringBuilder();
        sb.append("You choose \"3\" - Calculator\n");
        System.out.print(sb);
        askerCalculatorSubMenu();
    }

    public void askerCalculatorSubMenu() {
        StringBuilder sb = new StringBuilder();
        sb.append("Please choose action:\n");
        sb.append("1. Sum (int digits)\n");
        sb.append("2. Sum (double digits)\n");
        sb.append("3. Divide (int digits)\n");
        sb.append("4. Divide (double digits)\n");
        sb.append("\n0. Back to main menu\n");
        sb.append("\nInput your point: ");
        System.out.print(sb);
    }

    public void askerCircleAreaMenu() {
        StringBuilder sb = new StringBuilder();
        sb.append("You choose \"4\" - Calculate the circle area\n");
        System.out.print(sb);
        askerCircleAreaSubMenu();
    }

    public void askerCircleAreaSubMenu() {
        StringBuilder sb = new StringBuilder();
        sb.append("1. Consider area\n");
        sb.append("2. Equal areas\n");
        sb.append("\n0. Bac to main menu\n");
        System.out.print(sb);
    }

    public void askerWrongType(){
        StringBuilder sb = new StringBuilder();
        sb.append("You type a wrong value\n");
        sb.append("Try again\n");
        System.out.print(sb);
    }
    public void askerWrongTypeMainMenu() {
        askerWrongType();
        askerMainMenu();
    }

    public void askerWrongTypeCalculatorMenu() {
        askerWrongType();
        askerCalculatorSubMenu();
    }

    public void askerWrongTypeConvectPrimitivesMenu() {
        askerWrongType();
        askerConvectPrimitivesSubMenu();
    }

    public void askerWrongTypeEvenOddMenu(){
        askerWrongType();
        askerEvenOddMenu();
    }

    public void askerWrongTypeCircleAreaMenu(){
        askerWrongType();
        askerCircleAreaSubMenu();
    }
}
