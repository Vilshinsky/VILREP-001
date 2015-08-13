package com.company;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by admin on 06.08.15.
 */
public class Lesson7 {
    public static void slp (long sec) {
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void main (String[] less7) {
//        int[] b = {1,10,-20,30};
//        for (int a : b) {
//            System.out.println(a);
//        }
//        for(int i = 0; i < b.length; i++) {
//            System.out.println(b[i]);
//        }
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

        ChromeDriver drvr1 = new ChromeDriver();
        drvr1.get("http://google.com");
        System.out.println(drvr1.getTitle());
        String title = drvr1.getTitle();
        System.out.println(title.length());
        int ntitle = drvr1.getTitle().length();
        System.out.println(ntitle);

        WebElement j = drvr1.findElementByName("q");
        slp(5);
        j.sendKeys("Selenium web driver command list");
        j.sendKeys(Keys.ENTER);



//        System.out.println(drvr1.getPageSource());
    }
}
