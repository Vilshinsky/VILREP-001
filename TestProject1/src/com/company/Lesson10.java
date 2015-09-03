package com.company;

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
    public static WebElement cyclicElementFinding(String target, WebDriver driver) {
        for (int i = 0; i < 600; i++)    {
            if (driver.findElements(By.cssSelector(target)).size() > 0)
            {
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
    public static void setName (String value, WebDriver driver) {
        driver.findElement(By.cssSelector("[name='site']")).sendKeys(value);
    }
    public static void generate(WebDriver driver) {
        driver.findElement(By.cssSelector("[type='submit']")).click();
    }
    public static String giveValue(WebDriver driver) {
        return driver.findElement(By.cssSelector("[name='password']")).getAttribute("value");
    }
    public static void enterName (WebDriver driver) {
        driver.findElement(By.cssSelector("[name='site']")).sendKeys(Keys.ENTER);
    }

    public WebDriver driver;

    @Before                                     //Действие, которое реализуется перед каждым тестом
    public void lyuboeNazvanie() {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://angel.net/~nic/passwd.current.html");
    }
    @After
    public void lyuboeNazvanie1() {
        driver.quit();
    }
    @Test
    public void test1() {
        setMaster("master", driver);
        setName("google.com", driver);
        generate(driver);
        System.out.println(giveValue(driver));
    }
    @Test
    public void test2() {
        setMaster("hello", driver);
        setName("google.com", driver);
        generate(driver);
        System.out.println(giveValue(driver));
    }
    @Test
    public void test3() {
        setMaster("qwe123", driver);
        setName("gmail.com", driver);
        enterName(driver);
        Assert.assertEquals("mKJAakDvwbhi6@1a", giveValue(driver));
    }
    @Test
    public void test4() {
        setMaster("qwe123", driver);
        setName("gmail.com", driver);
        generate(driver);
        Assert.assertEquals("mKJAakDvwbhi6@1a", giveValue(driver));
    }
    @Test
    public void test5() {
        setMaster("qwe123", driver);
        setName("gmail.com", driver);
        generate(driver);
        Assert.assertEquals("mKJAakDvwbhi6@1a", giveValue(driver));
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
