package com.azdybel.algs.Interfaces;

public interface IInsertionSort<T> {
    int getSortedSize();
    T getElementAtIndex(int index);
    void insertElementAt(int index, int element);
    int searchIndexOfElement(int element);
    int binarySearchIndexOfElement(int element);
    void run();
}
