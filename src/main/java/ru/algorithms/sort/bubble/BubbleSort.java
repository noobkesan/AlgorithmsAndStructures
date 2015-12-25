package ru.algorithms.sort.bubble;

import ru.util.Util;

import java.util.Arrays;


/**
 * O(N*N)
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] array = Util.defaultArray();
        System.out.println("Before sort: " + Arrays.toString(array));
        sort(array);
        System.out.println("After sort: " + Arrays.toString(array));
    }

    public static void sort(int[] array) {
        for (int end = array.length - 1; end > 1; --end) {
            for (int i = 0; i < end; i++) {
                if(array[i] > array[i + 1]) {
                    Util.swap(array, i, i + 1);
                }
            }
        }
    }
}
