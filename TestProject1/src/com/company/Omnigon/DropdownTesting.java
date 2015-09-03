package com.company.Omnigon;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownTesting {
    public static void slp (long msec) {
        try {
            Thread.sleep(msec*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
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
//    @Test
//    public void t1() {
//        WebDriver driver = new FirefoxDriver();
//        driver.get("http://qa-www.pgatour.ctmsp.com/");
//        driver.findElement(By.cssSelector(".header-btn")).click();
//        cyclicElementFinding("//*[@class='drillDownMenu l-drillDown']//a[@class='login-button']", driver);
//        driver.findElement(By.xpath("//ul[@class='nav nav-tabs hidden-small']//a[contains(text(),'CHAMPIONS TOUR')]")).click();
//    }
    @Test
    public void t2() {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://qa-www.pgatour.ctmsp.com/leaderboard.html");
        cyclicElementFinding("#lbnAddPlayerSelector", driver);
        WebElement s = driver.findElement(By.cssSelector("#lbnAddPlayerSelector"));
        Select sel = new Select(s);
        sel.selectByIndex(5);
        sel.selectByVisibleText("Barlow, Craig");
    }
}
