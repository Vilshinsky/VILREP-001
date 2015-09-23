package com.company.QAFactory.PageObjects;

import com.company.Common.TestHelper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

/**
 * Created by Admin on 22.09.15.
 */
public class UzPage {
    public static String pageBookingUz = "http://booking.uz.gov.ua/en/";
    public static String stationFromInput = "//*[@name='station_from']";
    public static String stationTillInput = "//*[@name='station_till']";
    public static String stationFromFirstDrop = "//*[@id='stations_from']/div[1]";
    public static String stationTillFirstDrop = "//*[@id='stations_till']/div[1]";
    public static String goToDepartureDateSetting = "//*[@id='date_dep']";
    public static String setOctober20th = "//*[text()='October 2015']/..//td[text()='20']";
    public static String searchButton = "//button[@name='search']";
    public static String searchButtonsValue = "//*[@name='search']/span";
    public static String footer = "//*[@id='footer']";
    public static String trainFirst = "//*[@id='ts_res_tbl']/tbody/tr[1]/td[1]/a";
    public static String trainSecond = "//*[@id='ts_res_tbl']/tbody/tr[2]/td[1]/a";
    public static String trainThird = "//*[@id='ts_res_tbl']/tbody/tr[3]/td[1]/a";
    public static String trainRoutePopup = "//*[@id='train_route']";
    public static String trainRoutePopupCloseButton = "//*[@class='vToolsPopupToolbar']/button";
    public static String selectCoupe2ndCoachButton =
            "//*[@class='vToolsDataTableRow']//*[@title='Coupe / coach with compartments'][1]/button";
    public static String loadingWheel = "//*[@id='loading_img']";
    public static String firstActiveCoach = "//*[@class='coaches']/a[1]";
    public static String sit31 = "//span[text()='31']/..";
    public static String ticketPrice = "//*[@class='price']";
    public static String lastNameInput = "//*[@class='lastname']";
    public static String firstNameInput = "//*[@class='firstname']";


    public static void fillStationFromInput() {
        TestHelper.cyclicElementSearchByXpath(stationFromInput).sendKeys("Kyi");
        TestHelper.cyclicElementIsDisplayedXpath(stationFromFirstDrop).click();
    }
    public static void fillStationTillInput() {
        TestHelper.cyclicElementSearchByXpath(stationTillInput).sendKeys("Ivano-");
        TestHelper.cyclicElementIsDisplayedXpath(stationTillFirstDrop).click();
    }
    public static void setDate() {
        TestHelper.cyclicElementSearchByXpath(goToDepartureDateSetting).click();
        TestHelper.cyclicElementIsDisplayedXpath(setOctober20th)
                .click();
    }
    public static void pushSearch() {
        TestHelper.cyclicElementSearchByXpath(searchButton).click();
    }
    public static String checkDateOnSearchButton() {
        return TestHelper.cyclicElementSearchByXpath(searchButtonsValue).getText();
    }
    public static void moveToFooter() {
        TestHelper.cyclicElementSearchByXpath(footer);
        WebElement footerBlock = TestHelper.cyclicElementSearchByXpath
                (footer);
        Actions nextactions = new Actions(TestHelper.driver);
        nextactions.moveToElement(footerBlock);
        nextactions.perform();
    }
    public static String checkNumberOfFirstTrain() {
        return TestHelper.cyclicElementSearchByXpath(trainFirst).getText();
    }
    public static String checkNumberOfSecondTrain() {
        return TestHelper.cyclicElementSearchByXpath(trainSecond).getText();
    }
    public static String checkNumberOfThirdTrain() {
        return TestHelper.cyclicElementSearchByXpath(trainThird).getText();
    }
    public static void goToSecondTrain() {
        TestHelper.cyclicElementSearchByXpath(trainSecond).click();
    }
    public static boolean checkThatTrainRoutePopupExist() {
        if(TestHelper.cyclicElementSearchByXpath(trainRoutePopup).isDisplayed()) {
            return true;
        } else {
            return false;
        }
    }
    public static void closeTrainRoutePopup() {
        TestHelper.cyclicElementSearchByXpath(trainRoutePopupCloseButton).click();

    }
    public static boolean checkThatFifthCoachClassIsActive() {
        for (int i = 0; i < 250; i++)    {
            if (TestHelper.cyclicElementSearchByXpath(firstActiveCoach)
                    .getAttribute("class").equals("active")) {
                break;
            }
            TestHelper.waitMsec(1);
        }
        return true;
    }
    public static String checkThatFifthCoachDefault() {
        for (int i = 0; i < 250; i++)    {
            if (checkThatCoachesAppear() && checkThatFifthCoachClassIsActive()) {
                break;
            }
            TestHelper.waitMsec(1);
        }
        return TestHelper.cyclicElementSearchByXpath(firstActiveCoach)
                .getAttribute("class");
    }
    public static boolean checkThatCoachesAppear() {
        if(TestHelper.cyclicElementSearchByXpath(firstActiveCoach).isDisplayed() && !TestHelper.cyclicElementSearchByXpath(loadingWheel).isDisplayed()) {
            return true;
        } else {
            return false;
        }
    }
    public static String getPriceValue() {
        return TestHelper.cyclicElementSearchByXpath(ticketPrice).getText();
    }
    public static boolean cyclicTicketPriceMatchWaiting(String expectedGener) {
        for (int i = 0; i < 250; i++)    {
            if (getPriceValue().equals(expectedGener)) {
                break;
            }
            TestHelper.waitMsec(1);
        }
        return true;
    }
    public static String checkThatPlaceFree() {
        return TestHelper.cyclicElementSearchByXpath(sit31).getAttribute("class");
    }
    public static void goToMyFreePlace() {
        TestHelper.cyclicElementSearchByXpath(sit31).click();
    }
    public static void fillLastName() {
        TestHelper.cyclicElementSearchByXpath(lastNameInput).sendKeys("Smith");
    }
    public static void fillName() {
        TestHelper.cyclicElementSearchByXpath(firstNameInput).sendKeys("John");
    }
    public static void isChooseButtonActive() {
        for(int i = 0; i < 250; i++) {
            if(TestHelper.cyclicElementSearchByXpath(selectCoupe2ndCoachButton).isEnabled()) {
                break;
            }
            TestHelper.waitMsec(1);
        }
        TestHelper.cyclicElementSearchByXpath(selectCoupe2ndCoachButton).click();
    }
}
