package com.kitcenter.app.classwork.lesson5;


import org.junit.*;

public class CalculatorTest {

    int numberOne, numberTwo;
    Calculator calculator = new Calculator();

    /*
        Initialize test for Calculator functionality
     */
    @BeforeClass
    public static void setBeforeClassSetUp(){

    }

    @Before
    public void setUp(){
        numberOne = 20;
        numberTwo = 11;
    }

    @Test
    public void sumTest() {
        int expectedResult = 31;
        int actualResult = calculator.sum(numberOne, numberTwo);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void substractTest() {
        int expectedResult = 9;
        int actualResult = calculator.substract(numberOne, numberTwo);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void multipleTest() {
        int expectedResult = 220;
        int actualResult = calculator.multiple(numberOne, numberTwo);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void divideTest() {
        int expectedResult = 1;
        int actualResult = calculator.divide(numberOne, numberTwo);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @After
    public void tearDown(){
        System.out.println("Post condition for every test");
    }

    @AfterClass
    public static void tearDownForClass(){
        System.out.println("Post condition for class test");
    }

}
