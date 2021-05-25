package com.datastructures.solution;

class SortingAlgorithm {

    /**
     * sorting integer array
     * by swapping two adjacent elements if lower index one is bigger than the higher index
     * stop iteration until no more swapping
     * @param input integer array
     */
    public static void bubbleSort(int[] input){
        if(input == null)
            throw new IllegalArgumentException();
        int size = input.length;
        if(size == 0)
            return; // empty array
        boolean sorted = false; // true if no more swapping
        while(true) {
            int pointer = 0; // index of current value
            sorted = true; // assume it is sorted until locate unsorted element
            while(size > 1)  {
                // swapping values
                if (input[pointer] > input[pointer + 1]) {
                    int tem = input[pointer + 1];
                    input[pointer + 1] = input[pointer];
                    input[pointer] = tem;
                    sorted = false;
                }
                pointer++;
                if (pointer == size-1)
                    break; // break current loop if it is the last element
            }
            size --;
            if(sorted)
                break;

        }
    }
}
