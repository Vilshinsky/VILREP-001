package com.company;

import java.util.ArrayList;

/**
 * Created by admin on 04.08.15.
 */
public class Lesson6 {
    public static void main (String[] less6){
        Main.sleepIn(true, false);
        String a = "asdadsad";
        System.out.println(a.length());
        int [] b = {1,2,3,4,65,76};
        System.out.println(b.length);
        ArrayList<Integer> c = new ArrayList<Integer>();
        System.out.println(c.size());                       //quantity of the parameters in the list
        c.add(10);
        System.out.println(c.size());
        c.add(1);
        c.add(5);
        System.out.println(c.size());
        //c.addAll();                                         ??? to learn
        System.out.println(c.get(1));
        System.out.println(c.get(2));
        c.remove(0);                                        //removing of the first (1,2,3) value in the list
        System.out.println(c.size());
    }
}
