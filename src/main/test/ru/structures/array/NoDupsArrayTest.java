package ru.structures.array;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NoDupsArrayTest {
    private Array<Integer> array;

    @Before
    public void before() {
        int[] arr = {1, 5, 6, 13, 24, 67, 73, 49, 34, 11};
        array = new NoDupsArray<Integer>(20);
        for (int i : arr) {
            array.insert(i);
        }
    }

    @Test
    public void findTest() {
        Assert.assertEquals(34L, array.find(34).longValue());
        Assert.assertEquals(null, array.find(69));
    }

    @Test
    public void insertTest() {
        array.insert(100);
        Assert.assertEquals(100L, array.find(100).longValue());
    }

    @Test
    public void noDupsTest() {
        Assert.assertFalse(array.insert(73));
    }

    @Test
    public void deleteTest() {
        Assert.assertTrue(array.delete(1));
        Assert.assertFalse(array.delete(1));
    }

    @Test
    public void toStringTest() {
        Assert.assertEquals("Array(size = 10, capacity = 20, elements = [1, 5, 6, 13, 24, 67, 73, 49, 34, 11])",
                array.toString());
    }
}
