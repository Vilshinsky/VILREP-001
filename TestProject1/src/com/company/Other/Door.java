package com.company.Other;

import com.company.PageObjects.TestHelper;
import org.openqa.selenium.By;


/**
 * Created by Admin on 15.09.15.
 */
public class Door {

    public String color = "Wood";
    private String state = "Closed";
    public String state() {
        return state;
    }
    public String open() {
        state = "Open";
        return state;
    }
    public static String made = "China";
}
