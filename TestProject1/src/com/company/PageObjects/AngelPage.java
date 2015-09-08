package com.company.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

/**
 * Created by Admin on 08.09.15.
 */
public class AngelPage {
    public static String pageUrl = "http://angel.net/~nic/passwd.current.html";

    public static void setMaster (String value) {
        TestHelper.driver.findElement(By.cssSelector("[name='master']")).clear();
        TestHelper.driver.findElement(By.cssSelector("[name='master']")).sendKeys(value);
    }

    public static void setSiteName (String value) {
        TestHelper.driver.findElement(By.cssSelector("[name='site']")).clear();
        TestHelper.driver.findElement(By.cssSelector("[name='site']")).sendKeys(value);
    }

    public static void generate() {
        TestHelper.driver.findElement(By.cssSelector("[type='submit']")).click();
    }

    public static String giveValue() {
        return TestHelper.driver.findElement(By.cssSelector("[name='password']")).getAttribute("value");
    }

    public static int giveValueLength() {
        return TestHelper.driver.findElement(By.cssSelector("[name='password']")).getAttribute("value").length();
    }

    public static String giveMasterValue() {
        return TestHelper.driver.findElement(By.cssSelector("[name='master']")).getAttribute("value");
    }

    public static String giveSiteNameValue() {
        return TestHelper.driver.findElement(By.cssSelector("[name='site']")).getAttribute("value");
    }

    public static void enterKey() {
        TestHelper.driver.findElement(By.cssSelector("[name='site']")).sendKeys(Keys.ENTER);
    }
}
