package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        boolean example = data[0];
        for (boolean b : data) {
            if (b != example) {
                result = false;
            }
        }
        return result;
    }
}