package ru.job4j.calculate;

public class Fit {
    public static double manWeight(short height) {
        return (double) height * 1.15 / 100;
    }

    public static double womanWeight(short height) {
        return (double) height * 1.15 / 115;
    }

    public static void main(String[] args) {
        short height = 187;
        double man = Fit.manWeight(height);
        double wooman = Fit.womanWeight(height);
        System.out.println("Man 187 is " + man);
        System.out.println("Woman 187 is " + wooman);
    }
}
