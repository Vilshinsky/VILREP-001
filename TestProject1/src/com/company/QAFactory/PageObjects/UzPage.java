package com.company.QAFactory.PageObjects;

import com.company.Common.TestHelper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

/**
 * Created by Admin on 22.09.15.
 */
public class UzPage {
    public static String pageBookingUz = "http://booking.uz.gov.ua/en/";

    public static void fillStationFromInput() {
        TestHelper.cyclicElementSearchByXpath("//*[@name='station_from']").sendKeys("Kyi");
        TestHelper.cyclicElementIsDisplayedXpath("//*[@id='stations_from']/div[1]").click();
    }
    public static void fillStationTillInput() {
        TestHelper.cyclicElementSearchByXpath("//*[@name='station_till']").sendKeys("Ivano-");
        TestHelper.cyclicElementIsDisplayedXpath("//*[@id='stations_till']/div[1]").click();
    }
    public static void setDate() {
        TestHelper.cyclicElementSearchByXpath("//*[@id='date_dep']").click();
        TestHelper.cyclicElementIsDisplayedXpath("//*[text()='October 2015']/..//td[text()='20']")
                .click();
    }
    public static void pushSearch() {
        TestHelper.cyclicElementSearchByXpath("//button[@name='search']").click();
    }
    public static String checkDateOnSearchButton() {
        return TestHelper.cyclicElementSearchByXpath("//*[@name='search']/span").getText();
    }
    public static void moveToFooter() {
        TestHelper.cyclicElementSearchByXpath("//*[@id='footer']");
        WebElement footerBlock = TestHelper.cyclicElementSearchByXpath
                ("//*[@id='footer']");
        Actions nextactions = new Actions(TestHelper.driver);
        nextactions.moveToElement(footerBlock);
        nextactions.perform();
    }
    public static String checkNumberOfFirstTrain() {
        return TestHelper.cyclicElementSearchByXpath
        ("//*[@id='ts_res_tbl']//*[@class='num']/a[text()='115 О']")
                .getText();
    }
    public static String checkNumberOfSecondTrain() {
        return TestHelper.cyclicElementSearchByXpath
                ("//*[@id='ts_res_tbl']//*[@class='num']/a[text()='043 К']")
                .getText();
    }
    public static String checkNumberOfThirdTrain() {
        return TestHelper.cyclicElementSearchByXpath
                ("//*[@id='ts_res_tbl']//*[@class='num']/a[text()='143 К']")
                .getText();
    }
    public static void goToSecondTrain() {
        TestHelper.cyclicElementSearchByXpath
                ("//*[@id='ts_res_tbl']//*[@class='num']/a[text()='043 К']")
                .click();
    }
    public static boolean checkThatTrainRoutePopupExist() {
        if(TestHelper.cyclicElementSearchByXpath("//*[@id='train_route']").isDisplayed()) {
            return true;
        } else {
            return false;
        }
    }
    public static void closeTrainRoutePopup() {
        TestHelper.cyclicElementSearchByXpath("//*[@title='close']").click();
    }
    public static void chooseCoupe() {
        TestHelper.cyclicElementSearchByXpath
                ("//*[@class='vToolsDataTableRow']//*[@title='Coupe / coach with compartments'][1]/button")
                .click();
    }
    public static boolean checkThatCoachesAppear() {
        if(TestHelper.cyclicElementSearchByXpath("//*[@class='coaches']/a[1]").isDisplayed()) {
            return true;
        } else {
            return false;
        }
    }
    public static String checkThatFifthCoachDefault() {
        for (int i = 0; i < 250; i++)    {
            if (checkThatCoachesAppear() == true) {
                break;
            }
            TestHelper.waitMsec(5);
        }
        TestHelper.waitSec(2);
        return TestHelper.cyclicElementSearchByXpath("//*[@class='coaches']/a[1]")
                .getAttribute("class");
    }


    public static String asdasd() {
        return TestHelper.cyclicElementSearchByXpath("//*[@class='coaches']/a[1]")
                .getAttribute("class");
    }
    public static boolean cyclicMatchWaiting(String expectedGener) {
        for (int i = 0; i < 5; i++)    {
            if (asdasd().equals(expectedGener)) {
                break;
            }
            TestHelper.waitMsec(1);
        }
        return true;
    }



    public static String checkThatPlaceFree() {
        return TestHelper.cyclicElementSearchByXpath("//span[text()='31']/..").getAttribute("class");
    }
    public static void goToMyFreePlace() {
        TestHelper.cyclicElementSearchByXpath("//span[text()='31']/..").click();
        TestHelper.waitSec(2);
    }
    public static String checkPrice() {
        return TestHelper.cyclicElementSearchByXpath("//*[@class='price']").getText();
    }
    public static void fillLastName() {
        TestHelper.cyclicElementSearchByXpath("//*[@class='lastname']").sendKeys("Smith");
    }
    public static void fillName() {
        TestHelper.cyclicElementSearchByXpath("//*[@class='firstname']").sendKeys("John");
    }
}
