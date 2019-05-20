package com.azdybel.algs.Main;

import com.azdybel.algs.Algs.InsertionSort;
import com.azdybel.algs.Algs.ListInsertionSort;
import com.azdybel.algs.Interfaces.IAlgorithmRunner;

import static com.azdybel.algs.Helpers.TimeMeasurementHelper.ExecutionTimeMeasure;

public class Main {
    public static void main(String[] args) {
//        InsertionSort intSort = new InsertionSort();
//        ExecutionTimeMeasure(intSort, true);
//        System.out.println();
//        System.out.println("INDEX: " + intSort.binarySearchIndexOfElement(30));
//        intSort.getElements();
//        ExecutionTimeMeasure(insertionSort, true);
//        insertionSort.addRandomValues(1000);
//        ExecutionTimeMeasure(insertionSort, true);


        /* --- LISTA --- */
        ListInsertionSort myList = new ListInsertionSort();
        myList.setup();
    }

}
