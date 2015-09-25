package com.company.Common;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.Dimension;
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
                                                                                                                        //PRECONDITIONS & POSTCONDITIONS
    public static void get(String url) {
        driver.get(url);
    }
    public static void quit() {
        driver.quit();
    }
    public static void setResolution(int width, int height) {
        driver.manage().window().setSize(new Dimension(width, height));
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
                                                                                                                        //Searching and waiting for element in DOM
    public static WebElement waitElementById(String target) {
        for (int i = 0; i < 250; i++)    {
            if (driver.findElements(By.id(target)).size() > 0) {
                break;
            }
            waitMsec(1);
        }
        return driver.findElement(By.id(target));
    }
    public static WebElement waitElementByCss(String target) {
        for (int i = 0; i < 250; i++)    {
            if (driver.findElements(By.cssSelector(target)).size() > 0) {
                break;
            }
            waitMsec(1);
        }
        return driver.findElement(By.cssSelector(target));
    }
    public static WebElement waitElementByXpath(String target) {
        for (int i = 0; i < 250; i++)    {
            if (driver.findElements(By.xpath(target)).size() > 0) {
                break;
            }
            waitMsec(1);
        }
        return driver.findElement(By.xpath(target));
    }
                                                                                                                        //Waiting for moment when element doesn't exist in DOM
    public static WebElement waitElementNotExistById(String target) {
        for (int i = 0; i < 250; i++) {
            if (driver.findElements(By.id(target)).size() == 0) {
                break;
            }
            waitMsec(1);
        }
        return null;
    }
    public static WebElement waitElementNotExistByCss(String target) {
        for (int i = 0; i < 250; i++)    {
            if (driver.findElements(By.cssSelector(target)).size() == 0) {
                break;
            }
            waitMsec(1);
        }
        return null;
    }
    public static WebElement waitElementNotExistByXpath(String target) {
        for (int i = 0; i < 250; i++)    {
            if (driver.findElements(By.xpath(target)).size() == 0) {
                break;
            }
            waitMsec(1);
        }
        return null;
    }
                                                                                                                        //Waiting for element displays on the page
    public static WebElement waitElementDisplayedById(String target) {
        for (int i = 0; i < 250; i++)    {
            if (waitElementById(target).isDisplayed()) {
                break;
            }
            waitMsec(1);
        }
        return waitElementById(target);
    }
    public static WebElement waitElementDisplayedByCss(String target) {
        for (int i = 0; i < 250; i++)    {
            if (waitElementByCss(target).isDisplayed()) {
                break;
            }
            waitMsec(1);
        }
        return waitElementByCss(target);
    }
    public static WebElement waitElementDisplayedByXpath(String target) {
        for (int i = 0; i < 250; i++)    {
            if (waitElementByXpath(target).isDisplayed()) {
                break;
            }
            waitMsec(1);
        }
        return waitElementByXpath(target);
    }
                                                                                                                        //Waiting for element doesn't display on the page
    public static WebElement waitElementNotDisplayedById(String target) {
        for (int i = 0; i < 250; i++)    {
            if (waitElementById(target).isDisplayed()) {
                waitMsec(1);
            }
            break;
        }
        return waitElementById(target);
    }
    public static WebElement waitElementNotDisplayedByCss(String target) {
        for (int i = 0; i < 250; i++)    {
            if (waitElementByCss(target).isDisplayed()) {
                waitMsec(1);
            }
            break;
        }
        return waitElementByCss(target);
    }
    public static WebElement waitElementNotDisplayedByXpath(String target) {
        for (int i = 0; i < 250; i++)    {
            if (waitElementByXpath(target).isDisplayed()) {
                waitMsec(1);
            }
            break;
        }
        return waitElementByXpath(target);
    }
                                                                                                                        //Waiting for element enable on the page
    public static WebElement waitElementEnabledById(String target) {
        for (int i = 0; i < 250; i++)    {
            if (waitElementById(target).isEnabled()) {
                break;
            }
            waitMsec(1);
        }
        return waitElementById(target);
    }
    public static WebElement waitElementEnabledByCss(String target) {
        for (int i = 0; i < 250; i++)    {
            if (waitElementByCss(target).isEnabled()) {
                break;
            }
            waitMsec(1);
        }
        return waitElementByCss(target);
    }
    public static WebElement waitElementEnabledByXpath(String target) {
        for (int i = 0; i < 250; i++)    {
            if (waitElementByXpath(target).isEnabled()) {
                break;
            }
            waitMsec(1);
        }
        return waitElementByXpath(target);
    }
                                                                                                                        //Waiting for element disabled on the page
    public static WebElement waitElementDisabledById(String target) {
        for (int i = 0; i < 250; i++)    {
            if (waitElementById(target).isEnabled()) {
                waitMsec(1);
            }
            break;
        }
        return waitElementById(target);
    }
    public static WebElement waitElementDisabledByCss(String target) {
        for (int i = 0; i < 250; i++)    {
            if (waitElementByCss(target).isEnabled()) {
                waitMsec(1);
            }
            break;
        }
        return waitElementByCss(target);
    }
    public static WebElement waitElementDisabledByXpath(String target) {
        for (int i = 0; i < 250; i++)    {
            if (waitElementByXpath(target).isEnabled()) {
                waitMsec(1);
            }
            break;
        }
        return waitElementByXpath(target);
    }
                                                                                                                        //Waiting for two elements have equal values of some attribute
    public static boolean waitEqualityById(String attribute, String expected, String actual) {
        waitElementById(actual);
        for (int i = 0; i < 250; i++)    {
            if (driver.findElement(By.id(actual)).getAttribute(attribute).equals(expected)) {
                break;
            }
            waitMsec(1);
        }
        return true;
    }
    public static boolean waitEqualityByCss(String attribute, String expected, String actual) {
        waitElementByCss(actual);
        for (int i = 0; i < 250; i++)    {
            if (driver.findElement(By.cssSelector(actual)).getAttribute(attribute).equals(expected)) {
                break;
            }
            waitMsec(1);
        }
        return true;
    }
    public static boolean waitEqualityByXpath(String attribute, String expected, String actual) {
        waitElementByXpath(actual);
        for (int i = 0; i < 250; i++)    {
            if (driver.findElement(By.xpath(actual)).getAttribute(attribute).equals(expected)) {
                break;
            }
            waitMsec(1);
        }
        return true;
    }

    public static boolean waitInequalityById(String attribute, String expected, String actual) {
        waitElementById(actual);
        for (int i = 0; i < 250; i++)    {
            if (driver.findElement(By.id(actual)).getAttribute(attribute).equals(expected)) {
                waitMsec(1);
            }
            break;
        }
        return true;
    }
    public static boolean waitInequalityByCss(String attribute, String expected, String actual) {
        waitElementByCss(actual);
        for (int i = 0; i < 250; i++)    {
            if (driver.findElement(By.cssSelector(actual)).getAttribute(attribute).equals(expected)) {
                waitMsec(1);
            }
            break;
        }
        return true;
    }
    public static boolean waitInequalityByXpath(String attribute, String expected, String actual) {
        waitElementByXpath(actual);
        for (int i = 0; i < 250; i++)    {
            if (driver.findElement(By.xpath(actual)).getAttribute(attribute).equals(expected)) {
                waitMsec(1);
            }
            break;
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
                                                                                                                        //Output files and data generating
    public static void takeScreenshot() {
        try {
            File scrFile =
                    ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
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
    public static String generateActualDateDots() {
        DateFormat dateFormat = new SimpleDateFormat("MM.dd.yyyy");
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
                                                                                                                        //Attaching files
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
