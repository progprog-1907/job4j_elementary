package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

    @Test
    public void maxLeft1Right2() {
        int left = 1;
        int right = 2;
        int expected = 2;
        int out = Max.max(left, right);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void maxLeft4Right0() {
        int left = 4;
        int right = 0;
        int expected = 4;
        int out = Max.max(left, right);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void maxLeft4Right4() {
        int left = 4;
        int right = 4;
        int expected = 4;
        int out = Max.max(left, right);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void maxF2S3T1() {
        int first = 2;
        int second = 3;
        int third = 1;
        int expected =  3;
        int out = Max.add(first, second, third);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void maxF3S2T1() {
        int first = 3;
        int second = 2;
        int third = 1;
        int expected =  3;
        int out = Max.add(first, second, third);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void maxF4S3T5() {
        int first = 4;
        int second = 3;
        int third = 5;
        int expected =  5;
        int out = Max.add(first, second, third);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void maxF20S30T10F4() {
        int first = 20;
        int second = 30;
        int third = 10;
        int fourth = 4;
        int expected =  30;
        int out = Max.add(first, second, third, fourth);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void maxF10S3T1() {
        int first = 10;
        int second = 40;
        int third = 50;
        int fourth = 20;
        int expected =  50;
        int out = Max.add(first, second, third, fourth);
        Assert.assertEquals(expected, out);
    }
}
