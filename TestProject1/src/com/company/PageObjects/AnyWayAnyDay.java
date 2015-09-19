package com.company.PageObjects;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;

/**
 * Created by Admin on 17.09.15.
 */
public class AnyWayAnyDay {
    @Before
    public void preconditions() {
        TestHelper.setupChromeAndGo("https://www.anywayanyday.com/");
    }
    @After
    public void postconditions() {
        TestHelper.quit();
    }
    @Test
    public void test1() {
        TestHelper.cyclicElementFindingByCss(".j-current_culture").click();
        TestHelper.cyclicElementFindingByCss(".j-culture_section .b-drop_down_list-container>li:nth-child(4)>span>span").click();
        TestHelper.cyclicElementFindingByCss(".b-main_calendar-monthes-selector_proxy").click();
        TestHelper.cyclicElementFindingByCss("[data-date='2015/12/24'] .b-main_calendar-date-body-border").click();
        TestHelper.cyclicElementFindingByCss("[data-flight-date='2015/12/24'] .j-departure_airport_input").sendKeys("Kiev");
        TestHelper.cyclicElementFindingByCss("[data-flight-date='2015/12/24'] .j-arrival_airport_input").sendKeys("Berlin");
        Assert.assertEquals("Kiew",TestHelper.cyclicElementFindingByCss(".j-departure_airport_input").getAttribute("value"));
        Assert.assertEquals("Berlin",TestHelper.cyclicElementFindingByCss(".j-arrival_airport_input").getAttribute("value"));

        TestHelper.cyclicElementFindingByCss(".j-current_culture").click();
        TestHelper.cyclicElementFindingByCss(".j-culture_section .b-drop_down_list-container>li:nth-child(4)>span>span").click();
    }
}
