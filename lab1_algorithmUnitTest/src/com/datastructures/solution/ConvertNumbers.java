package com.datastructures.solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

class ConvertNumbers {
    public static void main(String[] args) {
        System.out.println("Test");
    }

    /**
     * convert string octal to binary
     * @param octal
     * @return
     */
    protected String convertOctalToBinaryString(String octal) {
        int digit = this.isDigit(octal);
        if( digit  == 0)
            return "0"; // if input is null or empty
        else if ( digit == -1)
            throw new IllegalArgumentException(); // non-digit char
        else{
            int input = Integer.parseInt(octal);
            boolean negative = false; // negative number
            if(input == 0)
                return "0";
            if(input < 0) {
                negative = true;
                input = Math.abs(input);
            }

            Stack<Character> result = new Stack<Character>();

            while (input > 0) {
                if(input % 2 == 0) {
                    result.push('0'); // 0 digit
                } else {
                    result.push('1'); // 1 digit
                    input -= 1; // take it out and go to next iteration
                }
                input = input / 2;
            }
            StringBuilder binaryString = new StringBuilder();
            if(negative)
                binaryString.append('1');

            while(!result.isEmpty()){
                binaryString.append(result.pop());
            }
            return binaryString.toString();
        }
    }

    /**
     * check weather a string contains a non-digit char
     * @param stringNum input number in string formate
     * @return
     */
    private int isDigit(String stringNum){
        int result = 1;
        if(stringNum == null || stringNum.isEmpty()){
            result = 0;
        } else{
            for (int i = 0; i < stringNum.length(); i ++) {
                if(i == 0 && stringNum.charAt(i) == '-')
                    continue;
                if(!Character.isDigit(stringNum.charAt(i))){
                    result = -1;
                    break;
                }
            }
        }

        return result;
    }

    // just call sort() for lab purpuse
    protected void mergeSort(int[] array){
        Arrays.sort(array);
    }

    protected List<Integer> intersection(int[] a, int[] b){
        List<Integer> result = new ArrayList<>();
        this.mergeSort(a);
        this.mergeSort(b);
        int index_a = 0;
        int index_b = 0;

        // move to right if value is smaller
        while(index_a < a.length && index_b < b.length ){
            if(a[index_a] > b[index_b]){
                index_b ++;
            } else if(a[index_a] < b[index_b]){
                index_a ++;
            } else{
                result.add(b[index_b]);
                index_a ++; // only increase one, so collect multiple same values
            }
        }
        return result;
    }

}
