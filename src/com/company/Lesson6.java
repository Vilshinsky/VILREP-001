package com.company;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Arrays;

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
        System.out.println(c.get(1));
        System.out.println(c.get(2));
        c.remove(0);                                        //removing of the first (1,2,3) value in the list
        System.out.println(c.size());
        Integer[] c1 = {1,2,10,20};
        c.addAll(Arrays.asList(c1));                        //mass creation of some values for the current list "c"
        System.out.println(c.size());

        System.setProperty("webdriver.chrome.driver", "C:\\Share\\chromedriver.exe");

        ChromeDriver drvr1 = new ChromeDriver();

    }
}
