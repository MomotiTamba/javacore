package com.kitcenter.app.classwork.lesson5;


import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    int numberOne = 20;
    int numberTwo = 11;

    @Test
    public void sumTest() {
        int expectedResult = 31;

        Calculator calculator = new Calculator();
        int actualResult = calculator.sum(numberOne, numberTwo);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void substractTest() {
        int expectedResult = 9;

        Calculator calculator = new Calculator();
        int actualResult = calculator.substract(numberOne, numberTwo);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void multipleTest() {
        int expectedResult = 220;

        Calculator calculator = new Calculator();
        int actualResult = calculator.multiple(numberOne, numberTwo);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void divideTest() {
        int expectedResult = 1;

        Calculator calculator = new Calculator();
        int actualResult = calculator.divide(numberOne, numberTwo);
        Assert.assertEquals(expectedResult, actualResult);
    }

}
