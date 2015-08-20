package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Omnigon on 8/20/2015.
 */
public class HWTether {
    public static void slp (long msec) {
        try {
            Thread.sleep(msec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static WebElement findElement(String targetXPath, WebDriver wdr) {
        for (int i = 0; i < 600; i++)    {
            if (wdr.findElements(By.xpath(targetXPath)).size() > 0)
            {
                break;
            }
            slp(100);
        }
        return wdr.findElement(By.xpath(targetXPath));
    }
    public static void main (String[] hwt) {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
        ChromeDriver dvr = new ChromeDriver();
        dvr.get("https://stage.tether.to");
        WebElement logn = dvr.findElement(By.xpath("//*[@id='login']"));
        WebElement pass = dvr.findElement(By.xpath("//*[@id='password']"));
        pass.sendKeys("");
        WebElement logerr = dvr.findElement(By.xpath("//div[@ng-messages='loginForm.username.$error']/div[1]"));
        System.out.println(logerr.getAttribute("value"));


    }
}
