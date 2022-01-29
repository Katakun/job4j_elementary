package ru.job4j.array;

import java.util.Arrays;

public class Split {
    public static char[][] split(char[] str, char c) {
        int count = 1;
        for (char value : str) {
            if (value == c) {
                count++;
            }
        }
        char[][] result = new char[count][str.length];
        int stringLetters = 0;
        int wordLetters = 0;
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                if (str[stringLetters] != c) {
                    result[i][j] = str[stringLetters];
                    wordLetters++;
                    stringLetters++;
                } else if (str[stringLetters] == c) {
                    result[i] = Arrays.copyOf(result[i], wordLetters);
                    wordLetters = 0;
                    stringLetters++;
                    break;
                }
                if (stringLetters >= str.length) {
                    result[i] = Arrays.copyOf(result[i], wordLetters);
                    break;
                }
            }
            if (stringLetters >= str.length) {
                break;
            }
        }
        return result;
    }
}
