package com.azdybel.algs.Interfaces;

public interface IInsertionSort<T> {
    void insertElementAt(int index, int element);
    int searchIndexOfElement(int element);
    int binarySearchIndexOfElement(int element);
    void sort();
}
