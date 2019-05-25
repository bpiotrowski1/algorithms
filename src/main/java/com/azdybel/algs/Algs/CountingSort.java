package com.azdybel.algs.Algs;

import com.azdybel.algs.Interfaces.IAlgorithmRunner;
import com.azdybel.algs.Interfaces.ICountingSort;
import com.azdybel.algs.Statics.Constants;

import java.util.Random;

public class CountingSort implements IAlgorithmRunner, ICountingSort {
    private int[] table, out;

    public CountingSort() {
        setup();
    }

    public CountingSort(int[] table) {
        this.table = table;
        out = new int[table.length];
    }

    @Override
    public void setup() {
        table = new int[Constants.ARRAY];
        out = new int[table.length];
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
    public void getElementsOut() {
        for (int i = 0; i < out.length; i++) {
            for (int j = 0; j < out[i]; j++) {
                System.out.print(i + " ");
            }
        }
    }

    @Override
    public void run() {
        sort();
    }

    @Override
    public void sort() {
        for (int i = 0; i < table.length; i++) {
            out[table[i]] += 1;
        }
    }

    @Override
    public int getMax() {
        int max = 0;
        for (int i = 0; i < table.length; i++) {
            if (i < table[i]) {
                max = table[i];
            }
        }
        return max;
    }
}
