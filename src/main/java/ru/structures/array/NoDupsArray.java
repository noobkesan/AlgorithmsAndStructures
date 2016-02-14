package ru.structures.array;

public class NoDupsArray<T> extends AbstractArray<T> {

    public NoDupsArray(int capacity) {
        super(capacity);
    }

    public boolean insert(T element) {
        if(size != array.length && find(element) == null) {
            array[size++] = element;
            return true;
        }

        return false;
    }

    public boolean delete(T element) {
        int i;
        for (i = 0; i < size; i++) {
            if(element.equals(array[i])) {
                break;
            }
        }

        if(i < size) {
            System.arraycopy(array, i + 1, array, i, size - i);
            --size;
            return true;
        }

        return false;
    }
}
