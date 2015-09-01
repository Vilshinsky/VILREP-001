package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

/**
 * Created by Alexander on 30.08.2015.
 */
public class Warmup2 {
    public static void main (String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
        ChromeDriver chdrive = new ChromeDriver();
        chdrive.get("http://mfc-laguna.ru/tournament/");
        WebElement simpleTable = chdrive.findElement(By.xpath("//div[@id='one']/div/table"));
        List<WebElement> rows = simpleTable.findElements(By.tagName("tr"));
        for (WebElement row : rows) {
            List<WebElement> cols = row.findElements(By.tagName("td"));
            for (WebElement col : cols) {
                System.out.print(col.getText() + "\t");
            }
            System.out.println();
        }

    }
}
