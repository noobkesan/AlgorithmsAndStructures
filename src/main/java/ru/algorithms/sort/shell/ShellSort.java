package ru.algorithms.sort.shell;

import ru.util.Util;

import java.util.Arrays;

/**
 * O(N ^ (3/2))
 */
public class ShellSort {
    public static void main(String[] args) {
        int[] array = Util.defaultArray();
        System.out.println("Before sort: " + Arrays.toString(array));
        sort(array);
        System.out.println("After sort: " + Arrays.toString(array));
    }

    private static void sort(int[] array) {
        int h = 1;
        while (h <= array.length / 3) {
            h = 3 * h + 1;
        }

        while (h > 0) {

            for (int i = h; i < array.length; i++) {
                int temp = array[i];
                int j = i;
                while (j > h - 1 && array[j - h] >= temp) {
                    array[j] = array[j - h];
                    j -= h;
                }

                array[j] = temp;
            }

            h = (h - 1) / 3;
        }
    }
}
