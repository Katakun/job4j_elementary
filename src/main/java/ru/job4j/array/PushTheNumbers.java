package ru.job4j.array;

import java.util.Arrays;

public class PushTheNumbers {

    public static void push(int[][] array, int row, int column) {
        int[][] copy = new int[array.length][array[0].length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                copy[i][j] = array[i][j];
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j == column && i < row) {
                    array[i][j] = copy[i + 1][j];
                }
                if (j == column && i > row) {
                    array[i][j] = copy[i - 1][j];
                }
                if (j < column && i == row) {
                    array[i][j] = copy[i][j + 1];
                }
                if (j > column && i == row) {
                    array[i][j] = copy[i][j - 1];
                }
                if (j == column && i == row) {
                    array[i][j] = 0;
                }
            }
        }
    }
}