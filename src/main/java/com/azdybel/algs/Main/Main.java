package com.azdybel.algs.Main;

import com.azdybel.algs.Algs.IInsertionSort;
import com.azdybel.algs.Statics.Constants;

public class Main {
    public static void main(String[] args) {
//        IAlgorithmRunner testAlgorithm = new SimpleAlgorithm();
//        IAlgorithmRunner testAlgorithm2 = new SimpleAlgorithm();
//
//        Compare(testAlgorithm, testAlgorithm2);

        IInsertionSort testInsertion = new IInsertionSort();
        testInsertion.run();
        for(int i=0; i < Constants.BIG_TABLE; i++) {
            System.out.print(testInsertion.getElementOfIndex(i) + " ");
        }
    }

}
