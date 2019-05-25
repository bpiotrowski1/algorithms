package com.azdybel.algs.Algs;

import com.azdybel.algs.Interfaces.IAlgorithmRunner;
import com.azdybel.algs.Statics.Constants;
import com.azdybel.algs.Structs.ListElement;
import com.azdybel.algs.Structs.MyList;

import java.util.Random;

public class ListInsertionSort implements com.azdybel.algs.Interfaces.IInsertionSort<ListElement>, IAlgorithmRunner {
    private MyList list = new MyList();

    @Override
    public void setup() {
        Random rand = new Random(System.nanoTime());
        ListElement twenty = new ListElement(20);
        for (int i = 0; i < Constants.ARRAY; i++) {
            if (i == 20) {
                list.addOrdered(twenty);
            } else {
                list.addOrdered(new ListElement(rand.nextInt(50)));
            }
        }
        //list.remove(twenty);
        ListElement iterator = list.getHead();
        do {
            System.out.print(iterator.getValue() + " ");
            iterator = iterator.next;
        } while (iterator.next != list.getHead());
    }

    @Override
    public void addRandomValues(int n) {

    }

    @Override
    public void getElements() {

    }

    @Override
    public void setBinarySearch(boolean binarySearch) {

    }

    @Override
    public int getSortedSize() {
        return 0;
    }

    @Override
    public ListElement getElementAtIndex(int index) {
        return null;
    }

    @Override
    public void insertElementAt(int index, int element) {

    }

    @Override
    public int searchIndexOfElement(int element) {
        return 0;
    }

    @Override
    public int binarySearchIndexOfElement(int element) {
        int left = 0, right = list.getSize(), middle, index;
        while(left < right) {
            middle = (left + right)/2;
            if(list.findIndex(middle).getValue() < element) {
                left = middle + 1;
            } else {
                right = middle;
            }
        }
        if(list.findIndex(left).getValue() == element) {
            return left;
        }
        return -1;
    }

    @Override
    public void run() {

    }

    @Override
    public void sort() {

    }
}
