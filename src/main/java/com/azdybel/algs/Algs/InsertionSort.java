package com.azdybel.algs.Algs;

import com.azdybel.algs.Interfaces.InsertionSortInterface;
import com.azdybel.algs.Statics.Constants;

public class InsertionSort implements InsertionSortInterface {
    int[] tab = new int[Constants.BIG_TABLE];
    int marker = 0;

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
        this.tab[index - 1] = element;
    }
}
