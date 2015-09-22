package com.company.Omnigon.Tests.PTG124;

import com.company.Common.TestHelper;
import com.company.Omnigon.Page.Gigya;
import com.company.Omnigon.Page.PGATGigya;
import org.junit.After;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Dimension;

/**
 * Created by Omnigon on 9/22/2015.
 */
public class WEBCOM_FavoritePlayersAlphabetize_Profile {
    @BeforeClass
    public static void precondition() {
        TestHelper.setupChromeAndGo(Gigya.pageWEBCOMQA);
        TestHelper.driver.manage().window().setSize(new Dimension(1212, 900));
        Gigya.newAccount();
        TestHelper.quit();
    }
    @After
    public void postcondition() {
        TestHelper.quit();
    }
    @Test
    public void alphabetizeThroughManageProfileChrome() {
        TestHelper.setupChromeAndGo(Gigya.pageWEBCOMQA);
        TestHelper.driver.manage().window().setSize(new Dimension(1212, 900));
        Gigya.passAuthorization();
        PGATGigya.goToFavorites();
        Gigya.addThreePlayers();
        Assert.assertEquals("Stuart Appleby", Gigya.checkFirstInList());
        Assert.assertEquals("Dave Barr", Gigya.checkSecondInList());
        Assert.assertEquals("Tim Norris", Gigya.checkThirdInList());
    }
    @Test
    public void alphabetizeThroughRegistrationFirefox() {
        TestHelper.setupFirefoxAndGo(Gigya.pageWEBCOMQA);
        TestHelper.driver.manage().window().setSize(new Dimension(1212, 900));
        Gigya.passAuthorization();
        PGATGigya.goToFavorites();
        Gigya.addThreePlayers();
        Assert.assertEquals("Stuart Appleby", Gigya.checkFirstInList());
        Assert.assertEquals("Dave Barr", Gigya.checkSecondInList());
        Assert.assertEquals("Tim Norris", Gigya.checkThirdInList());
    }
    @Test
    public void alphabetizeThroughRegistrationIE() {
        TestHelper.setupIEAndGo(Gigya.pageWEBCOMQA);
        TestHelper.driver.manage().window().setSize(new Dimension(1212, 900));
        Gigya.passAuthorization();
        PGATGigya.goToFavorites();
        Gigya.addThreePlayers();
        Assert.assertEquals("Stuart Appleby", Gigya.checkFirstInList());
        Assert.assertEquals("Dave Barr", Gigya.checkSecondInList());
        Assert.assertEquals("Tim Norris", Gigya.checkThirdInList());
    }
}
