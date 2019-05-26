package com.azdybel.algs.Interfaces;

public interface IHeapSort {
    void setup();
    void sort();
    void swap(int i, int j);
    void shiftDown(int n, int i);
    void buildHeap();
    void getElements();
}
