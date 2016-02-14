package ru.structures.array;

import java.util.Arrays;
import java.util.jar.Pack200;

public class DupsArray<T> extends AbstractArray<T> {

    public DupsArray(int capacity) {
        super(capacity);
    }

    public T[] findAll(T element) {
        if (element != null) {
            T[] elements = (T[]) new Object[2];
            int pointer = 0;
            for (int i = 0; i < size; i++) {
                if(element.equals(array[i])) {
                    if(pointer == elements.length) {
                        T[] newElements = (T[]) new Object[elements.length * 2];
                        System.arraycopy(elements, 0, newElements, 0, elements.length);
                        elements = newElements;
                    }

                    elements[pointer++] = array[i];
                }
            }

            T[] result = (T[]) new Object[pointer];
            System.arraycopy(elements, 0, result, 0, pointer);
            return result;
        }

        return (T[]) new Object[0];
    }

    public boolean insert(T element) {
        if(size != array.length) {
            array[size++] = element;
            return true;
        }

        return false;
    }

    public boolean deleteAll(T element) {
        int i;
        int count = 0;
        for (i = 0; i < size; i++) {
            if(element.equals(array[i])) {
                array[i] = null;
                ++count;
            }
        }

        if(count > 0) {
            for (int j = 0; j < size; j++) {
                if(array[j] == null) {
                    for (int k = j + 1; k < size; k++) {
                        if(array[k] != null) {
                            array[j] = array[k];
                            array[k] = null;
                            break;
                        }
                    }
                }
            }

            size -= count;
            return true;
        }
        
        return false;
    }
}
