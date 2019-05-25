package com.azdybel.algs.Algs;

import com.azdybel.algs.Statics.Constants;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.Assert.*;

public class BubbleSortTest {
    private int[] array1 = {9, 5, 3, 6, 7, 1, 2, 8, 0, 4};
    private int[] array2 = new int[Constants.BIG_ARRAY];
    private BubbleSort bubbleSort = new BubbleSort(array1);
    private BubbleSort bubbleSort2 = new BubbleSort(array2);

    @Before
    public void setUp() {
        Random rand = new Random();
        for (int i = 0; i < array2.length; i++) {
            array2[i] = rand.nextInt(1000);
        }

        bubbleSort.run();
        bubbleSort2.run();
    }

    @Test
    public void compare() {
        assertTrue(bubbleSort.compare(2, 1));
        assertTrue(bubbleSort.compare(999999, 100));
    }

    @Test
    public void sort() {
        Arrays.sort(array1);
        Arrays.sort(array2);
        assertArrayEquals(array1, bubbleSort.getTable());
        assertArrayEquals(array2, bubbleSort2.getTable());
    }

    @Test
    public void swap() {
        int[] toSwap = {1000, 2};
        int[] swapped = {2, 1000};
        BubbleSort bubbleSort3 = new BubbleSort(toSwap);
        bubbleSort3.swap(0,1);
        assertArrayEquals(toSwap, swapped);
    }
}