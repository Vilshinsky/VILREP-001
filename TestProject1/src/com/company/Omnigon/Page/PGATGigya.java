package com.company.Omnigon.Page;

import com.company.PageObjects.TestHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by Omnigon on 9/16/2015.
 */
public class PGATGigya {
    public static String pageUrl = "http://qa-www.pgatour.ctmsp.com/";

    public static void goToAuthorization() {
        TestHelper.slp(2);
        TestHelper.cyclicElementFindingByCss(".login-button.log-in").click();
    }
    //AUTHORIZATION
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
    public static void goToRegistration() {
        TestHelper.cyclicElementFindingByXpath("//*[@id='gigya-login-screen']//a[text()='Click here ']").click();
    }
    public static void cursorOverAvatar() {
        TestHelper.slp(2);
        Actions actions = new Actions(TestHelper.driver);
        actions.moveToElement(TestHelper.cyclicElementFindingByXpath("//*[@class='user-menu visible-large']")).build().perform();
    }
    public static void passAuthorizationAndGoToProfile() {
        goToAuthorization();
        TestHelper.cyclicElementFindingByXpath("//*[@id='gigya-login-form']//input[@name='username']").sendKeys(newLogin + "@testmail.com");
        TestHelper.cyclicElementFindingByXpath("//*[@id='gigya-login-form']//input[@name='password']").sendKeys("123123123");
        TestHelper.cyclicElementFindingByXpath("//*[@id='gigya-login-form']//input[@class='gigya-input-submit']").click();
        cursorOverAvatar();
        TestHelper.cyclicElementFindingByXpath("//a[text()='Manage profile']").click();
    }
    public static String generateNewLoginValue() {
        DateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmssms");
        Date date = new Date();
        String FinalDate = dateFormat.format(date);
        return FinalDate;
    }
    public static String newLogin = generateNewLoginValue();

    //REGISTRATION STEP 1
    public static String checkRegistrationTitle() {
        return TestHelper.cyclicElementFindingByXpath("//div[@class='gigya-screen-dialog-top']//div[text()='Registration']")
                .getText();
    }
    public static String checkRegistrationSubTitle11() {
        return TestHelper.cyclicElementFindingByXpath("//*[@id='gigya-r-form1']/div/label[1]").getText();
    }
    public static String checkRegistrationSubTitle12() {
        return TestHelper.cyclicElementFindingByXpath("//*[@id='gigya-r-form1']/div/label[2]").getText();
    }
    public static String checkRegistrationSubTitle13() {
        return TestHelper.cyclicElementFindingByXpath("//*[@id='gigya-r-form1']/div/label[3]").getText();
    }
    public static void fillRegistrationForm() {
        TestHelper.slp(5);
        TestHelper.cyclicElementFindingByXpath("//*[@class='wrapper']/*[contains(@class,'login-button')]").click();
        TestHelper.cyclicElementFindingByXpath("//*[@id='gigya-login-form']//a[text()='Click here ']").click();
        TestHelper.cyclicElementFindingByXpath("//*[@id='gigya-register-screen']//input[@name='email']")
                .sendKeys(newLogin + "@testmail.com");
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
        sel.selectByIndex(1);
        TestHelper.cyclicElementFindingByXpath("//*[@id='gigya-r-form1']//span[@class='gigya-input-button blue right']").click();
        TestHelper.cyclicElementFindingByXpath("//*[@id='gigya-r-form2']//span[@class='gigya-input-button blue right']").click();
        TestHelper.cyclicElementFindingByXpath("//*[@id='submitFavoritePlayer']").click();
    }
    public static void AccountLogOut() {
        cursorOverAvatar();
        TestHelper.cyclicElementFindingByXpath("//a[@data-action='logout']").click();
    }
    //REGISTRATION STEP 2
    public static String checkRegistrationSubTitle21() {
        return TestHelper.cyclicElementFindingByXpath("//*[@id='gigya-r-form2']/div/label[1]").getText();
    }
    public static String checkRegistrationSubTitle22() {
        return TestHelper.cyclicElementFindingByXpath("//*[@id='gigya-r-form2']/div/label[2]").getText();
    }
    public static String checkRegistrationSubTitle23() {
        return TestHelper.cyclicElementFindingByXpath("//*[@id='gigya-r-form2']/div/label[3]").getText();
    }
    //REGISTRATION STEP 3
    public static String checkRegistrationSubTitle31() {
        return TestHelper.cyclicElementFindingByXpath("//*[@id='gigya-r-form3']/div/label[1]").getText();
    }
    public static String checkRegistrationSubTitle32() {
        return TestHelper.cyclicElementFindingByXpath("//*[@id='gigya-r-form3']/div/label[2]").getText();
    }
    public static String checkRegistrationSubTitle33() {
        return TestHelper.cyclicElementFindingByXpath("//*[@id='gigya-r-form3']/div/label[3]").getText();
    }

    public static String checkManageFavoritesTitle() {
        return TestHelper.cyclicElementFindingByXpath("//*[@id='gigya-r-form3']/div/div[1]/*[contains(@class,'gigya-composite-control')][1]")
                .getText();
    }
    public static String checkSelectTourTitle() {
        return TestHelper.cyclicElementFindingByXpath("//*[@id='gigya-r-form3']/div/div[1]/*[contains(@class,'gigya-composite-control-dropdown')]//span")
                .getText();
    }
    public static String checkmanageFavoritesTitle() {
        return TestHelper.cyclicElementFindingByXpath("//*[@id='myFavoritePlayersList']").getText();
    }

    public static String checkAddPlayersTitle() {
        return TestHelper.cyclicElementFindingByXpath("//*[@id='gigya-r-form3']/div[2]/div[2]/div[1]")
                .getText();
    }
    public static String checkFindPlayerTitle() {
        return TestHelper.cyclicElementFindingByXpath("//*[@id='gigya-r-form3']//div[contains(@class,'gigya-composite-control-textbox')]//span")
                .getText();
    }
    public static String checkSelectPlayerTitle() {
        return TestHelper.cyclicElementFindingByXpath("//*[@id='gigya-r-form3']/div[2]/div[2]/div[3]//span").getText();
    }

}
