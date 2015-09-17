package com.company.Omnigon.Tests;

import com.company.Omnigon.Page.PGATGigya;
import com.company.PageObjects.TestHelper;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Dimension;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Omnigon on 9/17/2015.
 */
public class PGT150TitlesIsCapitalised {
    @Before
    public void preconditions() {
        TestHelper.setupChromeAndGo(PGATGigya.pageUrl);
        TestHelper.driver.manage().window().setSize(new Dimension(1212, 900));
    }
    @After
    public void postconditions() {
        TestHelper.quit();
    }

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
        PGATGigya.fillRegistrationForm();
        PGATGigya.AccountLogOut();
        PGATGigya.passAuthorizationAndGoToProfile();

    }
}
