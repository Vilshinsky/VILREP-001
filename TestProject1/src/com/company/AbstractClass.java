package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

/**
 * Created by Alexander on 25.08.2015.
 */
public abstract class AbstractClass {
    public static void main (String[] asdsada) {
        WebDriver drvr = new FirefoxDriver();
        drvr.get("http://djinni.co/");
        List<WebElement> links = drvr.findElements(By.tagName("a"));
        for (WebElement w : links) {
            System.out.println(w.getText());
        }
        System.out.println("The number of the links is " + links.size());                           //Show the number of elements tagged <a>


    }
}
