package com.company.Common;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Admin on 08.09.15.
 */
public class TestHelper {
                                                                                                                        //SETUP WEBDRIVER
    public static WebDriver driver;

    public static void setupChrome() {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
        driver = new ChromeDriver();
    }
    public static void setupChromeAndGo(String link) {
        setupChrome();
        driver.get(link);
    }
    public static void setupChromeAndGoToCI(String link) {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        driver = new ChromeDriver();
        driver.get(link);
    }

    public static void setupFirefox() {
        driver = new FirefoxDriver();
    }
    public static void setupFirefoxAndGo(String link) {
        setupFirefox();
        driver.get(link);
    }

    public static void setupIE() {
        System.setProperty("webdriver.ie.driver", "C:\\Selenium\\IEDriverServer.exe");
        driver = new InternetExplorerDriver();
    }
    public static void setupIEAndGo(String link) {
        setupIE();
        driver.get(link);
    }

    public static void setupOpera() {
        driver = new OperaDriver();
    }
    public static void setupOperaAndGo(String link) {
        setupOpera();
        driver.get(link);
    }
                                                                                                                        //BASIC COMMANDS
    public static void get(String url) {
        driver.get(url);
    }
    public static void quit() {
        driver.quit();
    }
    public static void setResolution(int width, int height) {
        driver.manage().window().setSize(new org.openqa.selenium.Dimension(width, height));
    }
    public static void setFullscreen() {
        driver.manage().window().maximize();
    }
                                                                                                                        //WAITING FUNCTIONS
    public static void waitSec(long seconds) {
        try {
            Thread.sleep(seconds*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void waitMsec(long msec) {
        try {
            Thread.sleep(msec*100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static WebElement cyclicElementSearchById(String target) {
        for (int i = 0; i < 250; i++)    {
            if (driver.findElements(By.id(target)).size() > 0) {
                break;
            }
            waitMsec(1);
        }
        return driver.findElement(By.id(target));
    }
    public static WebElement cyclicElementSearchByCss(String target) {
        for (int i = 0; i < 250; i++)    {
            if (driver.findElements(By.cssSelector(target)).size() > 0) {
                break;
            }
            waitMsec(1);
        }
        return driver.findElement(By.cssSelector(target));
    }
    public static WebElement cyclicElementSearchByXpath(String target) {
        for (int i = 0; i < 250; i++)    {
            if (driver.findElements(By.xpath(target)).size() > 0) {
                break;
            }
            waitMsec(1);
        }
        return driver.findElement(By.xpath(target));
    }

    public static WebElement cyclicElementIsDisplayedId(String target) {
        for (int i = 0; i < 250; i++)    {
            if (TestHelper.cyclicElementSearchById(target).isDisplayed()) {
                break;
            }
            waitMsec(1);
        }
        return TestHelper.cyclicElementSearchById(target);
    }
    public static WebElement cyclicElementIsDisplayedCss(String target) {
        for (int i = 0; i < 250; i++)    {
            if (TestHelper.cyclicElementSearchByCss(target).isDisplayed()) {
                break;
            }
            waitMsec(1);
        }
        return TestHelper.cyclicElementSearchByCss(target);
    }
    public static WebElement cyclicElementIsDisplayedXpath(String target) {
        for (int i = 0; i < 250; i++)    {
            if (TestHelper.cyclicElementSearchByXpath(target).isDisplayed()) {
                break;
            }
            waitMsec(1);
        }
        return TestHelper.cyclicElementSearchByXpath(target);
    }
                                                                                                                        //EQUALITY TEST FUNCTIONS
    public static boolean checkIsValuesEqual(String expected, String actual) {
        if (expected.equals(actual)) {
            return true;
        } else {
            System.out.println("Expected value: " + expected + "; <||>" + " Actual value: " + actual + ";");
            return false;
        }
    }
    public static boolean cyclicStringEqualityWaitingById(String expected, String actual) {
        for (int i = 0; i < 250; i++)    {
            if (driver.findElement(By.id(actual)).getAttribute("value").equals(expected)) {
                break;
            }
            waitMsec(1);
        }
        return true;
    }
    public static boolean cyclicStringEqualityWaitingByCss(String expected, String actual) {
        for (int i = 0; i < 250; i++)    {
            if (driver.findElement(By.cssSelector(actual)).getAttribute("value").equals(expected)) {
                break;
            }
            waitMsec(1);
        }
        return true;
    }
    public static boolean cyclicStringEqualityWaitingByXpath(String expected, String actual) {
        for (int i = 0; i < 250; i++)    {
            if (driver.findElement(By.xpath(actual)).getAttribute("value").equals(expected)) {
                break;
            }
            waitMsec(1);
        }
        return true;
    }
                                                                                                                        //HANDLERS
    public static boolean checkIsAlertPresent() {
        try{driver.switchTo().alert();
            return true;
        } catch(NoAlertPresentException ex) {
            return false;
        }
    }
    public static void handleAlert() {
        if(checkIsAlertPresent()) {
            waitMsec(8);
            Alert alert = driver.switchTo().alert();
            alert.accept();
        }
    }

    public void takeScreenshot() {
        try {
            File scrFile =
                    ((TakesScreenshot)TestHelper.driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new
                    File("C:\\Selenium\\Screenshots\\" + generateActualDate() + "\\" + generateStringValue() + ".png"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static String generateActualDate() {
        DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
        Date date = new Date();
        String FinalDate = dateFormat.format(date);
        return FinalDate;
    }
    public static String generateStringValue() {
        DateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
        Date date = new Date();
        String FinalDate = dateFormat.format(date);
        return FinalDate;
    }

    public static void setClipboardData(String string) {
        StringSelection stringSelection = new StringSelection(string);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
    }
    public void attachFile(String path) {
        setClipboardData(path);
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }
}
