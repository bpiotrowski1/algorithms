package com.azdybel.algs.Algs;

import com.azdybel.algs.Statics.Constants;

import java.util.Random;

public class IInsertionSort implements com.azdybel.algs.Interfaces.IInsertionSort {
    private int[] tab = new int[Constants.BIG_TABLE];
    private int marker = 1;

    public IInsertionSort() {
        for(int i=0; i<Constants.BIG_TABLE; i++) {
            Random rand = new Random();
            tab[i] = rand.nextInt(10);
        }
    }

    @Override
    public int getSize() {
        return this.marker;
    }

    @Override
    public int getElementOfIndex(int index) {
        return tab[index];
    }

    @Override
    public void insertElement(int index, int element) {
        int temp = this.tab[index];
        this.tab[index - 1] = element;
        this.tab[index] = temp;
    }

    @Override
    public int searchIndexOfElement(int element) {
        int firstGreater = -1;
        boolean findFirstGreater = false;
        for (int i = 0; i < Constants.BIG_TABLE; i++) {
            if (!findFirstGreater && tab[i] > element) {
                firstGreater = tab[i];
                findFirstGreater = true;
            } else if (tab[i] == element) {
                return i;
            }
        }
        return firstGreater;
    }

    @Override
    public void run() {
        for (int i = marker; i < Constants.BIG_TABLE; i++) {
            if (tab[i] > tab[i + 1]) {
                insertElement(searchIndexOfElement(tab[i]), tab[i + 1]);
            }
            marker++;
        }
    }
}
