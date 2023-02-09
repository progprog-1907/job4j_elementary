package ru.job4j.converter;


public class Converter {
    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static void main(String[] args) {
        int inToDollar = 180;
        int expectedToDollar = 3;
        int outToDollar = Converter.rubleToDollar(inToDollar);
        boolean passedToDollar = expectedToDollar == outToDollar;
        System.out.println("120 Rubles are 2. Test result: " + passedToDollar);

        int inToEuro = 140;
        int expectedToEuro = 2;
        int outToEuro = Converter.rubleToEuro(inToEuro);
        boolean passedToEuro = expectedToEuro == outToEuro;
        System.out.println("140 Euro's are 2. Test result: " + passedToEuro);
    }
}
