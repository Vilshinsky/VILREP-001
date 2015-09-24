package com.company.QAFactory.UZ;

import com.company.Common.TestHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Admin on 22.09.15.
 */
public class UzPage {
    public static String pageBookingUz = "http://booking.uz.gov.ua/en/";
    public static String pageBookingUzRU = "http://booking.uz.gov.ua/ru/";

    public static String stationFromInput = "//*[@name='station_from']";
    public static String stationTillInput = "//*[@name='station_till']";
    public static String stationFromFirstDrop = "//*[@id='stations_from']/div[1]";
    public static String stationTillFirstDrop = "//*[@id='stations_till']/div[1]";
    public static String goToDepartureDateSetting = "//*[@id='date_dep']";

    public static String searchButton = "//button[@name='search']";
    public static String searchButtonsValue = "//*[@name='search']/span";

    public static String footer = "//*[@id='footer']";

    public static String trainFirst = "//*[@id='ts_res_tbl']/tbody/tr[1]/td[1]/a";
    public static String trainSecond = "//*[@id='ts_res_tbl']/tbody/tr[2]/td[1]/a";
    public static String trainThird = "//*[@id='ts_res_tbl']/tbody/tr[3]/td[1]/a";
    public static String trainEightTwoNine = "//tbody//a[contains(text(),'829 Л')]";
    public static String trainSixZeroOne = "//tbody//a[contains(text(),'601 Л')]";

    public static String chooseButton601 =
            "//tbody//a[contains(text(),'601 Л')]/../../*[@class='place']//*[@title='Berth / third-class sleeper']/button";

    public static String trainRoutePopup = "//*[@id='train_route']";
    public static String trainRoutePopupCloseButton = "//*[@class='vToolsPopupToolbar']/button";
    public static String selectCoupe2ndCoachButton =
            "//*[@class='vToolsDataTableRow']//*[@title='Coupe / coach with compartments'][1]/button";
    public static String loadingWheel = "//*[@id='loading_img']";

    public static String firstActiveCoach = "//*[@class='coaches']/a[1]";
    public static String sit31 = "//span[text()='31']/..";
    public static String sit41 = "//span[text()='41']/..";
    public static String sit42 = "//span[text()='42']/..";
    public static String summaryPriceButton = "//*[@class='complex_btn']/b";
    public static String lastNameInput = "//*[@class='lastname']";
    public static String firstNameInput = "//*[@class='firstname']";
    public static String higherLastNameInput = "//tbody/tr[1]//*[@class='lastname']";
    public static String lowerLastNameInput = "//tbody/tr[2]//*[@class='lastname']";
    public static String higherFirstNameInput = "//tbody/tr[1]//*[@class='firstname']";
    public static String lowerFirstNameInput = "//tbody/tr[2]//*[@class='firstname']";

    public static boolean checkMainStartElementsExist() {
        if(TestHelper.waitElementByXpath(stationFromInput).isDisplayed() &&
                TestHelper.waitElementByXpath(stationTillInput).isDisplayed() &&
                TestHelper.waitElementByXpath(goToDepartureDateSetting).isDisplayed() &&
                TestHelper.waitElementByXpath(searchButton).isDisplayed()) {
            return true;
        }
        return false;
    }
    public static String autocompeteValue(String xpath) {
        return TestHelper.waitElementByXpath(xpath).getAttribute("title");
    }
    public static boolean checkAutocompleteValuesFrom(String value, String[] expected) {
        TestHelper.waitElementByXpath(stationFromInput).sendKeys(value);
        isChosenElementAppeared("//*[@id='stations_from']/div");
        List<WebElement> divs = TestHelper.driver.findElements(By.xpath("//*[@id='stations_from']/div"));
        for(int i=0; i <= 9; i++) {
            if(expected[i].equals(divs.get(i).getAttribute("title"))) {
            } else {
                return false;
                }
        }
        return true;
    }
    public static boolean checkAutocompleteValuesTo(String value, String[] expected) {
        TestHelper.waitElementByXpath(stationTillInput).sendKeys(value);
        isChosenElementAppeared("//*[@id='stations_till']/div");
        List<WebElement> divs = TestHelper.driver.findElements(By.xpath("//*[@id='stations_till']/div"));
        for(int i = 0; i <= 8; i++) {
            if(expected[i].equals(divs.get(i).getAttribute("title"))) {
            } else {
                return false;
            }
        }
        return true;
    }
    public static boolean isCurrentDate() {
        if(TestHelper.waitElementByXpath("//*[@id='date_dep']").getAttribute("value")
                .equals(TestHelper.generateActualDateDots())) {
            return true;
        }
        return false;
    }
    public static void incorrectFillStationFromInput(String frominput) {
        TestHelper.waitElementByXpath(stationFromInput).clear();
        TestHelper.waitElementByXpath(stationFromInput).sendKeys(frominput);
    }
    public static void fillStationFromInput(String frominput) {
        TestHelper.waitElementByXpath(stationFromInput).clear();
        TestHelper.waitElementByXpath(stationFromInput).sendKeys(frominput);
        TestHelper.cyclicElementIsDisplayedXpath(stationFromFirstDrop).click();
    }
    public static void incorrectFillStationTillInput(String tillinput) {
        TestHelper.waitElementByXpath(stationTillInput).clear();
        TestHelper.waitElementByXpath(stationTillInput).sendKeys(tillinput);
    }
    public static void fillStationTillInput(String tillinput) {
        TestHelper.waitElementByXpath(stationTillInput).clear();
        TestHelper.waitElementByXpath(stationTillInput).sendKeys(tillinput);
        TestHelper.cyclicElementIsDisplayedXpath(stationTillFirstDrop).click();
    }
    public static void setDate(String month, String date) {
        TestHelper.waitElementByXpath(goToDepartureDateSetting).click();
        TestHelper.cyclicElementIsDisplayedXpath("//*[text()='" + month + "']/..//td[text()='" + date + "']")
                .click();
    }
    public static void pushSearch() {
        isChosenElementAppeared(searchButton);
        TestHelper.waitElementByXpath(searchButton).click();
    }
    public static String checkDateOnSearchButton() {
        return TestHelper.waitElementByXpath(searchButtonsValue).getText();
    }
    public static WebElement isChosenElementAppeared(String choose) {
        for(int i = 0; i < 250; i++) {
            if(TestHelper.waitElementByXpath(choose).isEnabled() &&
                    TestHelper.waitElementByXpath(choose).isDisplayed()) {
                break;
            }
            TestHelper.waitMsec(1);
        }
        return TestHelper.waitElementByXpath(choose);
    }
    public static WebElement isChosenElementDisappeared(String choose) {
        for(int i = 0; i < 250; i++) {
            if(TestHelper.waitElementByXpath(choose).isEnabled() &&
                    TestHelper.waitElementByXpath(choose).isDisplayed()) {
                TestHelper.waitMsec(1);
            }
            break;
        }
        return TestHelper.waitElementByXpath(choose);
    }
    public static boolean noTrains() {
        if(isChosenElementAppeared("//*[@id='ts_res_not_found']").getText()
                        .equals("По запрашиваемым Вами значениям ничего не найдено.")) {
        return true;
        }
        return false;
    }
    public static void moveToFooter() {
        TestHelper.waitElementByXpath(footer);
        WebElement footerBlock = TestHelper.waitElementByXpath
                (footer);
        Actions nextactions = new Actions(TestHelper.driver);
        nextactions.moveToElement(footerBlock);
        nextactions.perform();
    }
    public static boolean isErrorMessageExist() {
        for(int i = 0; i < 250; i++) {
            if(TestHelper.waitElementByXpath("//*[@class='vToolsPopupHeader']//span").isEnabled() &&
                    TestHelper.waitElementByXpath("//*[@class='vToolsPopupHeader']//span").isDisplayed()) {
                break;
            }
            TestHelper.waitMsec(1);
        }
        return true;
    }
    public static boolean isErrorMessageCorrect() {
        if(isErrorMessageExist()) {
            if(TestHelper.waitElementByXpath("//*[@class='vToolsPopupHeader']//span").getText()
                    .equals("Error filling in the form") &&
            TestHelper.waitElementByXpath("//*[@class='vToolsPopupContent']//p[1]").getText()
                    .equals("Select a departure point from the drop down list") &&
                    TestHelper.waitElementByXpath("//*[@class='vToolsPopupContent']//p[2]").getText()
                            .equals("Select your destination from the drop down list")) {
                return true;
            }
        }
        return false;
    }
    public static void closeErrorMessage() {
        TestHelper.waitElementByXpath("//*[@class='vToolsPopupToolbar']/button").click();
        TestHelper.waitElementNotExistByXpath("//*[@class='vToolsPopupToolbar']/button");
    }
    public static String checkNumberOfTrain(String number) {
        return TestHelper.waitElementByXpath(number).getText();
    }
    public static String checkNumberOfFirstTrain() {
        return TestHelper.waitElementByXpath(trainFirst).getText();
    }
    public static String checkNumberOfSecondTrain() {
        return TestHelper.waitElementByXpath(trainSecond).getText();
    }
    public static String checkNumberOfThirdTrain() {
        return TestHelper.waitElementByXpath(trainThird).getText();
    }
    public static void goToSecondTrain() {
        TestHelper.waitElementByXpath(trainSecond).click();
    }
    public static boolean checkThatTrainRoutePopupExist() {
        if(TestHelper.waitElementByXpath(trainRoutePopup).isDisplayed()) {
            return true;
        } else {
            return false;
        }
    }
    public static void closeTrainRoutePopup() {
        TestHelper.waitElementByXpath(trainRoutePopupCloseButton).click();
    }
    public static boolean checkThatFifthCoachClassIsActive() {
        for (int i = 0; i < 250; i++)    {
            if (TestHelper.waitElementByXpath(firstActiveCoach)
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
        return TestHelper.waitElementByXpath(firstActiveCoach)
                .getAttribute("class");
    }
    public static boolean checkThatCoachesAppear() {
        if(TestHelper.waitElementByXpath(firstActiveCoach).isDisplayed() && !TestHelper.waitElementByXpath(loadingWheel).isDisplayed()) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean cyclicValuesMatchWaitingBeforeAssert(String expectedGener, String element) {
        for (int i = 0; i < 5; i++)    {
            if (element.equals(expectedGener)) {
                break;
            }
            TestHelper.waitMsec(1);
        }
        return true;
    }
    public static void goToMyFreePlace(String freeplace) {
        TestHelper.waitElementByXpath(freeplace).click();
    }
    public static void fillLastName() {
        TestHelper.waitElementByXpath(lastNameInput).sendKeys("Smith");
    }
    public static void fillName() {
        TestHelper.waitElementByXpath(firstNameInput).sendKeys("John");
    }
    public static void fillHigherNameInputs() {
        TestHelper.waitElementByXpath(higherLastNameInput).sendKeys("Smith");
        TestHelper.waitElementByXpath(higherFirstNameInput).sendKeys("John");
    }
    public static void fillLowerNameInputs() {
        TestHelper.waitElementByXpath(lowerLastNameInput).sendKeys("Smith");
        TestHelper.waitElementByXpath(lowerFirstNameInput).sendKeys("Jane");
    }
    public static String getSummaryPrice() {
    return TestHelper.waitElementByXpath(summaryPriceButton).getText();
    }
    public static String getActivityValue(String activityValue) {
        return TestHelper.waitElementByXpath(activityValue).getAttribute("class");
    }
    public static void isChosenButtonActive(String choose) {
        isChosenElementDisappeared("//*[@id='loading_img']");
        for(int i = 0; i < 250; i++) {
            if(TestHelper.waitElementByXpath(choose).isEnabled()) {
                break;
            }
            TestHelper.waitMsec(1);
        }
        TestHelper.waitElementByXpath(choose).click();
    }
    public static List<String> getFromDropdown() {
        List<WebElement> divs = TestHelper.driver.findElements(By.xpath("//*[@id='stations_from']/div"));
        List<String> result = new ArrayList<String>();
        for(WebElement div : divs) {
            result.add(div.getAttribute("title"));
        }
        return result;
    }
}
