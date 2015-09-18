package com.company.Omnigon.Page;

import com.company.PageObjects.TestHelper;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.io.File;

/**
 * Created by Omnigon on 9/16/2015.
 */
public class PGATGigya {
    public static String pagePGATQA = "http://qa-www.pgatour.ctmsp.com/";
    public static String pageWEBCOMQA = "http://qa-www.pgatour.ctmsp.com/webcom.html";
    public static String pageCHAMPQA = "http://qa-www.pgatour.ctmsp.com/champions.html";
    public static String pagePCUPQA = "http://qa-pcup.pgatour.ctmsp.com/";
    public static String pageWGCQA = "http://qa-wgc.pgatour.ctmsp.com/";
    public static String newLogin = TestHelper.generateStringValue() + "@testmail.com";

    //ACTIONS
    public static void takeScreenshot()
    {
        try {
            File scrFile =
                    ((TakesScreenshot)TestHelper.driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new
                    File("C:\\Selenium\\Screenshots\\" + newLogin + ".png"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void goToAuthorization() {
        TestHelper.slp(2);
        TestHelper.cyclicElementFindingByCss(".login-button.log-in").click();
    }

    public static void goToRegistrationStep1() {
        goToAuthorization();
        TestHelper.cyclicElementFindingByXpath("//*[@id='gigya-login-screen']//a[text()='Click here ']").click();
    }
    public static void fillRegistrationForm() {
        TestHelper.cyclicElementFindingByXpath("//*[@id='gigya-register-screen']//input[@name='email']")
                .sendKeys(newLogin);
        TestHelper.cyclicElementFindingByXpath("//*[@id='gigya-register-screen']//input[@name='profile.firstName']").sendKeys("Firstname");
        TestHelper.cyclicElementFindingByXpath("//*[@id='gigya-register-screen']//input[@name='profile.lastName']").sendKeys("Lastname");
        TestHelper.cyclicElementFindingByXpath("//*[@id='gigya-register-screen']//input[@name='password']").sendKeys("123123123");
        TestHelper.cyclicElementFindingByXpath("//*[@id='gigya-register-screen']//input[@name='passwordRetype']").sendKeys("123123123");
        TestHelper.cyclicElementFindingByXpath("//*[@id='gigya-register-screen']//input[@name='data.terms']").click();
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
        TestHelper.cyclicElementFindingByXpath("//*[@id='gigya-r-form1']//span[@class='gigya-input-button blue right']").click();
    }
    public static void goToRegistrationStep3() {
        goToRegistrationStep2();
        TestHelper.cyclicElementFindingByXpath("//*[@id='gigya-r-form2']//span[@class='gigya-input-button blue right']").click();
    }
    public static void newAccount() {
        goToRegistrationStep3();
        TestHelper.cyclicElementFindingByXpath("//*[@id='submitFavoritePlayer']").click();
        TestHelper.cyclicElementFindingByXpath("//*[@class='user-menu visible-large']");
    }
    public static void cursorOverAvatar() {
        TestHelper.slp(2);
        Actions actions = new Actions(TestHelper.driver);
        actions.moveToElement(TestHelper.cyclicElementFindingByXpath("//*[@class='user-menu visible-large']")).build().perform();
    }
    public static void passAuthorization() {
        goToAuthorization();
        TestHelper.cyclicElementFindingByXpath("//*[@id='gigya-login-form']//input[@name='username']").sendKeys(newLogin);
        TestHelper.cyclicElementFindingByXpath("//*[@id='gigya-login-form']//input[@name='password']").sendKeys("123123123");
        TestHelper.cyclicElementFindingByXpath("//*[@id='gigya-login-form']//input[@class='gigya-input-submit']").click();
    }
    public static void goToFavorites() {
        TestHelper.slp(2);
        cursorOverAvatar();
        TestHelper.slp(2);
        cyclicWaitingDropdownOpens();
        TestHelper.cyclicElementFindingByXpath("//a[text()='Manage profile']").click();
        TestHelper.cyclicElementFindingByXpath("//*[@id='gigya-profile-form']/div[1]/a[3]").click();
    }
    public static void logOutFromDropdown() {
        cursorOverAvatar();
        TestHelper.slp(1);
        TestHelper.cyclicElementFindingByXpath("//a[@data-action='logout']").click();
    }
    public static void logOutFromProfile() {
        TestHelper.cyclicElementFindingByXpath("//*[@id='gigya-profile-form3']/div[1]/a[5]").click();
    }
    public static boolean cyclicWaitingDropdownOpens() {
        for (int i = 0; i < 30; i++)    {
            if (TestHelper.cyclicElementFindingByXpath("//a[text()='Manage profile']").isDisplayed()) {
                break;
            }
            TestHelper.slp(1);
        }
        return true;
    }
    //USED VALUES
    public static String regForm1Title1() {
        return TestHelper.cyclicElementFindingByXpath("//*[@id='gigya-r-form1']/div/label[1]").getText();
    }
    public static String regForm1Title2() {
        return TestHelper.cyclicElementFindingByXpath("//*[@id='gigya-r-form1']/div/label[2]").getText();
    }
    public static String regForm1Title3() {
        return TestHelper.cyclicElementFindingByXpath("//*[@id='gigya-r-form1']/div/label[3]").getText();
    }
    public static String regForm2Title1() {
        return TestHelper.cyclicElementFindingByXpath("//*[@id='gigya-r-form2']/div/label[1]").getText();
    }
    public static String regForm2Title2() {
        return TestHelper.cyclicElementFindingByXpath("//*[@id='gigya-r-form2']/div/label[2]").getText();
    }
    public static String regForm2Title3() {
        return TestHelper.cyclicElementFindingByXpath("//*[@id='gigya-r-form2']/div/label[3]").getText();
    }
    public static String regForm3Title1() {
        return TestHelper.cyclicElementFindingByXpath("//*[@id='gigya-r-form3']/div/label[1]").getText();
    }
    public static String regForm3Title2() {
        return TestHelper.cyclicElementFindingByXpath("//*[@id='gigya-r-form3']/div/label[2]").getText();
    }
    public static String regForm3Title3() {
        return TestHelper.cyclicElementFindingByXpath("//*[@id='gigya-r-form3']/div/label[3]").getText();
    }
    public static String regForm3Title4() {
        return TestHelper.cyclicElementFindingByXpath("//*[@id='gigya-r-form3']/div/div[1]/*[contains(@class,'gigya-composite-control')][1]")
                .getText();
    }
    public static String regForm3Title5() {
        return TestHelper.cyclicElementFindingByXpath("//*[@id='gigya-r-form3']/div/div[1]/*[contains(@class,'gigya-composite-control-dropdown')]//span")
                .getText();
    }
    public static String regForm3Title6() {
        return TestHelper.cyclicElementFindingByXpath("//*[@id='myFavoritePlayersList']").getText();
    }

    public static String regForm3Title7() {
        return TestHelper.cyclicElementFindingByXpath("//*[@id='gigya-r-form3']/div[2]/div[2]/div[1]")
                .getText();
    }
    public static String regForm3Title8() {
        return TestHelper.cyclicElementFindingByXpath("//*[@id='gigya-r-form3']//div[contains(@class,'gigya-composite-control-textbox')]//span")
                .getText();
    }
    public static String regForm3Title9() {
        return TestHelper.cyclicElementFindingByXpath("//*[@id='gigya-r-form3']//div[@class='gigya-layout-cell']/div[3]//span").getText();
    }
    public static String profileFavoriteTitle1() {
        return TestHelper.cyclicElementFindingByXpath("//*[@id='gigya-profile-form3']//a[1]").getText();
    }
    public static String profileFavoriteTitle2() {
        return TestHelper.cyclicElementFindingByXpath("//*[@id='gigya-profile-form3']//a[2]").getText();
    }
    public static String profileFavoriteTitle3() {
        return TestHelper.cyclicElementFindingByXpath("//*[@id='gigya-profile-form3']//a[3]").getText();
    }
    public static String profileFavoriteTitle4() {
        return TestHelper.cyclicElementFindingByXpath("//*[@id='gigya-profile-form3']//a[4]").getText();
    }
    public static String profileFavoriteTitle5() {
        return TestHelper.cyclicElementFindingByXpath("//*[@id='gigya-profile-form3']//a[5]").getText();
    }
    public static String profileFavoriteTitle6() {
        return TestHelper.cyclicElementFindingByXpath("//*[@id='gigya-profile-form3']/div/div[1]/*[contains(@class,'gigya-composite-control')][1]").getText();
    }
    public static String profileFavoriteTitle7() {
        return TestHelper.cyclicElementFindingByXpath("//*[@id='gigya-profile-form3']/div/div[1]/*[contains(@class,'gigya-composite-control-dropdown')]//span").getText();
    }
    public static String profileFavoriteTitle8() {
        return TestHelper.cyclicElementFindingByXpath("//*[@id='myFavoritePlayersList']").getText();
    }
    public static String profileFavoriteTitle9() {
        return TestHelper.cyclicElementFindingByXpath("//*[@id='gigya-profile-form3']/div[2]/div[2]/div[1]").getText();
    }
    public static String profileFavoriteTitle10() {
        return TestHelper.cyclicElementFindingByXpath("//*[@id='gigya-profile-form3']//div[contains(@class,'gigya-composite-control-textbox')]//span").getText();
    }
    public static String profileFavoriteTitle11() {
        return TestHelper.cyclicElementFindingByXpath("//*[@id='gigya-profile-form3']//div[@class='gigya-layout-cell']/div[3]//span").getText();
    }

    //GETTING VALUES
    public static String checkLoginTitle() {
        return TestHelper.cyclicElementFindingByXpath("//div[text()='Login']").getText();
    }
    public static String checkLoginSubTitle1() {
        return TestHelper.cyclicElementFindingByXpath("//*[@id='gigya-login-screen']//*[text()='Login with your social network:']").getText();
    }
    public static String checkLoginSubTitle2() {
        return TestHelper.cyclicElementFindingByXpath("//*[@id='gigya-login-screen']//*[text()='Or, login here:']").getText();
    }
    public static String checkEmailTitle() {
        return TestHelper.cyclicElementFindingByXpath("//*[@id='gigya-login-screen']//*[text()='Email:']").getText();
    }
    public static String checkRegistrationTitle() {
        return TestHelper.cyclicElementFindingByXpath("//div[@class='gigya-screen-dialog-top']//div[text()='Registration']")
                .getText();
    }
}
