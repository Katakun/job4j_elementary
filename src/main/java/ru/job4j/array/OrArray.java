package ru.job4j.array;

import java.util.Arrays;

public class OrArray {
    public static int[] or(int[] left, int[] right) {
        int[] merge = new int[left.length + right.length];
        int count = 0;
        for (int l : left) {
            merge[count++] = l;
        }
        for (int r : right) {
            merge[count++] = r;
        }
        Arrays.sort(merge);
        count = 0;
        for (int i = 0; i < merge.length - 1; i++) {
            if (merge[i] == merge[i + 1]) {
                count++;
            }
        }
        int[] res = new int[merge.length - count];
        count = 0;
        for (int i = 0; i < merge.length - 1; i++) {
            if (merge[i] != merge[i + 1]) {
                res[count++] = merge[i];
            }
        }
        if (merge.length > 0) {
            res[count] = merge[merge.length - 1];
        }
        return res;
    }
}
