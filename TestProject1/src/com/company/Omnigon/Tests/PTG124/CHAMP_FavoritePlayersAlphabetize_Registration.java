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
        Gigya.setupChromeAndGoCHAMP();
        TestHelper.driver.manage().window().setSize(new Dimension(1212, 900));
        Gigya.goToRegistrationStep3();
        Gigya.addThreePlayers();
        Assert.assertEquals("Stuart Appleby\n" + "×", Gigya.checkFirstInList());
        Assert.assertEquals("Dave Barr\n" + "×", Gigya.checkSecondInList());
        Assert.assertEquals("Tim Norris\n" + "×", Gigya.checkThirdInList());
        Gigya.submitRegistration();
        PGATGigya.goToFavorites();
        Assert.assertEquals("Stuart Appleby\n" + "×", Gigya.checkFirstInList());
        Assert.assertEquals("Dave Barr\n" + "×", Gigya.checkSecondInList());
        Assert.assertEquals("Tim Norris\n" + "×", Gigya.checkThirdInList());
    }
    @Test
    public void alphabetizeThroughRegistrationFirefox() {
        Gigya.setupFirefoxAndGoCHAMP();
        TestHelper.driver.manage().window().setSize(new Dimension(1212, 900));
        Gigya.goToRegistrationStep3();
        Gigya.addThreePlayers();
        Assert.assertEquals("Stuart Appleby\n" + "×", Gigya.checkFirstInList());
        Assert.assertEquals("Dave Barr\n" + "×", Gigya.checkSecondInList());
        Assert.assertEquals("Tim Norris\n" + "×", Gigya.checkThirdInList());
        Gigya.submitRegistration();
        PGATGigya.goToFavorites();
        Assert.assertEquals("Stuart Appleby\n" + "×", Gigya.checkFirstInList());
        Assert.assertEquals("Dave Barr\n" + "×", Gigya.checkSecondInList());
        Assert.assertEquals("Tim Norris\n" + "×", Gigya.checkThirdInList());
    }
    @Test
    public void alphabetizeThroughRegistrationIE() {
        Gigya.setupIEAndGoCHAMP();
        TestHelper.driver.manage().window().setSize(new Dimension(1212, 900));
        Gigya.goToRegistrationStep3();
        Gigya.addThreePlayers();
        Assert.assertEquals("Stuart Appleby\n" + "×", Gigya.checkFirstInList());
        Assert.assertEquals("Dave Barr\n" + "×", Gigya.checkSecondInList());
        Assert.assertEquals("Tim Norris\n" + "×", Gigya.checkThirdInList());
        Gigya.submitRegistration();
        PGATGigya.goToFavorites();
        Assert.assertEquals("Stuart Appleby\n" + "×", Gigya.checkFirstInList());
        Assert.assertEquals("Dave Barr\n" + "×", Gigya.checkSecondInList());
        Assert.assertEquals("Tim Norris\n" + "×", Gigya.checkThirdInList());
    }
}
