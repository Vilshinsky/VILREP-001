package com.company.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Admin on 08.09.15.
 */
public class TestHelper {

    public static WebDriver driver;

    public static void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    public static void get(String url) {
        driver.get(url);
    }

    public static void setupAndGo(String link) {
        setup();
        get(link);
    }

    public static void quit() {
        driver.quit();
    }

    public static WebElement cyclicElementFinding(String target) {
        for (int i = 0; i < 30; i++)    {
            if (driver.findElements(By.cssSelector(target)).size() > 0) {
                break;
            }
            slp(1);
        }
        return driver.findElement(By.cssSelector(target));
    }

    public static void slp (long msec) {
        try {
            Thread.sleep(msec*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void slpsec (long sec) {
        try {
            Thread.sleep(sec*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
//    public static boolean isAlreadyGenerated(String expectedGener) {
//        if(AngelPage.giveValue() == expectedGener) {
//            return true;
//        }
//        cyclicElementFinding();
//        return false;
//        }

    public static boolean cyclicMatchWaiting(String expectedGener) {
        for (int i = 0; i < 30; i++)    {
            if (AngelPage.giveValue().equals(expectedGener)) {
                break;
            }
            slp(1);
        }
        return true;
    }
}
