package com.company;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by admin on 20.08.15.
 */
public class Omnomnom {
    @Test
    public void test1() {
        Assert.assertEquals(20, 10 + 10);
        Assert.assertEquals(true, 1 == 1);          //OR Assert.assertTrue(1 == 1);
    }
    @Test
    public void Test3() {
        Assert.assertEquals(10, sumAll(new int[]{1, 4, 2, 3, 0}));
    }
    @Test
    public void Test3Failed() {
        Assert.assertEquals(38, sumAll(new int[]{1, 41, 2}));
    }
    public static int sumAll(int[] a) {
        int res = 0;
        for (int e : a) {
            res += e;                              //res1 = res + e; res2 = res1(res + e) + e1;
        }
        return res;
    }
        // OR!
    public static int sumAll2(int[] a) {
        int res = 0;
        for (int i = 0; i < a.length; i++) {
            res = res + a[i];
        }
        return res;
    }
}
