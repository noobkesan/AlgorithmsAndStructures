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
}
