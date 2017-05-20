package com.kitcenter.app.classwork.lesson5;


public class Calculator {

    /*
    This method summarizes the int values
     */
    public int sum(int numberOne, int numberTwo) {
        return numberOne + numberTwo;
    }

    /*
    This method summarizes the double values
     */
    public double sum(double numberOne, double numberTwo) {
        return numberOne + numberTwo;
    }

    /*
    This method substract the int values
     */
    public int substract(int numberOne, int numberTwo) {
        return numberOne - numberTwo;
    }

    /*
    This method substract the double values
     */
    public double substract(double numberOne, double numberTwo) {
        return numberOne - numberTwo;
    }

    /*
    This method multiply the int values
     */
    public int multiply(int numberOne, int numberTwo) {
        return numberOne * numberTwo;
    }

    /*
    This method multiply the double values
     */
    public double multiply(double numberOne, double numberTwo) {
        return numberOne * numberTwo;
    }

    /*
    This method divide the int values
     */
    public int divide(int numberOne, int numberTwo) {
        return numberOne / numberTwo;
    }

    /*
    This method divide the double values
     */
    public double divide(double numberOne, double numberTwo) {
        return numberOne / numberTwo;
    }

    /*
    This method take sqrt of the int values
     */
    public int sqrt(int number) {
        return (int) Math.sqrt(number);
    }

    /*
    This method take sqrt of the double values
     */
    public double sqrt(double number) {
        return Math.sqrt(number);
    }

    /*
    This method raises to the power int values
     */
    public int pow(int number, int power) {
        return (int) Math.pow(number, power);
    }

    /*
    This method raises to the power double values
     */
    public double pow(double number, double power) {
        return Math.pow(number, power);
    }

    /*
    This method considers factorial, int values
     */
    public int factorial(int number) {
        if (number <= 1) {
            return 1;
        } else {
            return number * factorial(number - 1);
        }
    }

    /*
    This method considers factorial, double value
     */
    public double factorial(double number) {
        if (number <= 1) {
            return 1;
        } else {
            return number * factorial(number - 1);
        }
    }

    /*
    This method considers percentage, int value
     */
    public int percentage(int numberOne, int percentage){
        return (numberOne * percentage) / 100;
    }

    /*
    This method considers percentage, double value
     */
    public double percentage(double numberOne, int percentage){
        return (numberOne * percentage) / 100;
    }

    /*
    This method considers percentage, double value
     */
    public double log(int numberOne){
        return Math.log(numberOne);
    }

}
