package ru.util;

import java.util.Random;

public class Util {
    private static final Random RANDOM = new Random();

    public static int[] generateRandomArray(int size, int max) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = RANDOM.nextInt(max);
        }

        return array;
    }

    /**
     * @return default array with size 10 and values up to 100
     */
    public static int[] defaultArray() {
        return generateRandomArray(10, 100);
    }

    /**
     * Swaps array's values with define indexes
     * @param array array
     * @param first first index
     * @param second second index
     */
    public static void swap(int[] array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}
