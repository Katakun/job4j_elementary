package ru.job4j.array;

import java.util.Arrays;

public class SymmetricDiff {

    public static int[] diff(int[] left, int[] right) {
        int size = left.length + right.length;
        int[] merged = new int[size];
        int count = 0;
        for (int i : left) {
            merged[count] = i;
            count++;
        }
        for (int i : right) {
            merged[count] = i;
            count++;
        }
        count = 0;
        for (int i : left) {
            for (int j : right) {
                if (i == j) {
                    count++;
                }
            }
        }
        int[] res = new int[left.length + right.length - count * 2];
        count = 0;
        for (int num : merged) {
            if (contains(left, num) && !contains(right, num) || !contains(left, num) && contains(right, num)) {
                res[count++] = num;
            }
        }
        return res;
    }

    public static boolean contains(int[] array, int num) {
     for (int i : array) {
         if (i == num) {
             return true;
         }
     }
     return false;
    }
}