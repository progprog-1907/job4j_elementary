package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 0;
        boolean credit = true;

        while (credit) {
            amount += amount * percent / 100;
            amount -= salary;
            year++;
            if (amount <= 0) {
                credit = false;
            }
        }

        return year;
    }
}
