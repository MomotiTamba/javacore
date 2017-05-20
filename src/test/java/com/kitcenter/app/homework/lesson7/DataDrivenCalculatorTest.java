package com.kitcenter.app.homework.lesson7;

import com.kitcenter.app.classwork.lesson5.Calculator;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;


@RunWith(JUnitParamsRunner.class)
public class DataDrivenCalculatorTest {

    private double a, b, aTimesB;
    Calculator calculator = new Calculator();

    @Test
    @FileParameters(value = "src/test/resources/testdatasum_int.csv", mapper = CsvWithHeaderMapper.class)
    public void dataProviderTestSumInt(int argA, int argB, int expOut) {
        Assert.assertEquals(expOut, calculator.sum(argA, argB));
    }

    @Test
    @FileParameters(value = "src/test/resources/testdatasum_double.csv", mapper = CsvWithHeaderMapper.class)
    public void dataProviderTestSumDouble(double argA, double argB, int expOut) {
        Assert.assertEquals(expOut, calculator.sum(argA, argB), 0.01);
    }

    @Test
    @FileParameters(value = "src/test/resources/testdatamultiply_int.csv", mapper = CsvWithHeaderMapper.class)
    public void dataProviderTestMultiplyInt(int argA, int argB, int expOut) {
        Assert.assertEquals(expOut, calculator.multiply(argA, argB));
    }

    @Test
    @FileParameters(value = "src/test/resources/testdatamultiply_double.csv", mapper = CsvWithHeaderMapper.class)
    public void dataProviderTestMultiplyDouble(double argA, double argB, double expOut) {
        Assert.assertEquals(expOut, calculator.multiply(argA, argB), 0.01);
    }

    @Test
    @FileParameters(value = "src/test/resources/testdatafactorial_int.csv", mapper = CsvWithHeaderMapper.class)
    public void dataProviderTestFactorialInt(int argA, int expOut){
        Assert.assertEquals(expOut, calculator.factorial(argA));
    }

    @Test
    @FileParameters(value = "src/test/resources/testdatafactorial_double.csv", mapper = CsvWithHeaderMapper.class)
    public void dataProviderTestFactorialDouble(double argA, double expOut){
        Assert.assertEquals(expOut, calculator.factorial(argA), 0.01);
    }

    @Test
    @FileParameters(value = "src/test/resources/testdatapersentage_int.csv", mapper = CsvWithHeaderMapper.class)
    public void dataProviderTestPercentageInt(int argA, int argB, int expOut){
        Assert.assertEquals(expOut, calculator.percentage(argA, argB));
    }

    @Test
    @FileParameters(value = "src/test/resources/testdatapersentage_double.csv", mapper = CsvWithHeaderMapper.class)
    public void dataProviderTestPercentageDouble(double argA, int argB, double expOut){
        Assert.assertEquals(expOut, calculator.percentage(argA, argB), 0.01);
    }

    @Test
    @FileParameters(value = "src/test/resources/testdatalog.csv", mapper = CsvWithHeaderMapper.class)
    public void dataProviderTestLogInt(int argA, double expOut){
        Assert.assertEquals(expOut, calculator.log(argA), 0.01);
    }

    @Test
    @FileParameters(value = "src/test/resources/testdatapow.csv", mapper = CsvWithHeaderMapper.class)
    public void dataProviderTestPowInt(int argA, int argB, double expOut){
        Assert.assertEquals(expOut, calculator.pow(argA, argB), 0.01);
    }
}