package ru.structures.array;

public abstract class AbstractArray<T> implements Array<T> {

    protected T[] array;
    protected int size;

    public AbstractArray(int capacity) {
        array = (T[]) new Object[capacity];
        size = 0;
    }

    public T find(T element) {
        if (element != null) {
            for (int i = 0; i < size; i++) {
                if(element.equals(array[i])) {
                    return array[i];
                }
            }
        }

        return null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Array(size = ")
                .append(size)
                .append(", capacity = ")
                .append(array.length)
                .append(", elements = [");
        for (int i = 0; i < size; i++) {
            sb.append(array[i]);
            if(i < size - 1) {
                sb.append(", ");
            }
        }

        return sb.append("])").toString();
    }
}
