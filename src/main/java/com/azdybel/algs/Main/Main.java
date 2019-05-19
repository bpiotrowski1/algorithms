package com.azdybel.algs.Main;

import com.azdybel.algs.Algs.InsertionSort;
import com.azdybel.algs.Interfaces.IAlgorithmRunner;

import static com.azdybel.algs.Helpers.TimeMeasurementHelper.ExecutionTimeMeasure;

public class Main {
    public static void main(String[] args) {
        IAlgorithmRunner insertionSort = new InsertionSort();

        ExecutionTimeMeasure(insertionSort, true);
        //insertionSort.addRandomValues(100);
        //ExecutionTimeMeasure(insertionSort, true);
    }

}
