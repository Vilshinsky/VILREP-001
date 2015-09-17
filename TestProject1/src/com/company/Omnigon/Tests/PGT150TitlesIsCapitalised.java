package com.company.Omnigon.Tests;

import com.company.Omnigon.Page.PGATGigya;
import com.company.PageObjects.TestHelper;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Dimension;

/**
 * Created by Omnigon on 9/17/2015.
 */
public class PGT150TitlesIsCapitalised {
    @Before
    public void preconditions() {
        TestHelper.setupChromeAndGo(PGATGigya.pageUrl);
        TestHelper.driver.manage().window().setSize(new Dimension(1212, 900));
    }
/*    @After
    public void postconditions() {
        TestHelper.quit();
    }*/

    @Test
    public void profileSettingsTitlesCheck() {
        PGATGigya.goToAuthorization();
        Assert.assertEquals("Login", PGATGigya.checkLoginTitle());
        Assert.assertEquals("Login with your social network:", PGATGigya.checkLoginSubTitle1());
        Assert.assertEquals("Or, login here:", PGATGigya.checkLoginSubTitle2());
        Assert.assertEquals("Email:", PGATGigya.checkEmailTitle());
        PGATGigya.goToRegistration();
        Assert.assertEquals("Registration", PGATGigya.checkRegistrationTitle());
        Assert.assertEquals("1. Personal info",PGATGigya.checkRegistrationSubTitle11());
        Assert.assertEquals("2. notification Settings", PGATGigya.checkRegistrationSubTitle12());
        Assert.assertEquals("3. Favorite players", PGATGigya.checkRegistrationSubTitle13());
        PGATGigya.fillRegistrationForm1();
        Assert.assertEquals("1. Personal info", PGATGigya.checkRegistrationSubTitle21());
        Assert.assertEquals("2. notification Settings", PGATGigya.checkRegistrationSubTitle22());
        Assert.assertEquals("3. Favorite players", PGATGigya.checkRegistrationSubTitle23());
        PGATGigya.fillRegistrationForm2();
        Assert.assertEquals("1. Personal info", PGATGigya.checkRegistrationSubTitle31());
        Assert.assertEquals("2. notification Settings", PGATGigya.checkRegistrationSubTitle32());
        Assert.assertEquals("3. Favorite players", PGATGigya.checkRegistrationSubTitle33());
        Assert.assertEquals("Manage your Favorites", PGATGigya.checkManageFavoritesTitle());
        Assert.assertEquals("Select Tour:", PGATGigya.checkSelectTourTitle());
        Assert.assertEquals("Your Favorites:", PGATGigya.checkmanageFavoritesTitle());
        Assert.assertEquals("Add more Players", PGATGigya.checkAddPlayersTitle());
        Assert.assertEquals("", PGATGigya.checkFindPlayerTitle());
        Assert.assertEquals("", PGATGigya.checkSelectPlayerTitle());
        PGATGigya.fillRegistrationForm3();
        PGATGigya.AccountLogOut();
        PGATGigya.passAuthorizationAndGoToProfile();
    }
}
