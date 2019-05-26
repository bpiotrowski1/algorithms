package com.azdybel.algs.Algs;

import com.azdybel.algs.Interfaces.IAlgorithmRunner;
import com.azdybel.algs.Statics.Constants;
import com.azdybel.algs.Structs.ListElement;
import lombok.Getter;
import lombok.Setter;

import java.util.Random;

public class InsertionSort implements com.azdybel.algs.Interfaces.IInsertionSort<Integer>, IAlgorithmRunner {
    @Getter
    private int[] table;

    public InsertionSort() {
        setup();
    }

    public InsertionSort(int[] table) {
        this.table = table;
    }

    @Override
    public void insertElementAt(int index, int element) {
        table[index] = element;
    }

    @Override
    public int searchIndexOfElement(int element) {
        for (int i = 0; i < table.length; i++) {
            if (table[i] == element) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int binarySearchIndexOfElement(int element) {
        int left = 0, right = table.length - 1, p;
        while (left <= right) {
            p = (left + right) / 2;
            if (table[p] < element) {
                left = p + 1;
            } else if (table[p] > element) {
                right = p - 1;
            } else {
                return p;
            }
        }
        return -1;
    }

    @Override
    public void sort() {
        int n = table.length;
        for (int i = 1; i < n; ++i) {
            int key = table[i];
            int j = i - 1;
            while (j >= 0 && table[j] > key) {
                table[j + 1] = table[j];
                j = j - 1;
            }
            table[j + 1] = key;
        }
    }

    @Override
    public void getElements() {
        for (int i = 0; i < table.length; i++) {
            System.out.print(table[i] + " ");
        }
    }

    @Override
    public void setup() {
        table = new int[Constants.ARRAY];
        Random rand = new Random(Constants.RAND);
        for (int i = 0; i < table.length; i++) {
            this.table[i] = rand.nextInt(50);
        }
    }

    @Override
    public void run() {
        sort();
    }
}
