package ru.structures.array;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DupsArrayTest {
    private DupsArray<Integer> array;

    @Before
    public void before() {
        int[] arr = {1, 5, 6, 13, 24, 67, 73, 49, 34, 1};
        array = new DupsArray<>(20);
        for (int i : arr) {
            array.insert(i);
        }
    }

    @Test
    public void findAllTest() {
        Assert.assertArrayEquals(new Integer[]{1, 1}, array.findAll(1));
    }

    @Test
    public void deleteAllTest() {
        array.deleteAll(1);
        Assert.assertEquals("Array(size = 8, capacity = 20, elements = [5, 6, 13, 24, 67, 73, 49, 34])",
                array.toString());
    }
}
