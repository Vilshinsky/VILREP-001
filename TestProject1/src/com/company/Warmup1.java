package com.company;

/**
 * Created by Alexander on 06.08.2015.
 */
public class Warmup1 {
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            System.out.println("True");
            return true;
        }
        System.out.println("False");
        return false;
    }
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
    public static void main (String[] warm1) {
        sleepIn(true, false);
        sleepIn(true,true);
        sleepIn(false,false);
        sleepIn(false,true);

        monkeyTrouble(true, true);
        monkeyTrouble(false,false);
        monkeyTrouble(true,false);
    }
}
