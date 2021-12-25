package ru.job4j.condition;

public class SqArea {
    public static double square(double p, double k) {
        double height = p / (2 * (k + 1));
        double length = height * k;
        double rsl = height * length;
        return rsl;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(32, 18);
        System.out.println(" p = 32, k = 18, s = 12.76, real = " + result1);
    }
}