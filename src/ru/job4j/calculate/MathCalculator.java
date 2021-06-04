package ru.job4j.calculate;
import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
    }

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double sumDifferenceAndDivide(double first, double second) {
        return difference(first, second) + divide(first, second);
    }

    public static double sumAllOperations(double first, double second) {
        return sum(first, second) + multiply(first, second) + difference(first, second) + divide(first, second);
    }
}
