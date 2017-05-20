package com.kitcenter.app.homework;

import com.kitcenter.app.classwork.lesson5.Calculator;
import com.kitcenter.app.classwork.lesson5.CircleArea;
import com.kitcenter.app.classwork.lesson6.EvenOdd;
import com.kitcenter.app.utils.convertors.PrimitiveConvertor;

import java.util.Scanner;

public class MenuLists {

    AskerMessengers askerMessengers = new AskerMessengers();
    Calculator calculator = new Calculator();
    PrimitiveConvertor primitiveConvertor = new PrimitiveConvertor();
    CircleArea circleArea = new CircleArea();
    EvenOdd evenOdd = new EvenOdd();
    Scanner sc = new Scanner(System.in);

    public void logicMainMenu() {

        askerMessengers.askerWelcome();
        while (sc.hasNextInt()) {
            int fSelection = sc.nextInt();
            System.out.println("You type: " + fSelection);
            switch (fSelection) {
                case 1:
                    askerMessengers.askerConvectPrimitivesMenu();
                    logicSubMenuConvectPrimitives();
                    break;
                case 2:
                    askerMessengers.askerEvenOddMenu();
                    logicSubMenuEvenOdd();
                    break;
                case 3:
                    askerMessengers.askerCalculatorMenu();
                    logicSubMenuCalc();
                    break;
                case 4:
                    askerMessengers.askerCircleAreaMenu();
                    logicSubMenuCircleArea();
                    break;
                case 0:
                    System.out.println("Stop the program, keep in touch!");
                    return;
                default:
                    askerMessengers.askerWrongTypeMainMenu();
            }
        }
    }

    public void logicSubMenuConvectPrimitives() {

        while (sc.hasNextInt()) {
            int convectPrimitivesTrigger = sc.nextInt();
            System.out.println("You typed: " + convectPrimitivesTrigger);
            switch (convectPrimitivesTrigger) {
                case 1:
                    System.out.println("float ot char, input one float value and press \"Enter\" button: ");
                    char resFChar = primitiveConvertor.floatToChar(sc.nextFloat());
                    System.out.println("Convert result is: " + resFChar);
                    askerMessengers.askerConvectPrimitivesSubMenu();
                    break;
                case 2:
                    System.out.println("int to char, input one int value and press \"Enter\" button: ");
                    char resIChar = primitiveConvertor.intToChar(sc.nextInt());
                    System.out.println("Convert result is: " + resIChar);
                    askerMessengers.askerConvectPrimitivesSubMenu();
                    break;
                case 3:
                    System.out.println("double to char, input one double value and press \"Enter\" button: ");
                    char resSChar = primitiveConvertor.doubleToChar(sc.nextDouble());
                    System.out.println("Convert result is: " + resSChar);
                    askerMessengers.askerConvectPrimitivesSubMenu();
                    break;
                case 0:
                    System.out.println("Quit to main menu");
                    askerMessengers.askerMainMenu();
                    return;
                default:
                    askerMessengers.askerWrongTypeConvectPrimitivesMenu();
            }
        }
    }

    public void logicSubMenuEvenOdd(){

        while (sc.hasNextInt()){
            int evenOddTrigger = sc.nextInt();
            switch (evenOddTrigger){
                case 1:
                    System.out.println("Guess even or odd, input one int value and press \"Enter\" button: ");
                    evenOdd.checkEvenOdd(sc.nextInt());
                    askerMessengers.askerEvenOddSubMenu();
                    break;
                case 0:
                    System.out.println("Quit to main menu");
                    askerMessengers.askerMainMenu();
                    return;
                default:
                    askerMessengers.askerWrongTypeEvenOddMenu();
            }
        }
    }

    public void logicSubMenuCalc() {

        while (sc.hasNextInt()) {
            int calcMenuTrigger = sc.nextInt();
            System.out.println("You type: " + calcMenuTrigger);
            switch (calcMenuTrigger) {
                case 1:
                    System.out.println("SUM(int, int), input two int values, through \"Enter\" button: ");
                    int resIntSum = calculator.sum(sc.nextInt(), sc.nextInt());
                    System.out.println("SUM result is: " + resIntSum + "\n");
                    askerMessengers.askerCalculatorSubMenu();
                    break;
                case 2:
                    System.out.println("SUM(double, double), input two double values, through \"Enter\" button: ");
                    double resDoubleSum = calculator.sum(sc.nextDouble(), sc.nextDouble());
                    System.out.println("SUM result is: " + resDoubleSum + "\n");
                    askerMessengers.askerCalculatorSubMenu();
                    break;
                case 3:
                    System.out.println("DIVIDE(int, int), input two int values, through \"Enter\" button: ");
                    double resIntDivide = calculator.divide(sc.nextDouble(), sc.nextDouble());
                    System.out.println("DIVIDE result is: " + resIntDivide + "\n");
                    askerMessengers.askerCalculatorSubMenu();
                    break;
                case 4:
                    System.out.println("DIVIDE(double, double), input two double values, through \"Enter\" button: ");
                    double resDoubleDivide = calculator.divide(sc.nextDouble(), sc.nextDouble());
                    System.out.println("DIVIDE result is: " + resDoubleDivide + "\n");
                    askerMessengers.askerCalculatorSubMenu();
                    break;
                case 0:
                    System.out.println("Quit to main menu");
                    askerMessengers.askerMainMenu();
                    return;
                default:
                    askerMessengers.askerWrongTypeCalculatorMenu();
            }
        }
    }

    public void logicSubMenuCircleArea() {

        while (sc.hasNextInt()) {
            int circleAreaTrigger = sc.nextInt();
            System.out.println("You type: " + circleAreaTrigger);
            switch (circleAreaTrigger) {
                case 1:
                    System.out.println("Input one double values: ");
                    double resCircleArea = circleArea.calculateCircleArea(sc.nextDouble());
                    System.out.println("Area result is: " +resCircleArea);
                    askerMessengers.askerCircleAreaSubMenu();
                    break;
                case 2:
                    System.out.println("Input two double radius, through \"Enter\" button: ");
                    circleArea.calculateRadiusAreaBigger(sc.nextDouble(), sc.nextDouble());
                    askerMessengers.askerCircleAreaSubMenu();
                    break;
                case 0:
                    System.out.println("Quit to main menu");
                    askerMessengers.askerMainMenu();
                    return;
                default:
                    askerMessengers.askerWrongTypeCircleAreaMenu();
            }
        }
    }

}
