package ru.job4j.array;

import java.util.Arrays;

public class Anomaly {
    public static int[][] found(int[] data, int up, int down) {
        int[][] result = new int[data.length][2];
        int count = 0;
        int index = 0;
        for (int i = 0; i < data.length; i++) {
            if ((data[i] >= up || data[i] <= down) && (i == 0)) {
                result[count][index++] = i;
            } else if ((data[i] >= up || data[i] <= down) && (i > 0) && (data[i - 1] < up && data[i - 1] > down)) {
                result[count][index++] = i;
            }
            if ((data[i] >= up || data[i] <= down) && (i == data.length - 1)) {
                result[count][index] = i;
                count++;
            } else if ((data[i] >= up || data[i] <= down) && (i < data.length - 1) && (data[i + 1] < up && data[i + 1] > down)) {
                result[count][index] = i;
                index = 0;
                count++;
            }
        }
        return Arrays.copyOf(result, count);
    }
}
