package com.company.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

/**
 * Created by Admin on 08.09.15.
 */
public class AngelPage {
    public static String pageUrl = "http://angel.net/~nic/passwd.current.html";
    public static String pageUrl2 = "http://oxogamestudio.com/passwd.current2.htm";
    public static String pageUrl3 = "http://oxogamestudio.com/passwd.current3.htm";
    public static String pageUrl4 = "http://oxogamestudio.com/passwd.current4.htm";
    public static String pageUrl5 = "http://oxogamestudio.com/passwd.current5.htm";
    public static String pageUrl6 = "http://oxogamestudio.com/passwd.current6.htm";
    public static String pageUrl7 = "http://oxogamestudio.com/passwd.current7.htm";
    public static String pageUrl8 = "http://oxogamestudio.com/passwd.current8.htm";
    public static String pageUrl9 = "http://oxogamestudio.com/passwd.current9.htm";

    public static void setMaster (String value) {
        TestHelper.driver.findElement(By.cssSelector("tbody tr:nth-child(1) input")).clear();
        TestHelper.driver.findElement(By.cssSelector("tbody tr:nth-child(1) input")).sendKeys(value);
    }

    public static void setSiteName (String value) {
        TestHelper.driver.findElement(By.cssSelector("tbody tr:nth-child(2) input")).clear();
        TestHelper.driver.findElement(By.cssSelector("tbody tr:nth-child(2) input")).sendKeys(value);
    }

    public static void generate() {
        TestHelper.driver.findElement(By.cssSelector("[type='submit']")).click();
    }

    public static String giveValue() {
        return TestHelper.driver.findElement(By.cssSelector("tbody tr:nth-child(4) input")).getAttribute("value");
    }

    public static int giveValueLength() {
        return TestHelper.driver.findElement(By.cssSelector("tbody tr:nth-child(4) input")).getAttribute("value").length();
    }

    public static String giveMasterValue() {
        return TestHelper.driver.findElement(By.cssSelector("tbody tr:nth-child(1) input")).getAttribute("value");
    }

    public static String giveSiteNameValue() {
        return TestHelper.driver.findElement(By.cssSelector("tbody tr:nth-child(2) input")).getAttribute("value");
    }

    public static void enterKey() {
        TestHelper.driver.findElement(By.cssSelector("tbody tr:nth-child(2) input")).sendKeys(Keys.ENTER);
    }
    public static boolean masterEnabled() {
        if(TestHelper.driver.findElement(By.cssSelector("tbody tr:nth-child(1) input")).isEnabled() == true) {
            return true;
        }
        return false;
    }
    public static boolean siteEnabled() {
        if(TestHelper.driver.findElement(By.cssSelector("tbody tr:nth-child(2) input")).isEnabled() == true) {
            return true;
        }
        return false;
    }
    public static boolean generatedEnabled() {
        if(TestHelper.driver.findElement(By.cssSelector("tbody tr:nth-child(2) input")).isEnabled() == true) {
            return true;
        }
        return false;
    }
    public static String masterTitle() {
        return TestHelper.driver.findElement(By.cssSelector("tbody tr:nth-child(1) td:nth-child(1)")).getText();
    }
    public static String siteTitle() {
        return TestHelper.driver.findElement(By.cssSelector("tbody tr:nth-child(2) td:nth-child(1)")).getText();
    }
    public static String generatedTitle() {
        return TestHelper.driver.findElement(By.cssSelector("tbody tr:nth-child(4) td:nth-child(1)")).getText();
    }
    public static String generateButtonTitle() {
        return TestHelper.driver.findElement(By.cssSelector("tbody tr:nth-child(3) input")).getAttribute("value");
    }
}
