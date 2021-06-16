package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        System.out.println(ages.length);

        String[] surnames = new String[100500];
        System.out.println(surnames.length);

        float[] prices = new float[40];
        System.out.println(prices.length);

        String[] names = new String[4];
        names[0] = "Iman Alakbarli";
        System.out.println(names[0]);
        names[1] = "Petr Arsentev";
        System.out.println(names[1]);
        names[2] = "Cristiano Ronaldo";
        System.out.println(names[2]);
        names[3] = "Dmitri Petrov";
        System.out.println(names[3]);
    }
}
