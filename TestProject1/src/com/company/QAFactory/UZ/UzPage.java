package com.company.QAFactory.UZ;

import com.company.Common.TestHelper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

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
    public static String ticketPrice = "//*[@class='price']";
    public static String summaryPriceButton = "//*[@class='complex_btn']/b";
    public static String lastNameInput = "//*[@class='lastname']";
    public static String firstNameInput = "//*[@class='firstname']";
    public static String higherLastNameInput = "//tbody/tr[1]//*[@class='lastname']";
    public static String lowerLastNameInput = "//tbody/tr[2]//*[@class='lastname']";
    public static String higherFirstNameInput = "//tbody/tr[1]//*[@class='firstname']";
    public static String lowerFirstNameInput = "//tbody/tr[2]//*[@class='firstname']";


    public static boolean checkMainStartElementsExist() {
        if(TestHelper.cyclicElementSearchByXpath(stationFromInput).isDisplayed() &&
                TestHelper.cyclicElementSearchByXpath(stationTillInput).isDisplayed() &&
                TestHelper.cyclicElementSearchByXpath(goToDepartureDateSetting).isDisplayed() &&
                TestHelper.cyclicElementSearchByXpath(searchButton).isDisplayed()) {
            return true;
        }
        return false;
    }
    public static String autocompeteValue(String xpath) {
        return TestHelper.cyclicElementSearchByXpath(xpath).getAttribute("title");
    }
    public static boolean checkAutocompleteValuesFrom(String value) {
        TestHelper.cyclicElementSearchByXpath(stationFromInput).sendKeys(value);
        isChosenElementAppeared("//*[@id='stations_from']/div[1]");
        if(autocompeteValue("//*[@id='stations_from']/div[1]").equals("Kyaniv Pereval") &&
                autocompeteValue("//*[@id='stations_from']/div[2]").equals("Kyanivka") &&
                autocompeteValue("//*[@id='stations_from']/div[3]").equals("Kybyntsi") &&
                autocompeteValue("//*[@id='stations_from']/div[4]").equals("Kychyranky") &&
                autocompeteValue("//*[@id='stations_from']/div[5]").equals("Kyiv") &&
                autocompeteValue("//*[@id='stations_from']/div[6]").equals("Kyivska Rusanivka") &&
                autocompeteValue("//*[@id='stations_from']/div[7]").equals("Kyj") &&
                autocompeteValue("//*[@id='stations_from']/div[8]").equals("Kykshor") &&
                autocompeteValue("//*[@id='stations_from']/div[9]").equals("Kyn") &&
                autocompeteValue("//*[@id='stations_from']/div[10]").equals("Kynnu")) {
            return true;
        }
        return false;
    }
    public static boolean checkAutocompleteValuesTo(String value) {
        TestHelper.cyclicElementSearchByXpath(stationTillInput).sendKeys(value);
        isChosenElementAppeared("//*[@id='stations_till']/div[1]");
        if(autocompeteValue("//*[@id='stations_till']/div[1]").equals("Ivano-Frankivsk") &&
                autocompeteValue("//*[@id='stations_till']/div[2]").equals("Ivano-Kopyne") &&
                autocompeteValue("//*[@id='stations_till']/div[3]").equals("Ivanovka") &&
                autocompeteValue("//*[@id='stations_till']/div[4]").equals("Ivanovka") &&
                autocompeteValue("//*[@id='stations_till']/div[5]").equals("Ivanovka") &&
                autocompeteValue("//*[@id='stations_till']/div[6]").equals("Ivanovo") &&
                autocompeteValue("//*[@id='stations_till']/div[7]").equals("Ivanovo S") &&
                autocompeteValue("//*[@id='stations_till']/div[8]").equals("Ivanovskaia") &&
                autocompeteValue("//*[@id='stations_till']/div[9]").equals("Ivanovskii")) {
            return true;
        }
        return false;
    }
    public static boolean isCurrentDate() {
        if(TestHelper.cyclicElementSearchByXpath("//*[@id='date_dep']").getAttribute("value")
                .equals(TestHelper.generateActualDateDots())) {
            return true;
        }
        return false;
    }
    public static void incorrectFillStationFromInput(String frominput) {
        TestHelper.cyclicElementSearchByXpath(stationFromInput).clear();
        TestHelper.cyclicElementSearchByXpath(stationFromInput).sendKeys(frominput);
    }
    public static void fillStationFromInput(String frominput) {
        TestHelper.cyclicElementSearchByXpath(stationFromInput).clear();
        TestHelper.cyclicElementSearchByXpath(stationFromInput).sendKeys(frominput);
        TestHelper.cyclicElementIsDisplayedXpath(stationFromFirstDrop).click();
    }
    public static void incorrectFillStationTillInput(String tillinput) {
        TestHelper.cyclicElementSearchByXpath(stationTillInput).clear();
        TestHelper.cyclicElementSearchByXpath(stationTillInput).sendKeys(tillinput);
    }
    public static void fillStationTillInput(String tillinput) {
        TestHelper.cyclicElementSearchByXpath(stationTillInput).clear();
        TestHelper.cyclicElementSearchByXpath(stationTillInput).sendKeys(tillinput);
        TestHelper.cyclicElementIsDisplayedXpath(stationTillFirstDrop).click();
    }
    public static void setDate(String month, String date) {
        TestHelper.cyclicElementSearchByXpath(goToDepartureDateSetting).click();
        TestHelper.cyclicElementIsDisplayedXpath("//*[text()='" + month + "']/..//td[text()='" + date + "']")
                .click();
    }
    public static void pushSearch() {
        isChosenElementAppeared(searchButton);
        TestHelper.cyclicElementSearchByXpath(searchButton).click();
    }
    public static String checkDateOnSearchButton() {
        return TestHelper.cyclicElementSearchByXpath(searchButtonsValue).getText();
    }
    public static WebElement isChosenElementAppeared(String choose) {
        for(int i = 0; i < 250; i++) {
            if(TestHelper.cyclicElementSearchByXpath(choose).isEnabled() &&
                    TestHelper.cyclicElementSearchByXpath(choose).isDisplayed()) {
                break;
            }
            TestHelper.waitMsec(1);
        }
        return TestHelper.cyclicElementSearchByXpath(choose);
    }
    public static WebElement isChosenElementDisappeared(String choose) {
        for(int i = 0; i < 250; i++) {
            if(TestHelper.cyclicElementSearchByXpath(choose).isEnabled() &&
                    TestHelper.cyclicElementSearchByXpath(choose).isDisplayed()) {
                TestHelper.waitMsec(1);
            }
            break;
        }
        return TestHelper.cyclicElementSearchByXpath(choose);
    }
    public static boolean noTrains() {
        if(isChosenElementAppeared("//*[@id='ts_res_not_found']").getText()
                        .equals("По запрашиваемым Вами значениям ничего не найдено.")) {
        return true;
        }
        return false;
    }
    public static void moveToFooter() {
        TestHelper.cyclicElementSearchByXpath(footer);
        WebElement footerBlock = TestHelper.cyclicElementSearchByXpath
                (footer);
        Actions nextactions = new Actions(TestHelper.driver);
        nextactions.moveToElement(footerBlock);
        nextactions.perform();
    }
    public static boolean isErrorMessageExist() {
        for(int i = 0; i < 250; i++) {
            if(TestHelper.cyclicElementSearchByXpath("//*[@class='vToolsPopupHeader']//span").isEnabled() &&
                    TestHelper.cyclicElementSearchByXpath("//*[@class='vToolsPopupHeader']//span").isDisplayed()) {
                break;
            }
            TestHelper.waitMsec(1);
        }
        return true;
    }
    public static boolean isErrorMessageCorrect() {
        if(isErrorMessageExist()) {
            if(TestHelper.cyclicElementSearchByXpath("//*[@class='vToolsPopupHeader']//span").getText()
                    .equals("Error filling in the form") &&
            TestHelper.cyclicElementSearchByXpath("//*[@class='vToolsPopupContent']//p[1]").getText()
                    .equals("Select a departure point from the drop down list") &&
                    TestHelper.cyclicElementSearchByXpath("//*[@class='vToolsPopupContent']//p[2]").getText()
                            .equals("Select your destination from the drop down list")) {
                return true;
            }
        }
        return false;
    }
    public static void closeErrorMessage() {
        TestHelper.cyclicElementSearchByXpath("//*[@class='vToolsPopupToolbar']/button").click();
        isChosenElementDisappeared("//*[@class='vToolsPopupToolbar']/button");
    }
    public static String checkNumberOfTrain(String number) {
        return TestHelper.cyclicElementSearchByXpath(number).getText();
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
    public static void goTo601Train() {
        TestHelper.cyclicElementSearchByXpath(trainSixZeroOne).click();
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
    public static boolean cyclicValuesMatchWaitingBeforeAssert(String expectedGener, String element) {
        for (int i = 0; i < 5; i++)    {
            if (element.equals(expectedGener)) {
                break;
            }
            TestHelper.waitMsec(1);
        }
        return true;
    }
    public static boolean cyclicSitPlacesStatusMatchWaiting(String expectedGener, String element) {
        for (int i = 0; i < 5; i++)    {
            if (element.equals(expectedGener)) {
                break;
            }
            TestHelper.waitMsec(1);
        }
        return true;
    }
    public static String checkThatPlaceFree(String sit) {
        return TestHelper.cyclicElementSearchByXpath(sit).getAttribute("class");
    }
    public static void goToMyFreePlace(String freeplace) {
        TestHelper.cyclicElementSearchByXpath(freeplace).click();
    }
    public static void fillLastName() {
        TestHelper.cyclicElementSearchByXpath(lastNameInput).sendKeys("Smith");
    }
    public static void fillName() {
        TestHelper.cyclicElementSearchByXpath(firstNameInput).sendKeys("John");
    }
    public static void fillHigherNameInputs() {
        TestHelper.cyclicElementSearchByXpath(higherLastNameInput).sendKeys("Smith");
        TestHelper.cyclicElementSearchByXpath(higherFirstNameInput).sendKeys("John");
    }
    public static void fillLowerNameInputs() {
        TestHelper.cyclicElementSearchByXpath(lowerLastNameInput).sendKeys("Smith");
        TestHelper.cyclicElementSearchByXpath(lowerFirstNameInput).sendKeys("Jane");
    }
    public static String getSummaryPrice() {
    return TestHelper.cyclicElementSearchByXpath(summaryPriceButton).getText();
    }
    public static String getActivityValue(String activityValue) {
        return TestHelper.cyclicElementSearchByXpath(activityValue).getAttribute("class");
    }
    public static void isChosenButtonActive(String choose) {
        for(int i = 0; i < 250; i++) {
            if(TestHelper.cyclicElementSearchByXpath(choose).isEnabled()) {
                break;
            }
            TestHelper.waitMsec(1);
        }
        TestHelper.cyclicElementSearchByXpath(choose).click();
    }
}
