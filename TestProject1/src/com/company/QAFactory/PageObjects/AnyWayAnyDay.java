package com.company.QAFactory.PageObjects;

import com.company.Common.TestHelper;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Admin on 17.09.15.
 */
public class AnyWayAnyDay {
    @Before
    public void preconditions() {
        TestHelper.setupChromeAndGo("https://www.anywayanyday.com/");
        TestHelper.setResolution(1200,900);
    }
    @After
    public void postconditions() {
        TestHelper.quit();
    }
    @Test
    public void test1() {
        TestHelper.cyclicElementSearchByCss(".j-current_culture").click();
        TestHelper.cyclicElementIsDisplayedCss(".j-culture_section .b-drop_down_list-container>li:nth-child(4)>span>span").click();
        TestHelper.cyclicElementSearchByXpath("//span[text()='Dezember']").click();
        TestHelper.waitSec(2);
        TestHelper.cyclicElementSearchByXpath("//*[@data-date='2015/12/24']//i").click();
        TestHelper.waitSec(2);
        TestHelper.cyclicElementSearchByCss("[data-flight-date='2015/12/24'] .j-departure_airport_input").sendKeys("Kiev");
        TestHelper.cyclicElementSearchByCss("[data-flight-date='2015/12/24'] .j-arrival_airport_input").sendKeys("Berlin");
        TestHelper.waitSec(1);
        Assert.assertEquals("Kiew", TestHelper.cyclicElementSearchByCss(".j-departure_airport_input").getAttribute("value"));
        Assert.assertEquals("Berlin", TestHelper.cyclicElementSearchByCss(".j-arrival_airport_input").getAttribute("value"));

        TestHelper.cyclicElementSearchByCss(".j-culture_section").click();
        TestHelper.cyclicElementIsDisplayedCss(".j-culture_section .b-drop_down_list-container>li:nth-child(4)>span>span").click();
    }
}
