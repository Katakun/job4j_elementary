package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort3numbers() {
        int[] data = new int[] {6, 7, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {5, 6, 7};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort5numbers() {
        int[] data = new int[] {8, 4, 3, 1, 7};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 3, 4, 7, 8};
        Assert.assertArrayEquals(expected, result);
    }
}