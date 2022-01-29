package ru.job4j.array;

public class UnionThreeArrays {
    public static int[] union(int[] left, int[] middle, int[] right) {
        int[] res = new int[2 + (middle.length / 2) + (right.length / 2)];
        for (int i = 0; i < res.length; i++) {
            if (i == 0) {
                res[i] = left[0];
            }
            if (i == res.length - 1) {
                res[i] = left[left.length - 1];
            }
            if (i % 2 == 0 && i < middle.length && i > 0) {
                res[i] = middle[i - 1];
            }
            if (i % 2 == 1 && i < right.length && i > 0) {
                res[i] = right[i - 1];
            }
        }
        return res;
    }
}