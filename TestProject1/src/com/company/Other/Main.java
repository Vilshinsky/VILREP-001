package com.company.Other;

import com.sun.org.apache.xpath.internal.SourceTree;

public class Main {
    // ������� ��������� �����, � ���������� ������� ��� ����� ���������� �� ����.
    public static int square(int value) {
        return value * value;
    }
    // ������� ��������� ����� � ������, � ���������� ������� ��� ������ ����������� ����� ���.
    public static String multiString(int times, String value) {
        String result = "";
        for (int dsa = 0; dsa < times; dsa++) {
            result += value;
        }
        return result;
    }
    // ������� ��������� 2 ������� ������� 5, � ���������� ������ ��������� �� � ��� ��� �������� (true/false).
    public static boolean compare5ElArrays(int[] arr1, int[] arr2) {
        for (int inb = 0; inb < 5; inb++) {
            if (arr1[inb] != arr2[inb]) {
                return false;
            }
        }
        return true;
    }
    // ������� ��������� 2 ������� ����� �������, � ������� � ���������� ����������� �� ��� �� ��������.
    public static boolean compareArrays(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
    // Helper functions for beautiful output.
    public static void checkResult(int expected, int actual) {
        if (expected == actual) {
            System.out.println("Test PASSED.");
        } else {
            System.out.println("Expected: " + expected + " Actual: " + actual + " Test FAILED.");
        }
    }
    public static void checkResult2(String expected, String actual) {
        if (expected.equals(actual)) {
            System.out.println("Test PASSED.");
        } else {
            System.out.println("Expected: " + expected + " Actual: " + actual + " Test FAILED.");
        }
    }
    public static void checkResult3(boolean expected, boolean actual) {
        if (expected == actual) {
            System.out.println("Test PASSED.");
        } else {
            System.out.println("Expected: " + expected + " Actual: " + actual + " Test FAILED.");
        }
    }

    public static void main(String[] args) {
	// write your code here
//        String t = "hello Class!";
//        System.out.println(t);
//        String ts = ", and Students!";
//        System.out.println(t + ts);
//        String[] u = {"asd","Ufff","Under key one but three","ssssddd","asdsad","Under key five"};
//        System.out.println(u[5]);
//        System.out.println(u[3-1]);
//        for (int x = 8; x < 11; x++) {
//            System.out.println(x);
//        }
//        String[] s = {"How", "are", "you"};
//        for (int i = 0; i < 3; i++) {
//            System.out.println(s[i]);
//        }
//        int[] m = {10, 20, 25, 30};
//        int i = 0;
//        int b = 25;
//        while (i < 4) {
//            if (m[i] == b) {
//                break;
//            }
//            System.out.println(m[i]);
//            i++;
//        }
//        int[] n = {10, 20, 25, 30};
//        int j = 0;
//        int d = 10;
//        while (j < 4) {
//            if (n[j] == d) {
//                j++;
//                continue;
//            }
//            System.out.println(n[j]);
//            j++;
//        }
//        int a = -2;
//        int b = 18;
//        int c = a * b;
//        System.out.println(c);
//        int d = 0;
//        int e = -1000;
//        int f = d/e;
//        System.out.println(f);
//        int g = 113;
//        int h = 1;
//        int i = g * h;
//        System.out.println(i);
//        boolean oper1 = true;
//        int j = 10;
//        int k = -8;
//        if (oper1 == true) {
//            System.out.println(j + k);
//        } else {
//            System.out.println(j - k);
//        }
//        boolean op2 = false;
//        int l = 3;
//        int m = 2;
//        if (op2 == false) {
//            System.out.println(l - m);
//        } else {
//            System.out.println(l + m);
//        }
//        boolean op3 = false;
//        int n = 0;
//        int o = -200;
//        if (op3 == true) {
//            System.out.println(n + o);
//        } else {
//            System.out.println(n - o);
//        }
//        boolean op4 = true;
//        int p = 999;
//        int r = 1;
//        if (op4 == false) {
//            System.out.println(p - r);
//        } else {
//            System.out.println(p + r);
//        }
//        boolean anti = true;
//        if (anti == true) {
//            System.out.println("false");
//        }
//        boolean anti1 = false;
//        if (anti1 == false) {
//            System.out.println("true");
//        }
//        String[] strings = {"Hello", "World", "Class", "Guys", "Girls", "Everyone", "Goodbye"};
//        int w1 = 1;
//        int w2 = 3;
//        if (w1 == 1 && w2 == 3) {
//            System.out.println(strings[0] + " " + strings[2]);
//        }
//        if (w1 == 1 || w2 == 3) {
//            System.out.println(strings[0] + " " + strings[5]);
//        }
//        if (w1 == w2 - 2) {
//            System.out.println(strings[0] + " " + strings[4]);
//        }
//        if (w2 == w1 + 2) {
//            System.out.println(strings[0] + " " + strings[6]);
//        }
//        int[] notstrings = {1, 2, 3, 4, 1, 3, 1, 6, 6, 1, 1};
//        int target = 1;
//        if (notstrings[0] == target) {
//            System.out.println(notstrings[1] + notstrings[2]);
//        }
//        int target1 = 6;
//        if (notstrings[0] + notstrings[1] + notstrings[2] == 6) {
//            System.out.println(notstrings[7] - notstrings[3]);
//        }
//        int target2 = 7;
//        if (target2 == 7) {
//            System.out.println(notstrings[7] - notstrings[2]);
//        }
//        int[] input1 = {1, 2, 3, 5, 1, 3, 1, 3, 3, 1, 1};
//        int isAllLessThan = 4;
//        if (input1[0 - 10] < isAllLessThan) {
//            System.out.println("true");
//                } else {
//            System.out.println("false");
//            }
        int ass = square(1);
        System.out.println(ass);

        System.out.println(multiString(3, "Hello"));

        System.out.println(compare5ElArrays(new int[]{1, 2, 3, 4, 6}, new int[]{1, 2, 3, 4, 6}));

        System.out.println(compareArrays(new int[]{1, 2, 3, 4, 5, 6}, new int[]{1, 2, 3, 4, 5, 6, 7}));

        checkResult(5, 5);

        checkResult2("Yep", "Yep");

        checkResult3(true, false);
    }
    }
