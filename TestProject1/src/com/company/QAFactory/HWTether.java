package com.company.QAFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWTether {
    public static void slp (long sec) {
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void main (String[] hwt) {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
        ChromeDriver dvr = new ChromeDriver();
        dvr.get("https://stage.tether.to");
        WebElement logn = dvr.findElement(By.xpath("//*[@id='login']"));
        WebElement passw = dvr.findElement(By.xpath("//*[@id='password']"));
        logn.sendKeys("");
        passw.sendKeys("");
        WebElement logerr = dvr.findElement(By.xpath("//div[@ng-messages='loginForm.username.$error']/div[1]"));
        System.out.println("Login message: " + logerr.getText());
        passw.sendKeys(Keys.TAB);
        WebElement passer = dvr.findElement(By.xpath("//div[@ng-messages='loginForm.password.$error']/div[1]"));
        System.out.println("Password message: " + passer.getText());
        passw.sendKeys("asd");
        slp(2);
        passer = dvr.findElement(By.xpath("//div[@ng-messages='loginForm.password.$error']/div[1]"));
        System.out.println("Password message: " + passer.getText());
        passw.sendKeys("fff");
        System.out.println(dvr.findElements(By.xpath("//div[@ng-messages='loginForm.password.$error']/div[1]")).size());
        logn.sendKeys("a");
        System.out.println("Login message: " + logerr.getText());
        logn.sendKeys("qwe");
        System.out.println(dvr.findElements(By.xpath("//div[@ng-messages='loginForm.username.$error']/div[1]")).size());
        WebElement submit = dvr.findElement(By.xpath("//button[@class='submit-btn md-raised md-primary md-button md-default-theme']/span[1]"));
        submit.click();

    }
}
