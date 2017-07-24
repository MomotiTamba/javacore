package com.kitcenter.app.classwork.lesson5;


import org.junit.*;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CalculatorTest {

    int numberOne, numberTwo, power, percentage;
    double numberThree;
    Calculator calculator = new Calculator();

    /*
        Initialize test for Calculator functionality
     */
    @BeforeClass
    public static void setBeforeClassSetUp() {

    }

    @Before
    public void setUp() {
        numberOne = 11;
        numberTwo = 11;
        numberThree = 3.8;
        power = 2;
        percentage = 22;
    }
    @Ignore
    @Test
    public void sumTest1() {
        int expectedResult = 22;
        int actualResult = calculator.sum(numberOne, numberTwo);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void sumTest2() {
        double numberOne = 3.5;
        double numberTwo = 2.7;
        double expectedResult = 6.2;
        double actualResult = calculator.sum(numberOne, numberTwo);
        Assert.assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void substractTest1() {
        int expectedResult = 0;
        int actualResult = calculator.substract(numberOne, numberTwo);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void substractTest2() {
        double numberOne = -30.8;
        double numberTwo = 6.3;
        double expectedResult = -37.1;
        double actualResult = calculator.substract(numberOne, numberTwo);
        Assert.assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void multiplyTest1() {
        int expectedResult = 121;
        int actualResult = calculator.multiply(numberOne, numberTwo);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void multiplyTest2() {
        double numberOne = 16.8;
        double numberTwo = 20.1;
        double expectedResult = 337.68;
        double actualResult = calculator.multiply(numberOne, numberTwo);
        Assert.assertEquals(expectedResult, actualResult, 0.001);
    }

    @Test
    public void divideTest1() {
        int expectedResult = 1;
        int actualResult = calculator.divide(numberOne, numberTwo);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void divideTest2() {
        double numberOne = 55.9;
        double numberTwo = 23.1;
        double expectedResult = 2.42;
        double actualResult = calculator.divide(numberOne, numberTwo);
        Assert.assertEquals(expectedResult, actualResult, 0.001);
    }

    @Test
    public void divideTest3() {
        double numberOne = 55.9;
        double numberTwo = 23.1;
        double expectedResult = 2.42;
        double actualResult = calculator.divide(numberOne, numberTwo);
        Assert.assertTrue(expectedResult < 3 && actualResult > 2);
    }

    @Test
    public void sqrtTest1() {
        int expectedResult = 3;
        int actualResult = calculator.sqrt(numberOne);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void sqrtTest2() {
        double numberOne = 20.1;
        double expectedResult = 4.48;
        double actualResult = calculator.sqrt(numberOne);
        Assert.assertEquals(expectedResult, actualResult, 0.01);
    }

    @Test
    public void sqrtTest3() {
        double numberOne = 99.3;
        double expectedResult = 9.96;
        double actualResult = calculator.sqrt(numberOne);
        Assert.assertTrue(expectedResult < 10 && actualResult > 9 || expectedResult > 9.5 && actualResult < 10);
    }

    @Test
    public void powTest1() {
        int expectedResult = 121;
        int actualResult = calculator.pow(numberOne, power);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void powTest2() {
        double expectedResult = 14.44;
        double actualResult = calculator.pow(numberThree, power);
        Assert.assertEquals(expectedResult, actualResult, 0.01);
    }

    @Test
    public void powTest3() {
        power = -4;
        double expectedResult = 0.005;
        double actualResult = calculator.pow(numberThree, power);
        Assert.assertEquals(expectedResult, actualResult, 0.001);
    }

    @Test
    public void factorialTes1() {
        int expectedResult = 39916800;
        int actualResult = calculator.factorial(numberOne);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void factorialTest2() {
        double expectedResult = 19.15;
        double actualResult = calculator.factorial(numberThree);
        Assert.assertEquals(expectedResult, actualResult, 0.01);
    }

    @Test
    public void percentageTest1() {
        int expectedResult = 2;
        int actualResult = calculator.percentage(numberOne, percentage);
        Assert.assertEquals(expectedResult, actualResult, 0.01);
    }

    @Test
    public void percentageTest2() {
        double expectedResult = 0.8;
        double actualResult = calculator.percentage(numberThree, percentage);
        Assert.assertEquals(expectedResult, actualResult, 0.05);
    }

    @Test
    public void logTest() {
        double expectedResult = 2.4;
        double actualResult = calculator.log(numberOne);
        Assert.assertEquals(expectedResult, actualResult, 0.05);
    }

    @After
    public void tearDown() {
        System.out.println("LoginDataTest successfully pass");
    }

    @AfterClass
    public static void tearDownForClass() {
        System.out.println("Post condition for class test");
    }

}
