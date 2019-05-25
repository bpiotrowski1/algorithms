package com.azdybel.algs.Algs;

import com.azdybel.algs.Interfaces.IAlgorithmRunner;
import com.azdybel.algs.Interfaces.IQuickSort;
import com.azdybel.algs.Statics.Constants;

import java.util.Random;

public class QuickSort implements IAlgorithmRunner, IQuickSort {
    private int[] table;

    public QuickSort() {
        setup();
    }

    public QuickSort(int[] table) {
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
    public void getElements() {
        for (int i = 0; i < table.length; i++) {
            System.out.print(table[i] + " ");
        }
    }

    @Override
    public void run() {
        sort();
    }

    @Override
    public void sort() {
        quickSort(0, table.length - 1);
    }

    @Override
    public int partition(int left, int right) {
        int pp = table[(left + right) / 2];
        int i = left;
        int j = right;

        while (true) {
            while (table[j] > pp) {
                j--;
            }
            while (table[i] < pp) {
                i++;
            }
            if (i < j) {
                swap(i, j);
                i++;
                j--;
            } else {
                return j;
            }
        }
    }

    @Override
    public void quickSort(int left, int right) {
        int pp;
        if (left < right) {
            pp = partition(left, right);
            quickSort(left, pp);
            quickSort(pp + 1, right);
        }
    }

    @Override
    public void swap(int i, int j) {
        int tmp = table[j];
        table[j] = table[i];
        table[i] = tmp;
    }
}
