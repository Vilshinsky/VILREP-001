package com.company.Omnigon.Tests.PTG150;

import com.company.Common.TestHelper;
import com.company.Omnigon.Page.Gigya;
import com.company.Omnigon.Page.Gigya;
import com.company.Omnigon.Page.PGATGigya;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Dimension;

/**
 * Created by Omnigon on 9/22/2015.
 */
public class Firefox_WGC_TitlesCapitalisation_Profile {
    @BeforeClass
    public static void precondition() {
        TestHelper.setupFirefoxAndGo(Gigya.pageWGCQA);
        TestHelper.driver.manage().window().setSize(new Dimension(1212, 900));
        Gigya.newAccount();
    }
    @AfterClass
    public static void postcondition() {
        TestHelper.quit();
    }
    @Test
    public void checkProfileFavoritePlayersListTitle1() {
        PGATGigya.goToFavorites();
        Assert.assertEquals("Personal Info", Gigya.profileFavoriteTitle1());
    }
    @Test
    public void checkProfileFavoritePlayersListTitle2() {
        Assert.assertEquals("Notification Settings", Gigya.profileFavoriteTitle2());
    }
    @Test
    public void checkProfileFavoritePlayersListTitle3() {
        Assert.assertEquals("Favorite Players", Gigya.profileFavoriteTitle3());
    }
    @Test
    public void checkProfileFavoritePlayersListTitle4() {
        Assert.assertEquals("Change Password", Gigya.profileFavoriteTitle4());
    }
    @Test
    public void checkProfileFavoritePlayersListTitle5() {
        Assert.assertEquals("Logout", Gigya.profileFavoriteTitle5());
    }
    @Test
    public void checkProfileFavoritePlayersListTitle6() {
        Assert.assertEquals("Manage Your Favorites", Gigya.profileFavoriteTitle6());
    }
    @Test
    public void checkProfileFavoritePlayersListTitle7() {
        Assert.assertEquals("Select Tour:", Gigya.profileFavoriteTitle7());
    }
    @Test
    public void checkProfileFavoritePlayersListTitle8() {
        Assert.assertEquals("Your Favorites:", Gigya.profileFavoriteTitle8());
    }
    @Test
    public void checkProfileFavoritePlayersListTitle9() {
        Assert.assertEquals("Add More Players", Gigya.profileFavoriteTitle9());
    }
    @Test
    public void checkProfileFavoritePlayersListTitle10() {
        Assert.assertEquals("Find a Player:", Gigya.profileFavoriteTitle10());
    }
    @Test
    public void checkProfileFavoritePlayersListTitle11() {
        Assert.assertEquals("Or Select Player from the List:", Gigya.profileFavoriteTitle11());
    }
}
