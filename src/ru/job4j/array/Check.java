package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        int countTrue = 0;
        int countFalse = 0;
        for (boolean datum : data) {
            if (datum) {
                countTrue++;
            } else {
                countFalse++;
            }
        }

        if (countTrue > 0 && countFalse > 0) {
            result = false;
        }
        return result;
    }
}
