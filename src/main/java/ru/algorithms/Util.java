package ru.algorithms;

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

    public static int[] defaultArray() {
        return generateRandomArray(10, 100);
    }

    public static void swap(int[] array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}
