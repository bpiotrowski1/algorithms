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
    private int sortedSize = 1;
    @Setter
    private boolean binarySearch = false;

    public InsertionSort() {
        setup();
    }

    public InsertionSort(int[] table) {
        this.table = table;
    }

    @Override
    public void insertElementAt(int index, int element) {
        for (int i = table.length; i > index; i--) {
            if (i == table.length) {
                table[i] = table[i - 1];
            } else {
                int tmp = table[i];
                table[i] = table[i - 1];
                table[i - 1] = tmp;
            }
        }
        table[index] = element;
    }

    @Override
    public int searchIndexOfElement(int element) {
        int firstGreater = -1;
        for (int i = 0; i < table.length; i++) {
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
    public int binarySearchIndexOfElement(int element) {
        int left = 1, right = table.length, search, similar = -1;
        while (left < right) {
            search = ((left + right) / 2);
            if (table[search] < element) {
                left = search + 1;
            } else if (table[search] > element) {
                right = search;
                similar = table[search];
            } else {
                return search;
            }
        }
        return similar;
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
        Random rand = new Random(System.nanoTime());
        for (int i = 0; i < table.length; i++) {
            this.table[i] = rand.nextInt(50);
        }
    }

    @Override
    public void run() {
        sort();
    }

    public void sort() {
        for (int i = sortedSize; i < table.length; i++) {
            if (table[i - 1] > table[i]) {
                insertElementAt(binarySearchIndexOfElement(table[i]), table[i]);
            }
            sortedSize++;
        }
    }

    public void addRandomValues(int n) {
        int tmp;
        sortedSize = 1;
        for (int i = 0; i < n; i++) {
            Random rand = new Random();
            tmp = rand.nextInt(Constants.RANDOM_VALUES);
            if (binarySearch) {
                insertElementAt(binarySearchIndexOfElement(tmp), tmp);
            } else {
                insertElementAt(searchIndexOfElement(tmp), tmp);
            }
        }
    }

    public int getElementAtIndex(int index) {
        return table[index];
    }
}
