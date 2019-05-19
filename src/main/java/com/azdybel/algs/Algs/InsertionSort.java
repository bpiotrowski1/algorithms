package com.azdybel.algs.Algs;

import com.azdybel.algs.Interfaces.IAlgorithmRunner;
import com.azdybel.algs.Statics.Constants;

import java.util.Random;

public class InsertionSort implements com.azdybel.algs.Interfaces.IInsertionSort<Integer>, IAlgorithmRunner {
    private int[] table = new int[Constants.TABLE];
    private int sortedSize = 1;

    @Override
    public int getSortedSize() {
        return this.sortedSize;
    }

    @Override
    public Integer getElementAtIndex(int index) {
        return this.table[index];
    }

    @Override
    public void insertElementAt(int index, int element) {
        int tmp;
        for (int i = sortedSize; i >= 1; i--) {
            if (table[i - 1] > table[i]) {
                tmp = table[i - 1];
                table[i - 1] = table[i];
                table[i] = tmp;
            }
        }
    }

    @Override
    public int searchIndexOfElement(int element) {
        int firstGreater = -1;
        for (int i = 0; i < Constants.TABLE; i++) {
            if (this.table[i] > element) {
                firstGreater = i;
                break;
            } else if (this.table[i] == element) {
                return i;
            }
        }
        return firstGreater;
    }

    @Override
    public void setup() {
        Random rand = new Random(System.nanoTime());
        for (int i = 0; i < Constants.START; i++) {
            this.table[i] = rand.nextInt(50);
        }
    }

    @Override
    public void run() {
        sort();
    }

    private void sort() {
        for (int i = sortedSize; i < Constants.TABLE; i++) {
            if (table[i - 1] > table[i]) {
                insertElementAt(searchIndexOfElement(table[i]), table[i]);
            }
            sortedSize++;
        }
    }

    public void addRandomValues(int n) {
        int tmp;
        sortedSize = 1;
        for(int i=0; i<n; i++) {
            Random rand = new Random();
            tmp = rand.nextInt(Constants.RANDOM_VALUES);
            insertElementAt(searchIndexOfElement(tmp), tmp);
        }
    }
}
