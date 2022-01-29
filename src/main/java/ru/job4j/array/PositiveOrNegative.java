package ru.job4j.array;

public class PositiveOrNegative {
    public static boolean check(int[] data) {
        int pozitive = 0;
        int negative = 0;
        boolean result = false;
        for (int num : data) {
            if (num > 0) {
                pozitive++;
            } else {
                negative++;
            }
        }
        if (negative % 2 == 1) {
            result = true;
        }
        return result;
    }
}