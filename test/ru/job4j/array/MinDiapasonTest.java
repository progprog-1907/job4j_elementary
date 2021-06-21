package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class MinDiapasonTest {
    @Test
    public void whenFirstMin() {
        int[] array = new int[] {3, 6, 15, 12, 31};
        int start = 1;
        int finish = 4;
        int out = MinDiapason.findMin(array, start, finish);
        int expected = 6;
        Assert.assertEquals(out, expected);
    }

    @Test
    public void whenLastMin() {
        int[] array = new int[] {3, 15, 31, 12, 6};
        int start = 1;
        int finish = 3;
        int out = MinDiapason.findMin(array, start, finish);
        int expected = 12;
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenMiddleMin() {
        int[] array = new int[]{1, 8, 7, 13, 15};
        int start = 1;
        int finish = 4;
        int out = MinDiapason.findMin(array, start, finish);
        int expected = 7;
        Assert.assertEquals(expected, out);
    }
}
