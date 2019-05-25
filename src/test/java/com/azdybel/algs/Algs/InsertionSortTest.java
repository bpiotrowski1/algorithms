package com.azdybel.algs.Algs;

import com.azdybel.algs.Statics.Constants;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.Assert.*;

public class InsertionSortTest {
    private int[] array1 = {9,5,3,6,7,1,2,8,0,4};
    private int[] array2 = new int[Constants.BIG_ARRAY];
    private InsertionSort insertionSort = new InsertionSort(array1);
    private InsertionSort insertionSort2 = new InsertionSort(array2);

    @Before
    public void setUp() {
        Random rand = new Random();
        for(int i = 0; i < array2.length; i++) {
            array2[i] = rand.nextInt(1000);
        }

        insertionSort.run();
        insertionSort2.run();
    }

    @Test
    public void sort() {
        Arrays.sort(array1);
        Arrays.sort(array2);
        assertArrayEquals(array1, insertionSort.getTable());
        assertArrayEquals(array2, insertionSort2.getTable());
    }

    @Test
    public void insertElementAt() {
        int integer = 1001;
        insertionSort.insertElementAt(5, integer);
        assertEquals(integer, insertionSort.getElementAtIndex(5));
        insertionSort2.insertElementAt(500, integer);
        assertEquals(integer, insertionSort2.getElementAtIndex(500));
    }

    @Test
    public void searchIndexOfElement() {
        int integer = 1001;
        insertionSort.insertElementAt(7, integer);
        assertEquals(7, insertionSort.searchIndexOfElement(integer));
        insertionSort2.insertElementAt(700, integer);
        assertEquals(700, insertionSort2.searchIndexOfElement(integer));
    }

    @Test
    public void binarySearchIndexOfElement() {
        int integer = 1001;
        insertionSort.insertElementAt(7, integer);
        assertEquals(6, insertionSort.binarySearchIndexOfElement(integer));
        insertionSort2.insertElementAt(700, integer);
        assertEquals(600, insertionSort2.binarySearchIndexOfElement(integer));
    }

    @Test
    public void addRandomValues() {
        int[] array = new int[Constants.BIG_ARRAY + 1000];
        InsertionSort insertionSort = new InsertionSort(array);
        insertionSort.run();
        insertionSort.addRandomValues(1000);

        int[] array2 = insertionSort.getTable();
        Arrays.sort(array2);
        insertionSort.run();
        assertArrayEquals(array2, insertionSort.getTable());
    }
}