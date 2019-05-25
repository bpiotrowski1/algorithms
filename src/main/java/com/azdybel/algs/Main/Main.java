package com.azdybel.algs.Main;

import com.azdybel.algs.Algs.BubbleSort;
import com.azdybel.algs.Algs.InsertionSort;
import com.azdybel.algs.Algs.ListInsertionSort;
import com.azdybel.algs.Interfaces.IAlgorithmRunner;
import com.azdybel.algs.Statics.Constants;

import java.util.Random;

import static com.azdybel.algs.Helpers.TimeMeasurementHelper.ExecutionTimeMeasure;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[Constants.ARRAY];
        Random rand = new Random(System.nanoTime());
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(50);
        }

        IAlgorithmRunner listInsertionSort = new ListInsertionSort(array);
        IAlgorithmRunner insertionSort = new InsertionSort(array);
        IAlgorithmRunner bubbleSort = new BubbleSort(array);

        System.out.println("List insertion sort: ");
        ExecutionTimeMeasure(listInsertionSort, true);
        System.out.println("\nInsertion Sort: ");
        ExecutionTimeMeasure(insertionSort, true);
        System.out.println("\nBubble sort: ");
        ExecutionTimeMeasure(bubbleSort, true);


        /* --- LISTA --- */
        //ListInsertionSort myList = new ListInsertionSort();
        //myList.setup();

        /* --- BUBBLE SORT --- */
//        BubbleSort bubbleSort = new BubbleSort();
//        bubbleSort.getElements();
//        System.out.println();
//        bubbleSort.sort();
//        bubbleSort.getElements();
    }

}
