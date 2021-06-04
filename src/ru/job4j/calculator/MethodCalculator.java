package ru.job4j.calculator;

public class MethodCalculator {
    public static void main(String[] args) {
        MethodCalculator.plus(100, 500);
        MethodCalculator.plus(4, 2);
        MethodCalculator.plus(3, 5);
    }

    public static void plus(int x, int y) {
        System.out.println(x + y);
    }
}
