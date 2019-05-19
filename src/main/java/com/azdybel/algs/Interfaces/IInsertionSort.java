package com.azdybel.algs.Interfaces;

public interface IInsertionSort {
    int getSize();
    int getElementOfIndex(int index);
    void insertElement(int index, int element);
    int searchIndexOfElement(int element);
    void run();
}
