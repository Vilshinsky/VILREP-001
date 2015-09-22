package com.company.Omnigon.Tests.PTG150;

import com.company.Common.TestHelper;
import com.company.Omnigon.Page.Gigya;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Dimension;

/**
 * Created by Omnigon on 9/22/2015.
 */
public class IE_CHAMP_TitlesCapitalisation_Registration {
    @BeforeClass
    public static void precondition() {
        TestHelper.setupIEAndGo(Gigya.pageCHAMPQA);
        TestHelper.driver.manage().window().setSize(new Dimension(1212, 900));
    }
    @AfterClass
    public static void postcondition() {
        TestHelper.quit();
    }
    @Test
    public void checkRegistrationForm1Title1() {
        Gigya.goToRegistrationStep1();
        Assert.assertEquals("1. Personal Info", Gigya.regForm1Title1());
    }
    @Test
    public void checkRegistrationForm1Title2() {
        Assert.assertEquals("2. Notification Settings", Gigya.regForm1Title2());
    }
    @Test
    public void checkRegistrationForm1Title3() {
        Assert.assertEquals("3. Favorite Players", Gigya.regForm1Title3());
    }
    @Test
    public void checkRegistrationForm2Title1() {
        Gigya.moveToRegistrationStep2();
        Assert.assertEquals("1. Personal Info", Gigya.regForm2Title1());
    }
    @Test
    public void checkRegistrationForm2Title2() {
        Assert.assertEquals("2. Notification Settings", Gigya.regForm2Title2());
    }
    @Test
    public void checkRegistrationForm2Title3() {
        Assert.assertEquals("3. Favorite Players", Gigya.regForm2Title3());
    }
    @Test
    public void checkRegistrationForm3Title1() {
        Gigya.moveToRegistrationStep3();
        Assert.assertEquals("1. Personal Info", Gigya.regForm3Title1());
    }
    @Test
    public void checkRegistrationForm3Title2() {
        Assert.assertEquals("2. Notification Settings", Gigya.regForm3Title2());
    }
    @Test
    public void checkRegistrationForm3Title3() {
        Assert.assertEquals("3. Favorite Players", Gigya.regForm3Title3());
    }
    @Test
    public void checkRegistrationForm3Title4() {
        Assert.assertEquals("Manage Your Favorites", Gigya.regForm3Title4());
    }
    @Test
    public void checkRegistrationForm3Title5() {
        Assert.assertEquals("Select Tour:", Gigya.regForm3Title5());
    }
    @Test
    public void checkRegistrationForm3Title6() {
        Assert.assertEquals("Your Favorites:", Gigya.regForm3Title6());
    }
    @Test
    public void checkRegistrationForm3Title7() {
        Assert.assertEquals("Add More Players", Gigya.regForm3Title7());
    }
    @Test
    public void checkRegistrationForm3Title8() {
        Assert.assertEquals("Find a Player:", Gigya.regForm3Title8());
    }
    @Test
    public void checkRegistrationForm3Title9() {
        Assert.assertEquals("Or Select Player from the List:", Gigya.regForm3Title9());
    }
}
