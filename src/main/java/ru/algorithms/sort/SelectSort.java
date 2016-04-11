package ru.algorithms.sort;

import ru.util.Util;

import java.util.Arrays;

/**
 *  O(N*N). Less count of swaps in comparison with bubble sort
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] array = Util.defaultArray();
        System.out.println("Before sort: " + Arrays.toString(array));
        sort(array);
        System.out.println("After sort: " + Arrays.toString(array));
    }

    private static void sort(int[] array) {
        int min;
        
        for (int i = 0; i < array.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < array.length; j++) {
                if(array[min] > array[j]) {
                    Util.swap(array, min, j);
                }
            }    
        }
    }
}
