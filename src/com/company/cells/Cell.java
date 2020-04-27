package com.company.cells;

public class Cell<T> {
    private T[] array;
    private int next = 0;

    public Cell(int size) {
        array = (T[]) new Object[size];
    }

    public void addAnimal(T t) {
        if (next < array.length)
            array[next++] = t;
        else
            System.out.println("Вольер переполнен");
    }

}