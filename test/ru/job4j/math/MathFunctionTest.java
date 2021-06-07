package ru.job4j.math;

import org.junit.Assert;
import org.junit.Test;

public class MathFunctionTest {
    @Test
    public void sum() {
        double in1 = 10;
        double in2 = 2;
        int expected = 12;
        int out = (int) MathFunction.sum(in1, in2);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void multiply() {
        double in1 = 10;
        double in2 = 2;
        int expected = 20;
        int out = (int) MathFunction.multiply(in1, in2);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void difference() {
        double in1 = 10;
        double in2 = 2;
        int expected = 8;
        int out = (int) MathFunction.difference(in1, in2);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void divide() {
        double in1 = 10;
        double in2 = 3;
        int expected = 3;
        int out = (int) MathFunction.divide(in1, in2);
        Assert.assertEquals(expected, out);
    }
}
