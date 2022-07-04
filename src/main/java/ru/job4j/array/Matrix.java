package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] array = new int[size][size];
        for (int row = 0; row < array.length; row++) {
            for (int cell = 0; cell < array[row].length; cell++) {
                array[row][cell] = (row + 1) * (cell + 1);
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[][] array = multiple(5);
        for (int row = 0; row < array.length; row++) {
            for (int cell = 0; cell < array[row].length; cell++) {
                System.out.print(array[row][cell] + " ");
            }
            System.out.println();
        }
    }
}
