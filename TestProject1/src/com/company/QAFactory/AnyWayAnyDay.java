package com.company.QAFactory;

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
        TestHelper.waitElementByCss(".j-current_culture").click();
        TestHelper.cyclicElementIsDisplayedCss(".j-culture_section .b-drop_down_list-container>li:nth-child(4)>span>span").click();
        TestHelper.waitElementByXpath("//span[text()='Dezember']").click();
        TestHelper.waitSec(2);
        TestHelper.waitElementByXpath("//*[@data-date='2015/12/24']//i").click();
        TestHelper.waitSec(2);
        TestHelper.waitElementByCss("[data-flight-date='2015/12/24'] .j-departure_airport_input").sendKeys("Kiev");
        TestHelper.waitElementByCss("[data-flight-date='2015/12/24'] .j-arrival_airport_input").sendKeys("Berlin");
        TestHelper.waitSec(1);
        Assert.assertEquals("Kiew", TestHelper.waitElementByCss(".j-departure_airport_input").getAttribute("value"));
        Assert.assertEquals("Berlin", TestHelper.waitElementByCss(".j-arrival_airport_input").getAttribute("value"));

        TestHelper.waitElementByCss(".j-culture_section").click();
        TestHelper.cyclicElementIsDisplayedCss(".j-culture_section .b-drop_down_list-container>li:nth-child(4)>span>span").click();
    }
}
