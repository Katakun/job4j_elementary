package ru.job4j.array;

import java.util.Arrays;

public class DiffArray {
    public static int[] diff(int[] left, int[] right) {
        if (right.length  == 0) {
            return left;
        }
        int count = 0;
        for (int l : left) {
            for (int r : right) {
                if (l != r) {
                    count++;
                }
            }
        }
        int[] res = new int[count];
        count = 0;
        for (int l : left) {
            for (int r : right) {
                if (l != r) {
                    res[count++] = l;
                }
            }
        }
        System.out.println(Arrays.toString(res));
        return res;
    }
}