package com.company.QAFactory;

import com.company.Common.TestHelper;
import com.company.QAFactory.PageObjects.UzPage;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by Admin on 22.09.15.
 */
public class BookingUzTests {
    @BeforeClass
    public static void precondition() {
        TestHelper.setupChromeAndGo(UzPage.pageBookingUz);
        TestHelper.driver.manage().window().maximize();
    }
    @AfterClass
    public static void postcondition() {
        TestHelper.quit();
    }
    @Test
    public void testBlock() {
        UzPage.fillStationFromInput();
        UzPage.fillStationTillInput();
        UzPage.setDate();
        Assert.assertEquals("10.20.2015", UzPage.checkDateOnSearchButton());
        UzPage.pushSearch();
        Assert.assertEquals("115 О", UzPage.checkNumberOfFirstTrain());
        Assert.assertEquals("043 К", UzPage.checkNumberOfSecondTrain());
        Assert.assertEquals("143 К", UzPage.checkNumberOfThirdTrain());
        UzPage.goToSecondTrain();
        Assert.assertTrue(UzPage.checkThatTrainRoutePopupExist());
        UzPage.closeTrainRoutePopup();
        UzPage.moveToFooter();
        UzPage.isChooseButtonActive();
        UzPage.checkThatFifthCoachDefault();
        Assert.assertEquals("active", UzPage.checkThatFifthCoachDefault());
        Assert.assertEquals("lower free", UzPage.checkThatPlaceFree());
        UzPage.goToMyFreePlace();
        Assert.assertEquals(true, UzPage.cyclicTicketPriceMatchWaiting("179.07*"));
        UzPage.fillLastName();
        UzPage.fillName();
    }
}
