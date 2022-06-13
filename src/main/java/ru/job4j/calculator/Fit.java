package ru.job4j.calculator;

public class Fit {

    public static double manWeight(short height) {
        double rsl = (height - 100) * 1.15;
        return rsl;
    }

    public static double womanWeight(short heightWoman) {
        double rsl = (heightWoman - 110) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        double man = Fit.manWeight((short) 180);
        double woman = Fit.womanWeight((short) 170);
        System.out.println("Man 180 is " + man);
        System.out.println("Woman 170 is " + woman);
    }

}