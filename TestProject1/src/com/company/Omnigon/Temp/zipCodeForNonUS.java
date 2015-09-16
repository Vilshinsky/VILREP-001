package com.company.Omnigon.Temp;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by Omnigon on 9/8/2015.
 */
public class zipCodeForNonUS {
    public WebDriver driver;
    @Before                                     //Действие, которое реализуется перед каждым тестом
    public void preconditionsApply() {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1400, 1000));
        driver.get("http://qa-www.pgatour.ctmsp.com/");
    }
    public static WebElement cyclicElementFinding(String target, WebDriver driver) {
        for (int i = 0; i < 6; i++)    {
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
    public static void fillForm(WebDriver driver) {
        slp(5);
        cyclicElementFinding("//*[@class='wrapper']/*[contains(@class,'login-button')]",driver).click();
        cyclicElementFinding("//*[@id='gigya-login-form']//a[text()='Click here ']",driver).click();
        cyclicElementFinding("//*[@id='gigya-register-screen']//input[@name='email']", driver).sendKeys("testmail@testmail.com");
        cyclicElementFinding("//*[@id='gigya-register-screen']//input[@name='profile.firstName']", driver).sendKeys("Firstname");
        cyclicElementFinding("//*[@id='gigya-register-screen']//input[@name='profile.lastName']", driver).sendKeys("Lastname");
        cyclicElementFinding("//*[@id='gigya-register-screen']//input[@name='password']", driver).sendKeys("password123");
        cyclicElementFinding("//*[@id='gigya-register-screen']//input[@name='passwordRetype']", driver).sendKeys("password123");
        cyclicElementFinding("//*[@id='gigya-register-screen']//input[@name='data.terms']",driver).click();
        WebElement select = driver.findElement(By.xpath("//*[@id='gigya-register-screen']//select[@name='profile.birthYear']"));
        Select sel = new Select(select);
        sel.selectByIndex(2);
        select = driver.findElement(By.xpath("//*[@id='gigya-register-screen']//select[@name='profile.birthMonth']"));
        sel = new Select(select);
        sel.selectByIndex(2);
        select = driver.findElement(By.xpath("//*[@id='gigya-register-screen']//select[@name='profile.birthDay']"));
        sel = new Select(select);
        sel.selectByIndex(2);
        select = driver.findElement(By.xpath("//*[@id='gigya-register-screen']//select[@name='profile.country']"));
        sel = new Select(select);
        sel.selectByIndex(1);
        cyclicElementFinding("//*[@id='gigya-r-form1']//span[@class='gigya-input-button blue right']",driver).click();
        cyclicElementFinding("//*[@id='gigya-r-form1']//span[@class='gigya-error-msg gigya-error-msg-active']", driver);
    }
@Test
    public void testes() {
    fillForm(driver);
    }
}
