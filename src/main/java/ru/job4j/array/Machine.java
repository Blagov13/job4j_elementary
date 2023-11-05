package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        for (int coin : coins) {
            while (money - price - (rsl[0] + rsl[1] + rsl[2] + rsl[3] + rsl[4]) >= coin) {
                rsl[size++] = coin;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
