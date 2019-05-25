package com.azdybel.algs.Interfaces;

public interface IQuickSort {
    void sort();
    int partition(int left, int right);
    void quickSort(int left, int right);
    void swap(int i, int j);
}
