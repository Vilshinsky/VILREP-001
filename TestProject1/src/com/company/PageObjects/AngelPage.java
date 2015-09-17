package com.company.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

/**
 * Created by Admin on 08.09.15.
 */
public class AngelPage {
    public static String pageUrl1 = "http://angel.net/~nic/passwd.current.html";
    public static String pageUrl2 = "http://oxogamestudio.com/passwd.current2.htm";
    public static String pageUrl3 = "http://oxogamestudio.com/passwd.current3.htm";
    public static String pageUrl4 = "http://oxogamestudio.com/passwd.current4.htm";
    public static String pageUrl5 = "http://oxogamestudio.com/passwd.current5.htm";
    public static String pageUrl6 = "http://oxogamestudio.com/passwd.current6.htm";
    public static String pageUrl7 = "http://oxogamestudio.com/passwd.current7.htm";
    public static String pageUrl8 = "http://oxogamestudio.com/passwd.current8.htm";
    public static String pageUrl9 = "http://oxogamestudio.com/passwd.current9.htm";

    private static String masterSel = "tbody tr:nth-child(1) input";
    private static String siteSel = "tbody tr:nth-child(2) input";
    private static String generateSel = "tbody tr:nth-child(3) input";
    private static String generatedValueSel = "tbody tr:nth-child(3) input";

    private static String masterTitleSel = "tbody tr:nth-child(1) td:nth-child(1)";
    private static String siteTitleSel = "tbody tr:nth-child(2) td:nth-child(1)";
    private static String generatedTitleSel = "tbody tr:nth-child(4) td:nth-child(1)";
    private static String generateTitleSel = "tbody tr:nth-child(3) td:nth-child(1)";

    public static void setMaster (String value) {
        TestHelper.driver.findElement(By.cssSelector(masterSel)).clear();
        TestHelper.driver.findElement(By.cssSelector(masterSel)).sendKeys(value);
    }

    public static void setSiteName (String value) {
        TestHelper.driver.findElement(By.cssSelector(siteSel)).clear();
        TestHelper.driver.findElement(By.cssSelector(siteSel)).sendKeys(value);
    }

    public static void generate() {
        TestHelper.driver.findElement(By.cssSelector(generateSel)).click();
    }

    public static String getValue() {
        return TestHelper.driver.findElement(By.cssSelector(generatedValueSel)).getAttribute("value");
    }

    public static int getValueLength() {
        return getValue().length();
    }

    public static String getMasterValue() {
        return TestHelper.driver.findElement(By.cssSelector(masterSel)).getAttribute("value");
    }

    public static String getSiteNameValue() {
        return TestHelper.driver.findElement(By.cssSelector(siteSel)).getAttribute("value");
    }

    public static boolean isElementEnabled(String target) {
        if(TestHelper.driver.findElement(By.cssSelector(target)).isEnabled()) {
            return true;
        }
        return false;
    }

    public static String masterTitle() {
        return TestHelper.driver.findElement(By.cssSelector(masterTitleSel)).getText();
    }

    public static String siteTitle() {
        return TestHelper.driver.findElement(By.cssSelector(siteTitleSel)).getText();
    }

    public static String generatedTitle() {
        return TestHelper.driver.findElement(By.cssSelector(generatedTitleSel)).getText();
    }

    public static String generateButtonTitle() {
        return TestHelper.driver.findElement(By.cssSelector(generateTitleSel)).getAttribute("value");
    }

    public static boolean cyclicMatchWaiting(String expectedGener) {
        for (int i = 0; i < 30; i++)    {
            if (AngelPage.getValue().equals(expectedGener)) {
                break;
            }
            TestHelper.slp(1);
        }
        return true;
    }
}
