package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        for (int index = 0; index < array.length / 2; index++) {
            SwitchArray.swap(array, index, array.length - 1 - index);
        }
        return array;
    }
}