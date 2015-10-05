package ru.algorithms.sort.insert;

import ru.algorithms.Util;

import java.util.Arrays;

/**
 * O(N * N) faster than bubble and select
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] array = Util.defaultArray();
        System.out.println("Before sort: " + Arrays.toString(array));
        sort(array);
        System.out.println("After sort: " + Arrays.toString(array));
    }

    private static void sort(int[] array) {
        int j;
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            j = i;
            while (j > 0 && array[j - 1] >= temp) {
                array[j] = array[j - 1];
                --j;
            }

            array[j] = temp;
        }
    }
}
