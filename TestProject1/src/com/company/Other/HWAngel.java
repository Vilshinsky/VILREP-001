package com.company.Other;

import com.company.PageObjects.AngelPage;
import com.company.PageObjects.OxogamesPage;
import com.company.PageObjects.TestHelper;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HWAngel {
    @Before
    public void preconditionsApply() {
        TestHelper.setupAndGo(OxogamesPage.pageUrl);
    }
    @After
    public void postconditionsApply() {
        TestHelper.quit();
    }

    @Test
    public void shouldGiveDifferentOutputAfterInversion() {
        AngelPage.setMaster("mas1ter");
        AngelPage.setSiteName("google.com");
        AngelPage.generate();
        System.out.println(AngelPage.giveValue());
        Assert.assertEquals("/1QFaf1lPgO4S@1a", AngelPage.giveValue());
        Assert.assertEquals(16, AngelPage.giveValueLength());

        AngelPage.setMaster("google.com");
        AngelPage.setSiteName("mas1ter");
        AngelPage.generate();
        System.out.println(AngelPage.giveValue());
        Assert.assertEquals("ziRQzTjM/KBFG@1a", AngelPage.giveValue());
        Assert.assertEquals(16, AngelPage.giveValueLength());
    }
    @Test
    public void shouldGiveDifferentOutputWhenSameInputButDifferentRegister() {
        AngelPage.setMaster("ASDASDASD");
        AngelPage.setSiteName("GOOGLE.COM");
        AngelPage.generate();
        System.out.println(AngelPage.giveValue());
        Assert.assertEquals("zgnkRp9Ivvzo8@1a", AngelPage.giveValue());
        Assert.assertEquals(16, AngelPage.giveValueLength());

        AngelPage.setMaster("asdasdasd");
        AngelPage.setSiteName("google.com");
        AngelPage.generate();
        System.out.println(AngelPage.giveValue());
        Assert.assertEquals("XUjQQ/CBenGJ2@1a", AngelPage.giveValue());
        Assert.assertEquals(16, AngelPage.giveValueLength());

        AngelPage.setMaster("ASDASDASD");
        AngelPage.setSiteName("google.com");
        AngelPage.generate();
        System.out.println(AngelPage.giveValue());
        Assert.assertEquals("4n2vcjq29YAE+@1a", AngelPage.giveValue());
        Assert.assertEquals(16, AngelPage.giveValueLength());

        AngelPage.setMaster("asdasdasd");
        AngelPage.setSiteName("GOOGLE.COM");
        AngelPage.generate();
        System.out.println(AngelPage.giveValue());
        Assert.assertEquals("ciiwxqBGtToBP@1a", AngelPage.giveValue());
        Assert.assertEquals(16, AngelPage.giveValueLength());

        AngelPage.setMaster("ASDASDASD");
        AngelPage.setSiteName("GooGLe.Com");
        AngelPage.generate();
        System.out.println(AngelPage.giveValue());
        Assert.assertEquals("XyopArJoNrixg@1a", AngelPage.giveValue());
        Assert.assertEquals(16, AngelPage.giveValueLength());

        AngelPage.setMaster("asdasdasd");
        AngelPage.setSiteName("gOoglE.cOM");
        AngelPage.generate();
        System.out.println(AngelPage.giveValue());
        Assert.assertEquals("P27eztplagEn+@1a", AngelPage.giveValue());
        Assert.assertEquals(16, AngelPage.giveValueLength());

        AngelPage.setMaster("aSDaSdaSD");
        AngelPage.setSiteName("google.com");
        AngelPage.generate();
        System.out.println(AngelPage.giveValue());
        Assert.assertEquals("jv+5t8QkmICK0@1a", AngelPage.giveValue());
        Assert.assertEquals(16, AngelPage.giveValueLength());

        AngelPage.setMaster("asdASDAsD");
        AngelPage.setSiteName("GOOGLE.COM");
        AngelPage.generate();
        System.out.println(AngelPage.giveValue());
        Assert.assertEquals("5M8hfT+iPPgd9@1a", AngelPage.giveValue());
        Assert.assertEquals(16, AngelPage.giveValueLength());
    }
    @Test
    public void shouldWorkWhenInputNull() {
        AngelPage.setMaster("");
        AngelPage.setSiteName("");
        AngelPage.generate();
        Assert.assertEquals("BaefBs8/Z/cm2@1a", AngelPage.giveValue());
        Assert.assertEquals(16, AngelPage.giveValueLength());

        AngelPage.setMaster("text");
        AngelPage.setSiteName("");
        AngelPage.generate();
        Assert.assertEquals("qALs5fRkY5das@1a", AngelPage.giveValue());
        Assert.assertEquals(16, AngelPage.giveValueLength());

        AngelPage.setMaster("");
        AngelPage.setSiteName("text");
        AngelPage.generate();
        Assert.assertEquals("Rct8qzIFl71fx@1a", AngelPage.giveValue());
        Assert.assertEquals(16, AngelPage.giveValueLength());
    }
    @Test
    public void shouldWorkWhenInputSpaced() {
        AngelPage.setMaster("    ");
        AngelPage.setSiteName("");
        AngelPage.generate();
        Assert.assertEquals("yChD8UVjdMP3X@1a", AngelPage.giveValue());
        Assert.assertEquals(16, AngelPage.giveValueLength());

        AngelPage.setMaster("");
        AngelPage.setSiteName("    ");
        AngelPage.generate();
        Assert.assertEquals("W7ZHoAQxV+oWo@1a", AngelPage.giveValue());
        Assert.assertEquals(16, AngelPage.giveValueLength());

        AngelPage.setMaster("    ");
        AngelPage.setSiteName("text1");
        AngelPage.generate();
        Assert.assertEquals("CqsTf7IUwD7ZW@1a", AngelPage.giveValue());
        Assert.assertEquals(16, AngelPage.giveValueLength());

        AngelPage.setMaster("text1");
        AngelPage.setSiteName("    ");
        AngelPage.generate();
        Assert.assertEquals("vkP/KBX7BcN2e@1a", AngelPage.giveValue());
        Assert.assertEquals(16, AngelPage.giveValueLength());
    }
    @Test
    public void shouldWorkWhenLargeInputUsed() {
        AngelPage.setMaster("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        AngelPage.setSiteName("bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb");
        AngelPage.generate();
        Assert.assertEquals("jFljhvDp1Y9yi@1a", AngelPage.giveValue());
        Assert.assertEquals(16, AngelPage.giveValueLength());
    }
    @Test
    public void shouldWorkWhenInvalidSymbols() {
        AngelPage.setMaster("~!@#$%^&*()_+{}|\":?></\\");
        AngelPage.setSiteName("~!@#$%^&*()_+{}|\":?></\\");
        AngelPage.generate();
        Assert.assertEquals("mWxGz2VYwGgZK@1a", AngelPage.giveValue());
        Assert.assertEquals(16, AngelPage.giveValueLength());
    }
    @Test
    public void shouldntClearUsedInputs() {
        AngelPage.setMaster("blahblah");
        AngelPage.setSiteName("blahblah");
        AngelPage.generate();
        Assert.assertEquals("blahblah", AngelPage.giveMasterValue());
        Assert.assertEquals("blahblah", AngelPage.giveSiteNameValue());
        Assert.assertEquals(16, AngelPage.giveValueLength());
    }
}
