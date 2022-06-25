package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int result = 1;
        for (n = n; n > 0; n--) {
            result = result * n;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(calc(1));
    }
}