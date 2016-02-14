package ru.structures.array;

public interface Array<T> {
    T find(T element);
    boolean insert(T element);
    boolean delete(T element);
}
