package com.company.QAFactory;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

/**
 * Created by Omnigon on 8/27/2015.
 */
public class Work {
    public static void slp (long sec) {
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void main (String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
        ChromeDriver dvr = new ChromeDriver();
        dvr.get("http://www.socionika.info/tabl.html");
        WebElement table1 = dvr.findElement(By.xpath("//td[text()='Ваш тип']/../../.."));
        List<WebElement> rows1 = table1.findElements(By.tagName("tr"));
        List<WebElement> cells1 = table1.findElements(By.tagName("td"));
        List<WebElement> hrefs1 = table1.findElements(By.tagName("a"));
        Assert.assertEquals(37, rows1.size());
        Assert.assertEquals(313, cells1.size());
        Assert.assertEquals(304, hrefs1.size());
        WebElement gmailLink = dvr.findElement(By.linkText("Gmail"));
        WebElement partGmailLink = dvr.findElement(By.partialLinkText("Про "));
        Assert.assertEquals("https://mail.google.com/mail/?tab=wm", gmailLink.getAttribute("href"));
        System.out.println("Button name is" + partGmailLink.getText());


    }
}
