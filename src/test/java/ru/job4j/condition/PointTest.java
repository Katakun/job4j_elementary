package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {
    @Test
    public void when36to24then2dot24() {
        double expected = 2.24;
        Point a = new Point(3, 6);
        Point b = new Point(2, 4);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when12to34then2dot83() {
        double expected = 2.83;
        Point a = new Point(1, 2);
        Point b = new Point(3, 4);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when43to21then2dot83() {
        double expected = 2.83;
        Point a =  new Point(4, 3);
        Point b =  new Point(2, 1);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when27to72then7dot07() {
        double expected = 7.07;
        Point a = new Point(2, 7);
        Point b = new Point(7, 2);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}