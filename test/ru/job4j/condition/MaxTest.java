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
}
