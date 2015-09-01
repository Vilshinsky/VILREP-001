package com.company;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;

/**
 * Created by admin on 18.08.15.
 */
public class Lesson9 {
    public static void slp (long msec) {
        try {
            Thread.sleep(msec);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void t1() {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
        ChromeDriver drivr = new ChromeDriver();
        drivr.get("https://strahovator.com.ua/kupit_strahovku/avtocivilka_avtograzhdanka_osago_oscpv");
        WebElement s = drivr.findElement(By.id("ts_type"));
        Select sel = new Select(s);
        System.out.println(
                sel.getFirstSelectedOption().getText()
        );
        sel.selectByVisibleText("мотоцикл или мотороллер");
        s = drivr.findElement(By.id("ts_details_type"));
        sel = new Select(s);
        sel.selectByVisibleText("объем двигателя более 300 см³");
        s = drivr.findElement(By.id("ts_zone"));
        sel = new Select(s);
        sel.selectByVisibleText("Луганск");
        s = drivr.findElement(By.id("no_crash_years_qty"));
        sel = new Select(s);
        sel.selectByVisibleText("5 лет");
        s = drivr.findElement(By.id("period"));
        sel = new Select(s);
        sel.selectByVisibleText("9 месяцев");
        s = drivr.findElement(By.id("dgo"));
        sel = new Select(s);
        sel.selectByVisibleText("да, на 100 000 грн");

        //ALTERNATIVE PATH
        new Select(drivr.findElement(By.id("ts_type"))).selectByVisibleText("грузовой автомобиль");
        System.out.println(new Random().nextInt(6));

        slp(10000);
        drivr.quit();
    }
    public static void main (String[] less9) {

    }
}
