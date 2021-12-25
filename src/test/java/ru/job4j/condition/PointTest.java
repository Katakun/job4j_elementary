package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {
    @Test
    public void when36to24then2dot24() {
        double expected = 2.24;
        int x1 = 3;
        int y1 = 6;
        int x2 = 2;
        int y2 = 4;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when12to34then2dot83() {
        double expected = 2.83;
        int x1 = 1;
        int y1 = 2;
        int x2 = 3;
        int y2 = 4;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when43to21then2dot83() {
        double expected = 2.83;
        int x1 = 4;
        int y1 = 3;
        int x2 = 2;
        int y2 = 1;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when27to72then7dot07() {
        double expected = 7.07;
        int x1 = 2;
        int y1 = 7;
        int x2 = 7;
        int y2 = 2;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}