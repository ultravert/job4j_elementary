package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int diff = money - price;
        for (int i = 0; i < coins.length; i++) {
                while (diff >= coins[i]) {
                    diff -= coins[i];
                    rsl[size++] = coins[i];
                }
        }
        return Arrays.copyOf(rsl, size);
    }

    public static void main(String[] args) {
        int[] rsl = change(50, 32);
        for (int i = 0; i < rsl.length; i++) {
            System.out.print(rsl[i] + " ");
        }
    }
}
