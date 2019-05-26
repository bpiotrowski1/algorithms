package com.azdybel.algs.Algs;

import com.azdybel.algs.Statics.Constants;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.Assert.*;

//TODO
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
        assertEquals(7, insertionSort.binarySearchIndexOfElement(integer));
        insertionSort2.insertElementAt(700, integer);
        insertionSort2.run();
        assertEquals(999, insertionSort2.binarySearchIndexOfElement(integer));
    }
}