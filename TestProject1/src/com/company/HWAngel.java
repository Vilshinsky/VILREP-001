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

public class HWAngel {
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
    public static void slpsec (long sec) {
        try {
            Thread.sleep(sec*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void setMaster (String value, WebDriver driver) {
        driver.findElement(By.cssSelector("[name='master']")).clear();
        driver.findElement(By.cssSelector("[name='master']")).sendKeys(value);
    }
    public static void setSiteName (String value, WebDriver driver) {
        driver.findElement(By.cssSelector("[name='site']")).clear();
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
    public static void enterKey(WebDriver driver) {
        driver.findElement(By.cssSelector("[name='site']")).sendKeys(Keys.ENTER);
    }
    @Test
    public void shouldGiveDifferentOutputAfterInversion() {
        setMaster("mas1ter", driver);
        setSiteName("google.com", driver);
        generate(driver);
        System.out.println(giveValue(driver));
        Assert.assertEquals("/1QFaf1lPgO4S@1a", giveValue(driver));
        Assert.assertEquals(16, giveValueLength(driver));

        setMaster("google.com", driver);
        setSiteName("mas1ter", driver);
        generate(driver);
        System.out.println(giveValue(driver));
        Assert.assertEquals("ziRQzTjM/KBFG@1a", giveValue(driver));
        Assert.assertEquals(16, giveValueLength(driver));
    }
    @Test
    public void shouldGiveDifferentOutputWhenSameInputButDifferentRegister() {
        setMaster("ASDASDASD", driver);
        setSiteName("GOOGLE.COM", driver);
        generate(driver);
        System.out.println(giveValue(driver));
        Assert.assertEquals("zgnkRp9Ivvzo8@1a", giveValue(driver));

        setMaster("asdasdasd", driver);
        setSiteName("google.com", driver);
        generate(driver);
        System.out.println(giveValue(driver));
        Assert.assertEquals("XUjQQ/CBenGJ2@1a", giveValue(driver));

        setMaster("ASDASDASD", driver);
        setSiteName("google.com", driver);
        generate(driver);
        System.out.println(giveValue(driver));
        Assert.assertEquals("4n2vcjq29YAE+@1a", giveValue(driver));

        setMaster("asdasdasd", driver);
        setSiteName("GOOGLE.COM", driver);
        generate(driver);
        System.out.println(giveValue(driver));
        Assert.assertEquals("ciiwxqBGtToBP@1a", giveValue(driver));

        setMaster("ASDASDASD", driver);
        setSiteName("GooGLe.Com", driver);
        generate(driver);
        System.out.println(giveValue(driver));
        Assert.assertEquals("XyopArJoNrixg@1a", giveValue(driver));

        setMaster("asdasdasd", driver);
        setSiteName("gOoglE.cOM", driver);
        generate(driver);
        System.out.println(giveValue(driver));
        Assert.assertEquals("P27eztplagEn+@1a", giveValue(driver));

        setMaster("aSDaSdaSD", driver);
        setSiteName("google.com", driver);
        generate(driver);
        System.out.println(giveValue(driver));
        Assert.assertEquals("jv+5t8QkmICK0@1a", giveValue(driver));

        setMaster("asdASDAsD", driver);
        setSiteName("GOOGLE.COM", driver);
        generate(driver);
        System.out.println(giveValue(driver));
        Assert.assertEquals("5M8hfT+iPPgd9@1a", giveValue(driver));
    }
    @Test
    public void shouldWorkWhenInputNull() {
        setMaster("", driver);
        setSiteName("", driver);
        generate(driver);
        Assert.assertEquals("BaefBs8/Z/cm2@1a", giveValue(driver));

        setMaster("text", driver);
        setSiteName("", driver);
        generate(driver);
        Assert.assertEquals("qALs5fRkY5das@1a", giveValue(driver));

        setMaster("", driver);
        setSiteName("text", driver);
        generate(driver);
        Assert.assertEquals("Rct8qzIFl71fx@1a", giveValue(driver));
    }
    @Test
    public void shouldWorkWhenInputSpaced() {
        setMaster("    ", driver);
        setSiteName("", driver);
        generate(driver);
        Assert.assertEquals("yChD8UVjdMP3X@1a", giveValue(driver));

        setMaster("", driver);
        setSiteName("    ", driver);
        generate(driver);
        Assert.assertEquals("W7ZHoAQxV+oWo@1a", giveValue(driver));

        setMaster("    ", driver);
        setSiteName("text1", driver);
        generate(driver);
        Assert.assertEquals("CqsTf7IUwD7ZW@1a", giveValue(driver));

        setMaster("text1", driver);
        setSiteName("    ", driver);
        generate(driver);
        Assert.assertEquals("vkP/KBX7BcN2e@1a", giveValue(driver));
    }
    @Test
    public void shouldWorkWhenLargeInputUsed() {
        setMaster("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", driver);
        setSiteName("bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb", driver);
        generate(driver);
        Assert.assertEquals("jFljhvDp1Y9yi@1a", giveValue(driver));
    }
    @Test
    public void shouldWorkWhenInvalidSymbols() {
        setMaster("~!@#$%^&*()_+{}|\":?></\\", driver);
        setSiteName("~!@#$%^&*()_+{}|\":?></\\", driver);
        generate(driver);
        Assert.assertEquals("mWxGz2VYwGgZK@1a", giveValue(driver));
    }
}
