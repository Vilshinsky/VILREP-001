package com.company.Omnigon.Page;

import com.company.Common.TestHelper;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.io.File;

public class Gigya {
    public static String pagePGATQA = "http://qa-www.pgatour.ctmsp.com/";
    public static String pageWEBCOMQA = "http://qa-www.pgatour.ctmsp.com/webcom.html";
    public static String pageCHAMPQA = "http://qa-www.pgatour.ctmsp.com/champions.html";
    public static String pageWGCQA = "http://qa-wgc.pgatour.ctmsp.com/";
    public static String pagePCUPQA = "http://qa-pcup.pgatour.ctmsp.com/";
    public static String newLogin = TestHelper.generateStringValue() + "@testmail.com";
    public static String pagePGATUAT = "http://uat-www.pgatour.ctmsp.com/";
    public static String pageWEBCOMUAT = "http://uat-www.pgatour.ctmsp.com/webcom.html";
    public static String pageCHAMPUAT = "http://uat-www.pgatour.ctmsp.com/champions.html";
    public static String pageWGCUAT = "http://uat-wgc.pgatour.ctmsp.com/";
    public static String pagePCUPUAT = "http://uat-pcup.pgatour.ctmsp.com/";

    public static void setupChromeAndGoPGAT() {
        TestHelper.setupChrome();
        TestHelper.driver.get(pagePGATUAT);
    }
    public static void setupChromeAndGoWEBCOM() {
        TestHelper.setupChrome();
        TestHelper.driver.get(pageWEBCOMUAT);
    }
    public static void setupChromeAndGoCHAMP() {
        TestHelper.setupChrome();
        TestHelper.driver.get(pageCHAMPUAT);
    }
    public static void setupChromeAndGoWGC() {
        TestHelper.setupChrome();
        TestHelper.driver.get(pageWGCUAT);
    }
    public static void setupChromeAndGoPCUP() {
        TestHelper.setupChrome();
        TestHelper.driver.get(pagePCUPUAT);
    }
    public static void setupFirefoxAndGoPGAT() {
        TestHelper.setupFirefox();
        TestHelper.driver.get(pagePGATUAT);
    }
    public static void setupFirefoxAndGoWEBCOM() {
        TestHelper.setupFirefox();
        TestHelper.driver.get(pageWEBCOMUAT);
    }
    public static void setupFirefoxAndGoCHAMP() {
        TestHelper.setupFirefox();
        TestHelper.driver.get(pageCHAMPUAT);
    }
    public static void setupFirefoxAndGoWGC() {
        TestHelper.setupFirefox();
        TestHelper.driver.get(pageWGCUAT);
    }
    public static void setupFirefoxAndGoPCUP() {
        TestHelper.setupFirefox();
        TestHelper.driver.get(pagePCUPUAT);
    }
    public static void setupIEAndGoPGAT() {
        TestHelper.setupIE();
        TestHelper.driver.get(pagePGATUAT);
    }
    public static void setupIEAndGoWEBCOM() {
        TestHelper.setupIE();
        TestHelper.driver.get(pageWEBCOMUAT);
    }
    public static void setupIEAndGoCHAMP() {
        TestHelper.setupIE();
        TestHelper.driver.get(pageCHAMPUAT);
    }
    public static void setupIEAndGoWGC() {
        TestHelper.setupIE();
        TestHelper.driver.get(pageWGCUAT);
    }
    public static void setupIEAndGoPCUP() {
        TestHelper.setupIE();
        TestHelper.driver.get(pagePCUPUAT);
    }

    //NEW ACCOUNT
    public static void generateNewLogin() {
        TestHelper.generateStringValue();
        newLogin = TestHelper.generateStringValue() + "@testmail.com";
    }
    public static void newAccount() {
        generateNewLogin();
        goToRegistrationStep3();
        TestHelper.waitSec(3);
        TestHelper.cyclicElementSearchByXpath("//*[@id='submitFavoritePlayer']").click();
        TestHelper.cyclicElementSearchByXpath("//*[contains(@class,'user-menu')]");
        TestHelper.waitSec(3);
    }
    public static void submitRegistration() {
        TestHelper.cyclicElementSearchByXpath("//*[@id='submitFavoritePlayer']").click();
    }
    public static void goToAuthorization() {
        TestHelper.waitSec(5);
        TestHelper.cyclicElementSearchByCss(".login-button.log-in").click();
    }

    public static void goToRegistrationStep1() {
        goToAuthorization();
        TestHelper.cyclicElementSearchByXpath("//*[@id='gigya-login-screen']//a[text()='Click here ']")
                .click();
    }
    public static void fillRegistrationForm() {
        TestHelper.cyclicElementSearchByXpath("//*[@id='gigya-register-screen']//input[@name='email']")
                .sendKeys(newLogin);
        TestHelper.cyclicElementSearchByXpath("//*[@id='gigya-register-screen']//input[@name='profile.firstName']")
                .sendKeys("Firstname");
        TestHelper.cyclicElementSearchByXpath("//*[@id='gigya-register-screen']//input[@name='profile.lastName']")
                .sendKeys("Lastname");
        TestHelper.cyclicElementSearchByXpath("//*[@id='gigya-register-screen']//input[@name='password']")
                .sendKeys("123123123");
        TestHelper.cyclicElementSearchByXpath("//*[@id='gigya-register-screen']//input[@name='passwordRetype']")
                .sendKeys("123123123");
        TestHelper.cyclicElementSearchByXpath("//*[@id='gigya-register-screen']//input[@name='data.terms']")
                .click();
        WebElement select = TestHelper.driver.findElement(By.xpath("//*[@id='gigya-register-screen']//select[@name='profile.birthYear']"));
        Select sel = new Select(select);
        sel.selectByIndex(2);
        select = TestHelper.driver.findElement(By.xpath("//*[@id='gigya-register-screen']//select[@name='profile.birthMonth']"));
        sel = new Select(select);
        sel.selectByIndex(2);
        select = TestHelper.driver.findElement(By.xpath("//*[@id='gigya-register-screen']//select[@name='profile.birthDay']"));
        sel = new Select(select);
        sel.selectByIndex(2);
        select = TestHelper.driver.findElement(By.xpath("//*[@id='gigya-register-screen']//select[@name='profile.country']"));
        sel = new Select(select);
        sel.selectByIndex(2);
        takeScreenshot();
    }
    public static void goToRegistrationStep2() {
        goToRegistrationStep1();
        fillRegistrationForm();
        TestHelper.cyclicElementSearchByXpath("//*[@id='gigya-r-form1']//span[@class='gigya-input-button blue right']")
                .click();
    }
    public static void goToRegistrationStep3() {
        goToRegistrationStep2();
        TestHelper.cyclicElementSearchByXpath("//*[@id='gigya-r-form2']//span[@class='gigya-input-button blue right']")
                .click();
    }
    public static void addStuartAppleby() {
        WebElement select = TestHelper.driver.findElement
                (By.xpath("//*[@id='gigya-r-form3']//*[@name='data.players']"));
        Select sel = new Select(select);
        sel.selectByVisibleText("Appleby, Stuart");
        TestHelper.cyclicElementSearchByXpath("//*[@id='addPlayerButton']").click();
    }
    public static void addDaveBarr() {
        WebElement select = TestHelper.driver.findElement
                (By.xpath("//*[@id='gigya-r-form3']//*[@name='data.players']"));
        Select sel = new Select(select);
        sel.selectByVisibleText("Barr, Dave");
        TestHelper.cyclicElementSearchByXpath("//*[@id='addPlayerButton']").click();
    }
    public static void addTimNorris() {
        WebElement select = TestHelper.driver.findElement
                (By.xpath("//*[@id='gigya-r-form3']//*[@name='data.players']"));
        Select sel = new Select(select);
        sel.selectByVisibleText("Norris, Tim");
        TestHelper.cyclicElementSearchByXpath("//*[@id='addPlayerButton']").click();
    }
    public static void addThreePlayers() {
        addStuartAppleby();
        addDaveBarr();
        addTimNorris();
    }
    public static String checkFirstInList() {
        return TestHelper.cyclicElementSearchByXpath("//*[@id='myFavoritePlayersList']/following::div[1]")
                .getText();
    }
    public static String checkSecondInList() {
        return TestHelper.cyclicElementSearchByXpath("//*[@id='myFavoritePlayersList']/following::div[3]")
                .getText();
    }
    public static String checkThirdInList() {
        return TestHelper.cyclicElementSearchByXpath("//*[@id='myFavoritePlayersList']/following::div[5]")
                .getText();
    }
    //NEW ACCOUNT
    //SCREENSHOTS
    public static void takeScreenshot()
    {
        try {
            File scrFile =
                    ((TakesScreenshot)TestHelper.driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new
                    File("C:\\Selenium\\Screenshots\\" + TestHelper.generateActualDate() + "\\" + newLogin + ".png"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //SCREENSHOTS
    //SURFING THROUGH REGISTRATION FORM
    public static void moveToRegistrationStep2() {
        fillRegistrationForm();
        TestHelper.cyclicElementSearchByXpath("//*[@id='gigya-r-form1']//span[@class='gigya-input-button blue right']")
                .click();
    }

    public static void moveToRegistrationStep3() {
        TestHelper.cyclicElementSearchByXpath("//*[@id='gigya-r-form2']//span[@class='gigya-input-button blue right']")
                .click();
    }
    public static boolean checkThatRegistrationStep2Blocked() {
        if(TestHelper.cyclicElementSearchByXpath
                ("//*[@id='gigya-r-form2']//span[@class='gigya-input-button blue right']")
                .isDisplayed()) {
            return false;
        } else {
            return true;
        }
    }
    //SURFING THROUGH REGISTRATION FORM
    //SURFING THROUGH MANAGE PROFILE
    public static void cursorOverAvatar() {
        TestHelper.waitSec(2);
        Actions actions = new Actions(TestHelper.driver);
        actions.moveToElement(TestHelper.cyclicElementSearchByXpath("//div[contains(@class,'user-menu')]"))
                .build().perform();
    }
    public static void passAuthorization() {
        goToAuthorization();
        TestHelper.cyclicElementSearchByXpath("//*[@id='gigya-login-form']//input[@name='username']")
                .sendKeys(newLogin);
        TestHelper.cyclicElementSearchByXpath("//*[@id='gigya-login-form']//input[@name='password']")
                .sendKeys("123123123");
        TestHelper.cyclicElementSearchByXpath("//*[@id='gigya-login-form']//input[@class='gigya-input-submit']")
                .click();
    }
    public static void logOutFromDropdown() {
        TestHelper.waitSec(1);
        cursorOverAvatar();
        cyclicWaitingDropdownOpens();
        TestHelper.waitSec(1);
        TestHelper.cyclicElementSearchByXpath("//a[@data-action='logout']").click();
    }
    public static void logOutFromProfile() {
        TestHelper.cyclicElementSearchByXpath("//*[@id='gigya-profile-form3']/div[1]/a[5]").click();
    }
    public static boolean cyclicWaitingDropdownOpens() {
        for (int i = 0; i < 250; i++)    {
            if (TestHelper.cyclicElementSearchByXpath("//a[text()='Manage profile']").isDisplayed()) {
                break;
            }
            TestHelper.waitMsec(1);
        }
        return true;
    }
    public static void tryUsedEmail() {
        goToRegistrationStep1();
        fillRegistrationForm();
    }
    //SURFING THROUGH MANAGE PROFILE
    //USED VALUES
    public static String regForm1Title1() {
        return TestHelper.cyclicElementSearchByXpath("//*[@id='gigya-r-form1']/div/label[1]")
                .getText();
    }
    public static String regForm1Title2() {
        return TestHelper.cyclicElementSearchByXpath("//*[@id='gigya-r-form1']/div/label[2]")
                .getText();
    }
    public static String regForm1Title3() {
        return TestHelper.cyclicElementSearchByXpath("//*[@id='gigya-r-form1']/div/label[3]")
                .getText();
    }
    public static String regForm2Title1() {
        return TestHelper.cyclicElementSearchByXpath("//*[@id='gigya-r-form2']/div/label[1]")
                .getText();
    }
    public static String regForm2Title2() {
        return TestHelper.cyclicElementSearchByXpath("//*[@id='gigya-r-form2']/div/label[2]")
                .getText();
    }
    public static String regForm2Title3() {
        return TestHelper.cyclicElementSearchByXpath("//*[@id='gigya-r-form2']/div/label[3]")
                .getText();
    }
    public static String regForm3Title1() {
        return TestHelper.cyclicElementSearchByXpath("//*[@id='gigya-r-form3']/div/label[1]")
                .getText();
    }
    public static String regForm3Title2() {
        return TestHelper.cyclicElementSearchByXpath("//*[@id='gigya-r-form3']/div/label[2]")
                .getText();
    }
    public static String regForm3Title3() {
        return TestHelper.cyclicElementSearchByXpath("//*[@id='gigya-r-form3']/div/label[3]")
                .getText();
    }
    public static String regForm3Title4() {
        return TestHelper.cyclicElementSearchByXpath("//*[@id='gigya-r-form3']/div/div[1]/*[contains(@class,'gigya-composite-control')][1]")
                .getText();
    }
    public static String regForm3Title5() {
        return TestHelper.cyclicElementSearchByXpath("//*[@id='gigya-r-form3']/div/div[1]/*[contains(@class,'gigya-composite-control-dropdown')]//span")
                .getText();
    }
    public static String regForm3Title6() {
        return TestHelper.cyclicElementSearchByXpath("//*[@id='myFavoritePlayersList']")
                .getText();
    }

    public static String regForm3Title7() {
        return TestHelper.cyclicElementSearchByXpath("//*[@id='gigya-r-form3']/div[2]/div[2]/div[1]")
                .getText();
    }
    public static String regForm3Title8() {
        return TestHelper.cyclicElementSearchByXpath("//*[@id='gigya-r-form3']//div[contains(@class,'gigya-composite-control-textbox')]//span")
                .getText();
    }
    public static String regForm3Title9() {
        return TestHelper.cyclicElementSearchByXpath("//*[@id='gigya-r-form3']//div[@class='gigya-layout-cell']/div[3]//span")
                .getText();
    }
    public static String profileFavoriteTitle1() {
        return TestHelper.cyclicElementSearchByXpath("//*[@id='gigya-profile-form3']//a[1]")
                .getText();
    }
    public static String profileFavoriteTitle2() {
        return TestHelper.cyclicElementSearchByXpath("//*[@id='gigya-profile-form3']//a[2]")
                .getText();
    }
    public static String profileFavoriteTitle3() {
        return TestHelper.cyclicElementSearchByXpath("//*[@id='gigya-profile-form3']//a[3]")
                .getText();
    }
    public static String profileFavoriteTitle4() {
        return TestHelper.cyclicElementSearchByXpath("//*[@id='gigya-profile-form3']//a[4]")
                .getText();
    }
    public static String profileFavoriteTitle5() {
        return TestHelper.cyclicElementSearchByXpath("//*[@id='gigya-profile-form3']//a[5]")
                .getText();
    }
    public static String profileFavoriteTitle6() {
        return TestHelper.cyclicElementSearchByXpath("//*[@id='gigya-profile-form3']/div/div[1]/*[contains(@class,'gigya-composite-control')][1]")
                .getText();
    }
    public static String profileFavoriteTitle7() {
        return TestHelper.cyclicElementSearchByXpath("//*[@id='gigya-profile-form3']/div/div[1]/*[contains(@class,'gigya-composite-control-dropdown')]//span")
                .getText();
    }
    public static String profileFavoriteTitle8() {
        return TestHelper.cyclicElementSearchByXpath("//*[@id='myFavoritePlayersList']")
                .getText();
    }
    public static String profileFavoriteTitle9() {
        return TestHelper.cyclicElementSearchByXpath("//*[@id='gigya-profile-form3']/div[2]/div[2]/div[1]")
                .getText();
    }
    public static String profileFavoriteTitle10() {
        return TestHelper.cyclicElementSearchByXpath("//*[@id='gigya-profile-form3']//div[contains(@class,'gigya-composite-control-textbox')]//span")
                .getText();
    }
    public static String profileFavoriteTitle11() {
        return TestHelper.cyclicElementSearchByXpath("//*[@id='gigya-profile-form3']//div[@class='gigya-layout-cell']/div[3]//span")
                .getText();
    }

    //GETTING VALUES
    public static String checkLoginTitle() {
        return TestHelper.cyclicElementSearchByXpath("//div[text()='Login']")
                .getText();
    }
    public static String checkLoginSubTitle1() {
        return TestHelper.cyclicElementSearchByXpath("//*[@id='gigya-login-screen']//*[text()='Login with your social network:']")
                .getText();
    }
    public static String checkLoginSubTitle2() {
        return TestHelper.cyclicElementSearchByXpath("//*[@id='gigya-login-screen']//*[text()='Or, login here:']")
                .getText();
    }
    public static String checkEmailTitle() {
        return TestHelper.cyclicElementSearchByXpath("//*[@id='gigya-login-screen']//*[text()='Email:']")
                .getText();
    }
    public static String checkRegistrationTitle() {
        return TestHelper.cyclicElementSearchByXpath("//div[@class='gigya-screen-dialog-top']//div[text()='Registration']")
                .getText();
    }
    public static String checkEmailAlreadyUsedError() {
        return TestHelper.cyclicElementSearchByXpath("//span[text()='Email already exists']")
                .getText();
    }
    public static String checkEmailNotAvailableError() {
        return TestHelper.cyclicElementSearchByXpath("//div[text()='Not available']")
                .getText();
    }
}
