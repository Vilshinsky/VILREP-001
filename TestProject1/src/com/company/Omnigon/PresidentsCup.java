package com.company.Omnigon;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * Created by Omnigon on 9/2/2015.
 */
public class PresidentsCup {
    public static void slp(long sec) {
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
//        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
        WebDriver cssg = new FirefoxDriver();
        cssg.get("http://www.presidentscup.com/");
        cssg.manage().window().setSize(new Dimension(1212, 766));
        slp(10);

        WebElement element = cssg.findElement(By.cssSelector(""));
        Actions actions = new Actions(cssg);
        actions.moveToElement(element);
        actions.perform();
        slp(10);

        WebElement nextelement = cssg.findElement(By.cssSelector(""));
        Actions nextactions = new Actions(cssg);
        nextactions.moveToElement(nextelement);
        nextactions.perform();
        slp(10);

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

//        cssg.quit();
    }
}
