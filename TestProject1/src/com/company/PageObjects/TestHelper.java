package com.company.PageObjects;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.security.Credentials;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Admin on 08.09.15.
 */
public class TestHelper {

    public static WebDriver driver;

    public static void setupChrome() {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    public static void setupChromeAndGo(String link) {
        setupChrome();
        get(link);
    }

    public static void setupFirefox() {
        driver = new FirefoxDriver();
    }

    public static void setupFirefoxAndGo(String link) {
        setupFirefox();
        get(link);
    }

    public static void setupIE() {
        driver = new InternetExplorerDriver();
    }

    public static void setupIEAndGo(String link) {
        setupIE();
        get(link);
    }

    public static void setupOpera() {
        driver = new OperaDriver();
    }

    public static void setupOperaAndGo(String link) {
        setupOpera();
        get(link);
    }

    public static void get(String url) {
        driver.get(url);
    }

    public static void quit() {
        driver.quit();
    }

    public static WebElement cyclicElementFindingById(String target) {
        for (int i = 0; i < 30; i++)    {
            if (driver.findElements(By.id(target)).size() > 0) {
                break;
            }
            slp(1);
        }
        return driver.findElement(By.id(target));
    }

    public static WebElement cyclicElementFindingByCss(String target) {
        for (int i = 0; i < 30; i++)    {
            if (driver.findElements(By.cssSelector(target)).size() > 0) {
                break;
            }
            slp(1);
        }
        return driver.findElement(By.cssSelector(target));
    }

    public static WebElement cyclicElementFindingByXpath(String target) {
        for (int i = 0; i < 30; i++)    {
            if (driver.findElements(By.xpath(target)).size() > 0) {
                break;
            }
            slp(1);
        }
        return driver.findElement(By.xpath(target));
    }

    public static void slp (long msec) {
        try {
            Thread.sleep(msec*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void slpmlsec (long sec) {
        try {
            Thread.sleep(sec*100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static boolean cyclicMatchWaiting(String expected) {
        for (int i = 0; i < 30; i++)    {
            if (AngelPage.getValue().equals(expected)) {
                break;
            }
            TestHelper.slp(1);
        }
        return true;
    }

    public static boolean isAlertPresent() {
        try{driver.switchTo().alert();
            return true;
        } catch(NoAlertPresentException ex) {
            return false;
        }
    }

    public static void handleAlert() {
        if(isAlertPresent()) {

        }
        slpmlsec(2);
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
    public void takeScr()
    {
        try {
            File scrFile =
                    ((TakesScreenshot)TestHelper.driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new
                    File("c:\\tmp\\src.png"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static String generateStringValue() {
        DateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmssms");
        Date date = new Date();
        String FinalDate = dateFormat.format(date);
        return FinalDate;
    }
}
