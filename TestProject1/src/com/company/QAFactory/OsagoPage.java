package com.company.QAFactory;

import com.company.Common.TestHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by Admin on 15.09.15.
 */
public class OsagoPage {
    public static String pageUrl = "https://strahovator.com.ua/kupit_strahovku/avtocivilka_avtograzhdanka_osago_oscpv";

    public static void setVehicle(String value) {
        WebElement selel = TestHelper.driver.findElement(By.id("ts_type"));
        Select sel = new Select(selel);
        sel.selectByVisibleText(value);
    }
    public static void setEngineCapacity(String value) {
        WebElement selel = TestHelper.driver.findElement(By.id("ts_details_type"));
        Select sel = new Select(selel);
        sel.selectByVisibleText(value);
    }

    public static boolean checkCompanyExistInList() {
        for (int i = 0; i < 30; i++)    {
            if (TestHelper.driver.findElements(By.cssSelector("[src='https://strahovator.com.ua/images/logo.png']")).size() > 0) {
                break;
            }
            TestHelper.waitSec(1);
        }
        return true;
    }
    public static String checkAmount() {
        return TestHelper.driver.findElement(By.cssSelector(".osago_one.osago_calc_result_45.bg_yellow td:nth-child(2) span")).getText();
    }
}
