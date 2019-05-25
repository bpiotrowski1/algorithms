package com.azdybel.algs.Main;

import com.azdybel.algs.Algs.*;
import com.azdybel.algs.Interfaces.IAlgorithmRunner;
import com.azdybel.algs.Statics.Constants;

import java.util.Random;

import static com.azdybel.algs.Helpers.TimeMeasurementHelper.Compare;
import static com.azdybel.algs.Helpers.TimeMeasurementHelper.ExecutionTimeMeasure;

public class Main {
    public static void main(String[] args) {
        /* --- TIME COMPARE --- */
        int[] array = new int[Constants.ARRAY];
        Random rand = new Random(System.nanoTime());
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(Constants.RAND);
        }

        IAlgorithmRunner listInsertionSort = new ListInsertionSort(array);
        IAlgorithmRunner insertionSort = new InsertionSort(array);
        IAlgorithmRunner bubbleSort = new BubbleSort(array);
        IAlgorithmRunner countingSort = new CountingSort(array);
        IAlgorithmRunner quickSort = new QuickSort(array);

//        System.out.println("list insertion sort vs insertion sort");
//        Compare(listInsertionSort, insertionSort);
//        System.out.println("list insertion sort vs couting sort");
//        Compare(listInsertionSort, countingSort);
//        System.out.println("insertion sort vs bubble sort");
//        Compare(insertionSort, bubbleSort);
//        System.out.println("counting sort vs bubble sort");
//        Compare(countingSort, bubbleSort);

        /* --- TIMES TO SORT --- */
        System.out.println("List insertion sort: ");
        ExecutionTimeMeasure(listInsertionSort, true);
        System.out.println("\nInsertion Sort: ");
        ExecutionTimeMeasure(insertionSort, true);
        System.out.println("\nBubble sort: ");
        ExecutionTimeMeasure(bubbleSort, true);
        System.out.println("\nCounting sort: ");
        ExecutionTimeMeasure(countingSort, true);
        System.out.println("\nQuick sort: ");
        ExecutionTimeMeasure(quickSort, true);


        /* --- LISTA --- */
//        ListInsertionSort listInsertionSort = new ListInsertionSort();
//        listInsertionSort.getElements();
//        System.out.println();
//        listInsertionSort.run();
//        listInsertionSort.getElements();
//        System.out.println();

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

        /* --- QUICK SORT --- */
//        QuickSort quickSort = new QuickSort();
//        quickSort.getElements();
//        System.out.println();
//        quickSort.run();
//        quickSort.getElements();
    }

}
