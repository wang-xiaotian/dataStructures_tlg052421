package com.datastructures.solution;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SortingAlgorithmTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testBubbleSort_returnSortedArray() {
        int[] a = {2,9,3,7,4,0,1};
        int[] a_sorted = {0,1,2,3,4,7,9};
        SortingAlgorithm.bubbleSort(a);
        Assert.assertArrayEquals(a_sorted, a);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBubbleSort_throwExceptionIfInputArrayNull() {
        SortingAlgorithm.bubbleSort(null);
    }

    @Test
    public void testBubbleSort_emptyArray() {
        int[] a = {};
        int[] a_sorted = {};
        Assert.assertEquals(a.length, 0);
        SortingAlgorithm.bubbleSort(a);
        Assert.assertArrayEquals(a, a_sorted);
    }

    @Test
    public void testBubbleSort_returnSortedArrayWithDuplicateValues() {
        int[] a = {2,9,3,7,4,3,0,-1,1};
        int[] a_sorted = {-1,0,1,2,3,3,4,7,9};
        SortingAlgorithm.bubbleSort(a);
        Assert.assertArrayEquals(a_sorted, a);
    }

    @Test
    public void testBubbleSort_returnSortedArrayWithMaxMinIntegers() {
        int[] a = {2,9,3,7,Integer.MAX_VALUE,3,0,-1,1,Integer.MIN_VALUE};
        int[] a_sorted = {Integer.MIN_VALUE,-1,0,1,2,3,3,7,9,Integer.MAX_VALUE};
        SortingAlgorithm.bubbleSort(a);
        Assert.assertArrayEquals(a_sorted, a);
    }
}