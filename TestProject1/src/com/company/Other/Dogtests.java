package com.company.Other;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dogtests {
    @Test
    public void test3() {

        Assert.assertEquals(10, sumAll(new int[] {1, 4, 2, 3, 0}));
    }

    @Test
    public void testFailed() {

        Assert.assertEquals(38, sumAll(new int[]{1, 41, 2}));
    }

    public static int sumAll(int[] a) {
        int res = 0;
        for (int e : a) {
            res = res + e;
        }
        return res;
    }

    public static int sumAll2(int[] a) {
        int res = 0;
        for (int i = 0; i < a.length; i++) {
            int e = a[i];
            res = res + e;
        }
        return res;
    }
    public static void main (String[] ttt) {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
        WebDriver gcd = new ChromeDriver();

    }
}
