package com.company.Other;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by admin on 03.09.15.
 */
public class Lesson10 {
    public WebDriver driver;
    @Before                                     //Действие, которое реализуется перед каждым тестом
    public void preconditionsApply() {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://angel.net/~nic/passwd.current.html");
    }
    @After
    public void postconditionsApply() {
        driver.quit();
    }
    public static WebElement cyclicElementFinding(String target, WebDriver driver) {
        for (int i = 0; i < 600; i++)    {
            if (driver.findElements(By.cssSelector(target)).size() > 0) {
                break;
            }
            slp(100);
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
    public static void setMaster (String value, WebDriver driver) {
        driver.findElement(By.cssSelector("[name='master']")).sendKeys(value);
    }
    public static void setSiteName (String value, WebDriver driver) {
        driver.findElement(By.cssSelector("[name='site']")).sendKeys(value);
    }
    public static void generate(WebDriver driver) {
        driver.findElement(By.cssSelector("[type='submit']")).click();
    }
    public static String giveValue(WebDriver driver) {
        return driver.findElement(By.cssSelector("[name='password']")).getAttribute("value");
    }
    public static int giveValueLength(WebDriver driver) {
        return driver.findElement(By.cssSelector("[name='password']")).getAttribute("value").length();
    }
    public static void enterName (WebDriver driver) {
        driver.findElement(By.cssSelector("[name='site']")).sendKeys(Keys.ENTER);
    }
    @Test
    public void test1() {
        setMaster("master", driver);
        setSiteName("google.com", driver);
        generate(driver);
        System.out.println(giveValue(driver));
        Assert.assertEquals(16, giveValueLength(driver));
    }
    @Test
    public void test2() {
        setMaster("hello", driver);
        setSiteName("google.com", driver);
        generate(driver);
        System.out.println(giveValue(driver));
        Assert.assertEquals(16, giveValueLength(driver));
    }
    @Test
    public void test3() {
        setMaster("qwe123", driver);
        setSiteName("gmail.com", driver);
        enterName(driver);
        Assert.assertEquals("mKJAakDvwbhi6@1a", giveValue(driver));
        Assert.assertEquals(16, giveValueLength(driver));
    }
    @Test
    public void test4() {
        setMaster("qwe123", driver);
        setSiteName("gmail.com", driver);
        generate(driver);
        Assert.assertEquals("mKJAakDvwbhi6@1a", giveValue(driver));
        Assert.assertEquals(16, giveValueLength(driver));
    }
    @Test
    public void test5() {
        setMaster("", driver);
        setSiteName("", driver);
        generate(driver);
        Assert.assertEquals("BaefBs8/Z/cm2@1a", giveValue(driver));
        Assert.assertEquals(16, giveValueLength(driver));
    }
    @Test
    public void test6() {
        setMaster("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", driver);
        setSiteName("bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb", driver);
        generate(driver);
        Assert.assertEquals("BaefBs8/Z/cm2@1a", giveValue(driver));
        Assert.assertEquals(16, giveValueLength(driver));
    }
    @Test
    public void test7() {
        setMaster("", driver);
        setSiteName("", driver);
        generate(driver);
        Assert.assertEquals("BaefBs8/Z/cm2@1a", giveValue(driver));
        Assert.assertEquals(16, giveValueLength(driver));
    }
    @Test
    public void test8() {
        setMaster("", driver);
        setSiteName("", driver);
        generate(driver);
        Assert.assertEquals("BaefBs8/Z/cm2@1a", giveValue(driver));
        Assert.assertEquals(16, giveValueLength(driver));
    }
    @Test
    public void test9() {
        setMaster("", driver);
        setSiteName("", driver);
        generate(driver);
        Assert.assertEquals("BaefBs8/Z/cm2@1a", giveValue(driver));
        Assert.assertEquals(16, giveValueLength(driver));
    }
    @Test
    public void test10() {
        setMaster("", driver);
        setSiteName("", driver);
        generate(driver);
        Assert.assertEquals("BaefBs8/Z/cm2@1a", giveValue(driver));
        Assert.assertEquals(16, giveValueLength(driver));
    }
    @Test
    public void test11() {
        setMaster("", driver);
        setSiteName("", driver);
        generate(driver);
        Assert.assertEquals("BaefBs8/Z/cm2@1a", giveValue(driver));
        Assert.assertEquals(16, giveValueLength(driver));
    }
    @Test
    public void test12() {
        setMaster("", driver);
        setSiteName("", driver);
        generate(driver);
        Assert.assertEquals("BaefBs8/Z/cm2@1a", giveValue(driver));
        Assert.assertEquals(16, giveValueLength(driver));
    }
//    @Test
//    public void t1() {
//        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.get("http://angel.net/~nic/passwd.current.html");
//        WebElement pass = driver.findElement(By.cssSelector("[name='master']"));
//        WebElement name = driver.findElement(By.cssSelector("[name='site']"));
//        pass.sendKeys("asdasd");
//        name.sendKeys("asdasd");
//        WebElement submit = driver.findElement(By.cssSelector("[type='submit']"));
//        submit.click();
//        slp(2);
//        WebElement gener = driver.findElement(By.cssSelector("[name='password']"));
//        System.out.println(gener.getAttribute("value"));
//    }
}
