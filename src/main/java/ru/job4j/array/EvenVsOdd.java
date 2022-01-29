package ru.job4j.array;

public class EvenVsOdd {
    public static int whoWin(int[] players) {
        int score1 = 0;
        int score2 = 0;
        int result;
        for (int i = 0; i < players.length; i++) {
            if (i % 2 == 0) {
                score1 += players[i];
            } else {
                score2 += players[i];
            }
        }
        if (score1 > score2) {
            result = 1;
        } else if (score2 > score1) {
            result = 2;
        } else {
            result = 0;
        }
        return result;
    }
}
