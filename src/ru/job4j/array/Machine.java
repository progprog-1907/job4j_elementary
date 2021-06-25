package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int change = money - price;
        int size = 0;

        for (int coin : coins) {
            while (change >= 0) {
                if (change - coin >= 0) {
                    change -= coin;
                    rsl[size] = coin;
                    size++;
                } else {
                    break;
                }
            }
        }

        return Arrays.copyOf(rsl, size);
    }
}
