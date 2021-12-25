package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        double expected = 2;
        int p = 6;
        double k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP15K7Square615() {
        double expected = 6.15;
        int p = 15;
        double k = 7;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP32K18Square1276() {
        double expected = 12.76;
        int p = 32;
        double k = 18;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}