package com.company.QAFactory;

import com.company.Common.TestHelper;
import com.company.QAFactory.PageObjects.UzPage;
import org.junit.*;

/**
 * Created by Admin on 22.09.15.
 */
public class BookingUzTests {
    @Before
    public void precondition() {
        TestHelper.setupChromeAndGo(UzPage.pageBookingUz);
        TestHelper.driver.manage().window().maximize();
    }
    @After
    public void postcondition() {
        TestHelper.quit();
    }
    @Test
    public void testBlock1() {
        UzPage.fillStationFromInput("Kyi");
        UzPage.fillStationTillInput("Ivano-");
        UzPage.setOctober20thDate();
        Assert.assertEquals("10.20.2015", UzPage.checkDateOnSearchButton());
        UzPage.pushSearch();
        Assert.assertEquals("115 О", UzPage.checkNumberOfFirstTrain());
        Assert.assertEquals("043 К", UzPage.checkNumberOfSecondTrain());
        Assert.assertEquals("143 К", UzPage.checkNumberOfThirdTrain());
        UzPage.goToSecondTrain();
        Assert.assertTrue(UzPage.checkThatTrainRoutePopupExist());
        UzPage.closeTrainRoutePopup();
        UzPage.moveToFooter();
        UzPage.isChooseButtonActive(UzPage.selectCoupe2ndCoachButton);
        UzPage.checkThatFifthCoachDefault();
        Assert.assertEquals("active", UzPage.checkThatFifthCoachDefault());
        Assert.assertEquals(true, UzPage.cyclicValuesMatchWaitingBeforeAssert("lower free", UzPage.getActivityValue
                (UzPage.sit31)));
        UzPage.goToMyFreePlace(UzPage.sit31);
        Assert.assertEquals(true, UzPage.cyclicValuesMatchWaitingBeforeAssert("179.07", UzPage.getSummaryPrice()));
        UzPage.fillLastName();
        UzPage.fillName();
    }
    @Test
    public void testBlock2() {
        UzPage.fillStationFromInput("Lvi");
        UzPage.fillStationTillInput("Uzhho");
        UzPage.setSeptember30thDate();
        Assert.assertEquals("09.30.2015", UzPage.checkDateOnSearchButton());
        UzPage.pushSearch();
        Assert.assertEquals("829 Л", UzPage.checkNumberOfTrain(UzPage.trainEightTwoNine));
        Assert.assertEquals("601 Л", UzPage.checkNumberOfTrain(UzPage.trainSixZeroOne));
        UzPage.moveToFooter();
        UzPage.isChooseButtonActive(UzPage.chooseButton601);
        Assert.assertEquals(true, UzPage.cyclicValuesMatchWaitingBeforeAssert("lower free", UzPage.getActivityValue
                (UzPage.sit41)));
        Assert.assertEquals(true, UzPage.cyclicValuesMatchWaitingBeforeAssert("upper free", UzPage.getActivityValue
                (UzPage.sit42)));
        UzPage.goToMyFreePlace(UzPage.sit41);
        UzPage.goToMyFreePlace(UzPage.sit42);
        Assert.assertEquals(true, UzPage.cyclicValuesMatchWaitingBeforeAssert("163.76", UzPage.getSummaryPrice()));
        UzPage.fillHigherNameInputs();
        UzPage.fillLowerNameInputs();
    }
}
