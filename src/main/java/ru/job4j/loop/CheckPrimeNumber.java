package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = false;
        for (int i = 2; i <= number; i++) {
            if ((number - 1) % i == 0) {
                prime = true;
                break;
            }
            if (number % i == 0) {
                break;
            }
        }
        return prime;
    }

    public static void main(String[] args) {
        System.out.println(check(2));
    }
}