package com.company.Omnigon.Tests;

import com.company.Omnigon.Page.PGATGigya;
import com.company.PageObjects.TestHelper;
import org.junit.*;
import org.openqa.selenium.Dimension;

/**
 * Created by Omnigon on 9/18/2015.
 */
public class PGT150_Firefox_WGC_TitlesCapitalisation {
    @BeforeClass
    public static void precondition() {
        TestHelper.setupFirefoxAndGo(PGATGigya.pageWGCQA);
        TestHelper.driver.manage().window().setSize(new Dimension(1212, 900));
        PGATGigya.newAccount();
        TestHelper.quit();
    }
    @Before
    public void preconditions() {
        TestHelper.setupFirefoxAndGo(PGATGigya.pageWGCQA);
        TestHelper.driver.manage().window().setSize(new Dimension(1212, 900));
    }
    @After
    public void postconditions() {
        TestHelper.quit();
    }
    @Test
    public void checkRegistrationForm1Title1() {
        PGATGigya.goToAuthorization();
        PGATGigya.goToRegistrationStep1();
        Assert.assertEquals("1. Personal Info", PGATGigya.regForm1Title1());
    }
    @Test
    public void checkRegistrationForm1Title2() {
        PGATGigya.goToAuthorization();
        PGATGigya.goToRegistrationStep1();
        Assert.assertEquals("2. Notification Settings", PGATGigya.regForm1Title2());
    }
    @Test
    public void checkRegistrationForm1Title3() {
        PGATGigya.goToAuthorization();
        PGATGigya.goToRegistrationStep1();
        Assert.assertEquals("3. Favorite Players", PGATGigya.regForm1Title3());
    }
    @Test
    public void checkRegistrationForm2Title1() {
        PGATGigya.goToAuthorization();
        PGATGigya.goToRegistrationStep2();
        Assert.assertEquals("1. Personal Info", PGATGigya.regForm2Title1());
    }
    @Test
    public void checkRegistrationForm2Title2() {
        PGATGigya.goToAuthorization();
        PGATGigya.goToRegistrationStep2();
        Assert.assertEquals("2. Notification Settings", PGATGigya.regForm2Title2());
    }
    @Test
    public void checkRegistrationForm2Title3() {
        PGATGigya.goToAuthorization();
        PGATGigya.goToRegistrationStep2();
        Assert.assertEquals("3. Favorite Players", PGATGigya.regForm2Title3());
    }
    @Test
    public void checkRegistrationForm3Title1() {
        PGATGigya.goToAuthorization();
        PGATGigya.goToRegistrationStep3();
        Assert.assertEquals("1. Personal Info", PGATGigya.regForm3Title1());
    }
    @Test
    public void checkRegistrationForm3Title2() {
        PGATGigya.goToAuthorization();
        PGATGigya.goToRegistrationStep3();
        Assert.assertEquals("2. Notification Settings", PGATGigya.regForm3Title2());
    }
    @Test
    public void checkRegistrationForm3Title3() {
        PGATGigya.goToAuthorization();
        PGATGigya.goToRegistrationStep3();
        Assert.assertEquals("3. Favorite Players", PGATGigya.regForm3Title3());
    }
    @Test
    public void checkRegistrationForm3Title4() {
        PGATGigya.goToAuthorization();
        PGATGigya.goToRegistrationStep3();
        Assert.assertEquals("Manage Your Favorites", PGATGigya.regForm3Title4());
    }
    @Test
    public void checkRegistrationForm3Title5() {
        PGATGigya.goToAuthorization();
        PGATGigya.goToRegistrationStep3();
        Assert.assertEquals("Select Tour:", PGATGigya.regForm3Title5());
    }
    @Test
    public void checkRegistrationForm3Title6() {
        PGATGigya.goToAuthorization();
        PGATGigya.goToRegistrationStep3();
        Assert.assertEquals("Your Favorites:", PGATGigya.regForm3Title6());
    }
    @Test
    public void checkRegistrationForm3Title7() {
        PGATGigya.goToAuthorization();
        PGATGigya.goToRegistrationStep3();
        Assert.assertEquals("Add More Players", PGATGigya.regForm3Title7());
    }
    @Test
    public void checkRegistrationForm3Title8() {
        PGATGigya.goToAuthorization();
        PGATGigya.goToRegistrationStep3();
        Assert.assertEquals("Find a Player:", PGATGigya.regForm3Title8());
    }
    @Test
    public void checkRegistrationForm3Title9() {
        PGATGigya.goToAuthorization();
        PGATGigya.goToRegistrationStep3();
        Assert.assertEquals("Or Select Player from the List:", PGATGigya.regForm3Title9());
    }
    @Test
    public void checkProfileFavoritePlayersListTitle1() {
        PGATGigya.passAuthorization();
        PGATGigya.goToFavorites();
        Assert.assertEquals("Personal Info", PGATGigya.profileFavoriteTitle1());
        PGATGigya.logOutFromProfile();
    }
    @Test
    public void checkProfileFavoritePlayersListTitle2() {
        PGATGigya.passAuthorization();
        PGATGigya.goToFavorites();
        Assert.assertEquals("Notification Settings", PGATGigya.profileFavoriteTitle2());
        PGATGigya.logOutFromProfile();
    }
    @Test
    public void checkProfileFavoritePlayersListTitle3() {
        PGATGigya.passAuthorization();
        PGATGigya.goToFavorites();
        Assert.assertEquals("Favorite Players", PGATGigya.profileFavoriteTitle3());
        PGATGigya.logOutFromProfile();
    }
    @Test
    public void checkProfileFavoritePlayersListTitle4() {
        PGATGigya.passAuthorization();
        PGATGigya.goToFavorites();
        Assert.assertEquals("Change Password", PGATGigya.profileFavoriteTitle4());
        PGATGigya.logOutFromProfile();
    }
    @Test
    public void checkProfileFavoritePlayersListTitle5() {
        PGATGigya.passAuthorization();
        PGATGigya.goToFavorites();
        Assert.assertEquals("Logout", PGATGigya.profileFavoriteTitle5());
        PGATGigya.logOutFromProfile();
    }
    @Test
    public void checkProfileFavoritePlayersListTitle6() {
        PGATGigya.passAuthorization();
        PGATGigya.goToFavorites();
        Assert.assertEquals("Manage Your Favorites", PGATGigya.profileFavoriteTitle6());
        PGATGigya.logOutFromProfile();
    }
    @Test
    public void checkProfileFavoritePlayersListTitle7() {
        PGATGigya.passAuthorization();
        PGATGigya.goToFavorites();
        Assert.assertEquals("Select Tour:", PGATGigya.profileFavoriteTitle7());
        PGATGigya.logOutFromProfile();
    }
    @Test
    public void checkProfileFavoritePlayersListTitle8() {
        PGATGigya.passAuthorization();
        PGATGigya.goToFavorites();
        Assert.assertEquals("Your Favorites:", PGATGigya.profileFavoriteTitle8());
        PGATGigya.logOutFromProfile();
    }
    @Test
    public void checkProfileFavoritePlayersListTitle9() {
        PGATGigya.passAuthorization();
        PGATGigya.goToFavorites();
        Assert.assertEquals("Add More Players", PGATGigya.profileFavoriteTitle9());
        PGATGigya.logOutFromProfile();
    }
    @Test
    public void checkProfileFavoritePlayersListTitle10() {
        PGATGigya.passAuthorization();
        PGATGigya.goToFavorites();
        Assert.assertEquals("Find a Player:", PGATGigya.profileFavoriteTitle10());
        PGATGigya.logOutFromProfile();
    }
    @Test
    public void checkProfileFavoritePlayersListTitle11() {
        PGATGigya.passAuthorization();
        PGATGigya.goToFavorites();
        Assert.assertEquals("Or Select Player from the List:", PGATGigya.profileFavoriteTitle11());
        PGATGigya.logOutFromProfile();
    }
}
