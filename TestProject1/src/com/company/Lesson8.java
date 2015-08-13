package com.company;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

/**
 * Created by admin on 13.08.15.
 */
public class Lesson8 {
    public static void slp (long sec) {
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void main (String less8) {
        System.setProperty("webdriver.chrome.driver", "C:\\Share\\chromedriver.exe"); //Showing webdriver folder

        ChromeDriver drvr2 = new ChromeDriver();
        drvr2.get("http://angel.net/~nic/passwd.current.html");                 //Getting page
        System.out.println(drvr2.getTitle());
        WebElement pass = drvr2.findElementByXPath("//*[@type='password']");
        WebElement logn = drvr2.findElementByXPath("//*[@name='site']");
        WebElement genpas = drvr2.findElementByXPath("//*[@name='password']");
        slp(2);
        pass.sendKeys("mypass");
        logn.sendKeys("mysite");
        drvr2.findElementByXPath("//*[@type='submit']").click();                //OR drvr1.findElementByName("btnG").click();

        System.out.println(genpas.getAttribute("value"));




    }
}
