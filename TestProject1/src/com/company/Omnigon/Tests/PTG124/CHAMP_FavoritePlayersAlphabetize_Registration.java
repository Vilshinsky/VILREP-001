package com.company.Omnigon.Tests.PTG124;

import com.company.Common.TestHelper;
import com.company.Omnigon.Page.Gigya;
import com.company.Omnigon.Page.PGATGigya;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Dimension;

/**
 * Created by Omnigon on 9/22/2015.
 */
public class CHAMP_FavoritePlayersAlphabetize_Registration {
    @After
    public void postcondition() {
        TestHelper.quit();
    }
    @Test
    public void alphabetizeThroughRegistrationChrome() {
        TestHelper.setupChromeAndGo(Gigya.pageCHAMPQA);
        TestHelper.driver.manage().window().setSize(new Dimension(1212, 900));
        Gigya.goToRegistrationStep3();
        Gigya.addThreePlayers();
        Assert.assertEquals("Stuart Appleby", Gigya.checkFirstInList());
        Assert.assertEquals("Dave Barr", Gigya.checkSecondInList());
        Assert.assertEquals("Tim Norris", Gigya.checkThirdInList());
        Gigya.submitRegistration();
        PGATGigya.goToFavorites();
        Assert.assertEquals("Stuart Appleby", Gigya.checkFirstInList());
        Assert.assertEquals("Dave Barr", Gigya.checkSecondInList());
        Assert.assertEquals("Tim Norris", Gigya.checkThirdInList());
    }
    @Test
    public void alphabetizeThroughRegistrationFirefox() {
        TestHelper.setupFirefoxAndGo(Gigya.pageCHAMPQA);
        TestHelper.driver.manage().window().setSize(new Dimension(1212, 900));
        Gigya.goToRegistrationStep3();
        Gigya.addThreePlayers();
        Assert.assertEquals("Stuart Appleby", Gigya.checkFirstInList());
        Assert.assertEquals("Dave Barr", Gigya.checkSecondInList());
        Assert.assertEquals("Tim Norris", Gigya.checkThirdInList());
        Gigya.submitRegistration();
        PGATGigya.goToFavorites();
        Assert.assertEquals("Stuart Appleby", Gigya.checkFirstInList());
        Assert.assertEquals("Dave Barr", Gigya.checkSecondInList());
        Assert.assertEquals("Tim Norris", Gigya.checkThirdInList());
    }
    @Test
    public void alphabetizeThroughRegistrationIE() {
        TestHelper.setupIEAndGo(Gigya.pageCHAMPQA);
        TestHelper.driver.manage().window().setSize(new Dimension(1212, 900));
        Gigya.goToRegistrationStep3();
        Gigya.addThreePlayers();
        Assert.assertEquals("Stuart Appleby", Gigya.checkFirstInList());
        Assert.assertEquals("Dave Barr", Gigya.checkSecondInList());
        Assert.assertEquals("Tim Norris", Gigya.checkThirdInList());
        Gigya.submitRegistration();
        PGATGigya.goToFavorites();
        Assert.assertEquals("Stuart Appleby", Gigya.checkFirstInList());
        Assert.assertEquals("Dave Barr", Gigya.checkSecondInList());
        Assert.assertEquals("Tim Norris", Gigya.checkThirdInList());
    }
}
