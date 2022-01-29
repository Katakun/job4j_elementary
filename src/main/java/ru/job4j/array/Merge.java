package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int count = 0;
        int i = 0, j = 0;
        for (int index = 0; index < rsl.length; index++) {
            if (i > left.length - 1 || right[j] < left[i]) {
                rsl[index] = right[j++];
            } else if (j > right.length - 1 || left[i] <= right[j]) {
                rsl[index] = left[i++];
            }
        }
        return rsl;
    }
}