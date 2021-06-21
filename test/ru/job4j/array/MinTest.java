package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class MinTest {
    @Test
    public void whenFirstMin() {
        int[] in = new int[] {0, 4, 9};
        int out = Min.findMin(in);
        int expected = 0;
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenLastMin() {
        int[] in = new int[] {5, 4, 2};
        int out = Min.findMin(in);
        int expected = 2;
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenMiddleMin() {
        int[] in = new int[] {5, 3, 9};
        int out = Min.findMin(in);
        int expected = 3;
        Assert.assertEquals(out, expected);
    }
}
