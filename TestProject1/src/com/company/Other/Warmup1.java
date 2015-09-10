package com.company.Other;

/**
 * Created by Alexander on 06.08.2015.
 */
public class Warmup1 {
    // The parameter weekday is true if it is a weekday,
    // and the parameter vacation is true if we are on vacation.
    // We sleep in if it is not a weekday or we're on vacation.
    // Return true if we sleep in.
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            System.out.println("True");
            return true;
        }
        System.out.println("False");
        return false;
    }
    // We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling.
    // We are in trouble if they are both smiling or if neither of them is smiling.
    // Return true if we are in trouble.
    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if (aSmile && bSmile) {
            System.out.println("monkey true");
            return true;
        }
        if (!aSmile && !bSmile) {
            System.out.println("monkey true");
            return true;
        }
        System.out.println("monkey false");
        return false;
    }
    // Given two int values, return their sum.
    // Unless the two values are the same, then return double their sum.
    public static int sumDouble (int a, int b) {
        int sum = a + b;
        if (a == b) {
            sum = sum * 2;
        }
        return sum;
    }
    // Given an int n, return the absolute difference between n and 21,
    // except return double the absolute difference if n is over 21.
    public static int diff21(int n) {
        if (n  <= 21) {
            return 21 - n;
        } else {
            return (n - 21) * 2;
        }
    }
    // We have a loud talking parrot.
    // The "hour" parameter is the current hour time in the range 0..23.
    // We are in trouble if the parrot is talking and the hour is before 7 or after 20.
    // Return true if we are in trouble.
    public static boolean parrotTrouble(boolean talking, int hour) {
        return (talking && (hour < 7 || hour > 20));
    }
    public static void main (String[] warm1) {
        sleepIn(true, false);
        sleepIn(true, true);
        sleepIn(false, false);
        sleepIn(false, true);

        monkeyTrouble(true, true);
        monkeyTrouble(false, false);
        monkeyTrouble(true, false);

        System.out.println(sumDouble(1, 5));
        System.out.println(sumDouble(5, 3));
        System.out.println(sumDouble(5, 5));

        System.out.println(diff21(19));
        System.out.println(diff21(10));
        System.out.println(diff21(21));
        System.out.println(diff21(100));
        System.out.println(diff21(15));
        System.out.println(diff21(6));

        System.out.println(parrotTrouble(true, 6));
        System.out.println(parrotTrouble(true, 7));
        System.out.println(parrotTrouble(false, 6));
    }
}
