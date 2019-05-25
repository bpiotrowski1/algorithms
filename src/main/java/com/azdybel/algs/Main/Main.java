package com.azdybel.algs.Main;

import com.azdybel.algs.Algs.BubbleSort;
import com.azdybel.algs.Algs.CountingSort;
import com.azdybel.algs.Algs.InsertionSort;
import com.azdybel.algs.Algs.ListInsertionSort;
import com.azdybel.algs.Interfaces.IAlgorithmRunner;
import com.azdybel.algs.Statics.Constants;

import java.util.Random;

import static com.azdybel.algs.Helpers.TimeMeasurementHelper.ExecutionTimeMeasure;

public class Main {
    public static void main(String[] args) {
        /* --- TIME COMPARE --- */
        int[] array = new int[Constants.ARRAY];
        Random rand = new Random(System.nanoTime());
        for (int i = 0; i < array.length; i++) {
            //array[i] = rand.nextInt(50);
            array[i] = rand.nextInt(Constants.RAND);       //dla counting sort
        }

        IAlgorithmRunner listInsertionSort = new ListInsertionSort(array);
        IAlgorithmRunner insertionSort = new InsertionSort(array);
        IAlgorithmRunner bubbleSort = new BubbleSort(array);
        IAlgorithmRunner countingSort = new CountingSort(array);

        System.out.println("List insertion sort: ");
        ExecutionTimeMeasure(listInsertionSort, true);
        System.out.println("\nInsertion Sort: ");
        ExecutionTimeMeasure(insertionSort, true);
        System.out.println("\nBubble sort: ");
        ExecutionTimeMeasure(bubbleSort, true);
        System.out.println("\nCounting sort: ");
        ExecutionTimeMeasure(countingSort, true);


        /* --- LISTA --- */
//        ListInsertionSort myList = new ListInsertionSort();
//        myList.setup();

        /* --- INSERTION SORT --- */
//        InsertionSort insertionSort = new InsertionSort();
//        insertionSort.getElements();
//        System.out.println();
//        insertionSort.run();
//        insertionSort.getElements();

        /* --- BUBBLE SORT --- */
//        BubbleSort bubbleSort = new BubbleSort();
//        bubbleSort.getElements();
//        System.out.println();
//        bubbleSort.sort();
//        bubbleSort.getElements();

        /* --- COUNTING SORT --- */
//        CountingSort countingSort = new CountingSort();
//        countingSort.getElements();
//        System.out.println();
//        countingSort.run();
//        countingSort.getElementsOut();
    }

}
