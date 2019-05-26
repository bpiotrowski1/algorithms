package com.azdybel.algs.Trees;

import com.azdybel.algs.Interfaces.IAlgorithmRunner;
import com.azdybel.algs.Interfaces.IHeapSort;
import com.azdybel.algs.Statics.Constants;

import java.util.Random;

public class HeapSort implements IAlgorithmRunner, IHeapSort {
    private int[] table;

    public HeapSort() {
        setup();
    }

    public HeapSort(int[] table) {
        this.table = table;
    }

    @Override
    public void setup() {
        table = new int[Constants.ARRAY];
        Random rand = new Random(System.nanoTime());
        for (int i = 0; i < table.length; i++) {
            this.table[i] = rand.nextInt(Constants.RAND);
        }
    }

    @Override
    public void buildHeap() {
        for (int i = table.length / 2 - 1; i >= 0; i--) {
            shiftDown(table.length, i);
        }
    }

    @Override
    public void sort() {
        buildHeap();

        for (int i = table.length - 1; i >= 0; i--) {
            swap(0, i);
            shiftDown(i, 0);
        }
    }

    @Override
    public void shiftDown(int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < n && table[l] > table[largest]) {
            largest = l;
        }
        if (r < n && table[r] > table[largest]) {
            largest = r;
        }
        if (largest != i) {
            swap(i, largest);
            shiftDown(n, largest);
        }
    }

    @Override
    public void swap(int i, int j) {
        int tmp = table[j];
        table[j] = table[i];
        table[i] = tmp;
    }

    @Override
    public void getElements() {
        for (int i = 0; i < table.length; i++) {
            System.out.print(table[i] + " ");
        }
    }

    @Override
    public void run() {
        sort();
    }
}
