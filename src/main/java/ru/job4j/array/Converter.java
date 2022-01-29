package ru.job4j.array;

public class Converter {
    public static int[][] convertInSquareArray(int[][] array) {
        int size = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                size++;
            }
        }
        int[] arr = new int[size];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                arr[count] = array[i][j];
                count++;
            }
        }
        double koren = Math.sqrt(size);
        int sizeArr = (int) Math.ceil(koren);
        int[][] res = new int[sizeArr][sizeArr];
        count = 0;
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[i].length; j++) {
                if (count < arr.length) {
                    res[i][j] = arr[count];
                    count++;
                }
            }
        }
        return res;
    }
}