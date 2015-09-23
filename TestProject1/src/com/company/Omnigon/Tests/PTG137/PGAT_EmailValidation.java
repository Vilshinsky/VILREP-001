package com.company.Omnigon.Tests.PTG137;

import com.company.Common.TestHelper;
import com.company.Omnigon.Page.Gigya;
import org.junit.*;
import org.openqa.selenium.Dimension;

/**
 * Created by Omnigon on 9/22/2015.
 */
public class PGAT_EmailValidation {
    @BeforeClass
    public static void precondition() {
        Gigya.setupChromeAndGoPGAT();
        TestHelper.driver.manage().window().setSize(new Dimension(1212, 900));
        Gigya.newAccount();
        TestHelper.quit();
    }
    @After
    public void postcondition() {
        TestHelper.quit();
    }

    @Test
    public void shouldDetectUsedEmailWithChrome() {
        Gigya.setupChromeAndGoPGAT();
        TestHelper.driver.manage().window().setSize(new Dimension(1212, 900));
        Gigya.tryUsedEmail();
        Assert.assertEquals("Email already exists", Gigya.checkEmailAlreadyUsedError());
        Assert.assertEquals("Not available", Gigya.checkEmailNotAvailableError());
        Assert.assertEquals(true, Gigya.checkThatRegistrationStep2Blocked());
    }
    @Test
    public void shouldDetectUsedEmailWithFirefox() {
        Gigya.setupFirefoxAndGoPGAT();
        TestHelper.driver.manage().window().setSize(new Dimension(1212, 900));
        Gigya.tryUsedEmail();
        Assert.assertEquals("Email already exists", Gigya.checkEmailAlreadyUsedError());
        Assert.assertEquals("Not available", Gigya.checkEmailNotAvailableError());
        Assert.assertEquals(true, Gigya.checkThatRegistrationStep2Blocked());
    }
    @Test
    public void shouldDetectUsedEmailWithIE() {
        Gigya.setupIEAndGoPGAT();
        TestHelper.driver.manage().window().setSize(new Dimension(1212, 900));
        Gigya.tryUsedEmail();
        Assert.assertEquals("Email already exists", Gigya.checkEmailAlreadyUsedError());
        Assert.assertEquals("Not available", Gigya.checkEmailNotAvailableError());
        Assert.assertEquals(true, Gigya.checkThatRegistrationStep2Blocked());
    }
}
