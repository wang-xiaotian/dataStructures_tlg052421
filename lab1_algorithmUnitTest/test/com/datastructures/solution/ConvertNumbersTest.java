package com.datastructures.solution;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertNumbersTest {
    private ConvertNumbers converter;

    @Before
    public void init(){
        converter = new ConvertNumbers();
    }

    @Test
    public void testConvertFromOctal_returnZero() {
        Assert.assertEquals("0", converter.convertOctalToBinaryString(""));
        Assert.assertEquals("0", converter.convertOctalToBinaryString(null));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConvertFromOctal_throwIllegalArgument() {
        Assert.assertEquals("0", converter.convertOctalToBinaryString("sdfas"));
    }

    @Test
    public void testConvertFromOctal_returnBinaryValueInStringFormat() {
        Assert.assertEquals("1000", converter.convertOctalToBinaryString("8"));
        Assert.assertEquals("1001", converter.convertOctalToBinaryString("9"));
        Assert.assertEquals("0", converter.convertOctalToBinaryString("0"));
        Assert.assertEquals("1", converter.convertOctalToBinaryString("1"));

        System.out.printf("the number is %d and %d\n", 1, -1);
        System.out.println(converter.convertOctalToBinaryString("1"));
        System.out.println(Integer.toBinaryString(1));
        System.out.println(converter.convertOctalToBinaryString("-1"));
        System.out.println(Integer.toBinaryString(-1));

        System.out.printf("the number is %d and %d\n", 8, -8);
        System.out.println(converter.convertOctalToBinaryString("8"));
        System.out.println(Integer.toBinaryString(8));
        System.out.println(converter.convertOctalToBinaryString("-8"));
        System.out.println(Integer.toBinaryString(-8));

        System.out.printf("the number is %d and %d\n", Integer.MAX_VALUE, Integer.MIN_VALUE+1);
        System.out.println(converter.convertOctalToBinaryString(Integer.toString(Integer.MAX_VALUE)));
        System.out.println(Integer.toBinaryString(Integer.MAX_VALUE));
        System.out.println(converter.convertOctalToBinaryString(Integer.toString(Integer.MIN_VALUE+1)));
        System.out.println(Integer.toBinaryString(Integer.MIN_VALUE+1));

        // Integer MAX and MIN
        Assert.assertEquals(Integer.toBinaryString(Integer.MAX_VALUE), converter.convertOctalToBinaryString(Integer.toString(Integer.MAX_VALUE)));
        //Assert.assertEquals(Integer.toBinaryString(Integer.MIN_VALUE), converter.convertOctalToBinaryString(Integer.toString(Integer.MIN_VALUE)));
        // Long MAX and MIN
    }

    @Test
    public void testInteraction_returnListWithSameValues() {
        int[] a = {1,2,3,4,5,6};
        int[] b = {2,3,5};
        List<Integer> result = new ArrayList<>(Arrays.asList(2,3,5));
        Assert.assertEquals(converter.intersection(a, b), result);

        int[] t2_a = {1};
        int[] t2_b = {2};
        List<Integer> t2_r = new ArrayList<>(Arrays.asList());
        Assert.assertEquals(converter.intersection(t2_a, t2_b), t2_r);

        int[] t3_a = {1,1,1};
        int[] t3_b = {2,1};
        List<Integer> t3_r = new ArrayList<>(Arrays.asList(1,1,1));
        Assert.assertEquals(converter.intersection(t3_a, t3_b), t3_r);
    }
}