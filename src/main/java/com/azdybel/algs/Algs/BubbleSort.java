package com.azdybel.algs.Algs;

import com.azdybel.algs.Interfaces.IAlgorithmRunner;
import com.azdybel.algs.Interfaces.IBubbleSort;
import com.azdybel.algs.Statics.Constants;
import lombok.Getter;

import java.util.Random;

public class BubbleSort implements IAlgorithmRunner, IBubbleSort {
    @Getter private int[] table;

    public BubbleSort(int[] table) {
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
    public boolean compare(int a, int b) {
        return a > b;
    }

    @Override
    public void run() {
        sort();
    }

    @Override
    public void sort() {
        for (int i = 0; i < table.length - 1; i++) {
            for (int j = 0; j < table.length - 1 - i; j++) {
                if (compare(table[j], table[j + 1])) {
                    swap(j, j + 1);
                }
            }
        }
    }

    public void swap(int i, int j) {
        int tmp = table[i + 1];
        table[i + 1] = table[i];
        table[i] = tmp;
    }
}
