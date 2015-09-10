package com.company.Other;

import com.company.PageObjects.AngelPage;
import com.company.PageObjects.TestHelper;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HWAngel {
    @Before
    public void preconditionsApply() {
        TestHelper.setupAndGo(AngelPage.pageUrl7);
    }
    @After
    public void postconditionsApply() {
        TestHelper.quit();
    }

    @Test
    public void shouldGiveDifferentOutputAfterInversion1() {
        AngelPage.setMaster("mas1ter");
        AngelPage.setSiteName("google.com");
        AngelPage.generate();
        Assert.assertEquals(true, TestHelper.cyclicMatchWaiting("/1QFaf1lPgO4S@1a"));
        System.out.println(AngelPage.giveValue());
        Assert.assertEquals("/1QFaf1lPgO4S@1a", AngelPage.giveValue());
        Assert.assertEquals(16, AngelPage.giveValueLength());
    }
    @Test
    public void shouldGiveDifferentOutputAfterInversion2() {
        AngelPage.setMaster("google.com");
        AngelPage.setSiteName("mas1ter");
        AngelPage.generate();
        Assert.assertEquals(true, TestHelper.cyclicMatchWaiting("ziRQzTjM/KBFG@1a"));
        System.out.println(AngelPage.giveValue());
        Assert.assertEquals("ziRQzTjM/KBFG@1a", AngelPage.giveValue());
        Assert.assertEquals(16, AngelPage.giveValueLength());
    }
    @Test
    public void shouldGiveDifferentOutputWhenSameInputButDifferentRegisterHighHigh() {
        AngelPage.setMaster("ASDASDASD");
        AngelPage.setSiteName("GOOGLE.COM");
        AngelPage.generate();
        Assert.assertEquals(true, TestHelper.cyclicMatchWaiting("zgnkRp9Ivvzo8@1a"));
        System.out.println(AngelPage.giveValue());
        Assert.assertEquals("zgnkRp9Ivvzo8@1a", AngelPage.giveValue());
        Assert.assertEquals(16, AngelPage.giveValueLength());
    }
    @Test
    public void shouldGiveDifferentOutputWhenSameInputButDifferentRegisterLowLow() {
        AngelPage.setMaster("asdasdasd");
        AngelPage.setSiteName("google.com");
        AngelPage.generate();
        Assert.assertEquals(true, TestHelper.cyclicMatchWaiting("XUjQQ/CBenGJ2@1a"));
        System.out.println(AngelPage.giveValue());
        Assert.assertEquals("XUjQQ/CBenGJ2@1a", AngelPage.giveValue());
        Assert.assertEquals(16, AngelPage.giveValueLength());
    }
    @Test
    public void shouldGiveDifferentOutputWhenSameInputButDifferentRegisterHighLow() {
        AngelPage.setMaster("ASDASDASD");
        AngelPage.setSiteName("google.com");
        AngelPage.generate();
        Assert.assertEquals(true, TestHelper.cyclicMatchWaiting("4n2vcjq29YAE+@1a"));
        System.out.println(AngelPage.giveValue());
        Assert.assertEquals("4n2vcjq29YAE+@1a", AngelPage.giveValue());
        Assert.assertEquals(16, AngelPage.giveValueLength());
    }
    @Test
    public void shouldGiveDifferentOutputWhenSameInputButDifferentRegisterLowHigh() {
        AngelPage.setMaster("asdasdasd");
        AngelPage.setSiteName("GOOGLE.COM");
        AngelPage.generate();
        Assert.assertEquals(true, TestHelper.cyclicMatchWaiting("ciiwxqBGtToBP@1a"));
        System.out.println(AngelPage.giveValue());
        Assert.assertEquals("ciiwxqBGtToBP@1a", AngelPage.giveValue());
        Assert.assertEquals(16, AngelPage.giveValueLength());
    }
    @Test
    public void shouldGiveDifferentOutputWhenSameInputButDifferentRegisterHighMixed() {
        AngelPage.setMaster("ASDASDASD");
        AngelPage.setSiteName("GooGLe.Com");
        AngelPage.generate();
        Assert.assertEquals(true, TestHelper.cyclicMatchWaiting("XyopArJoNrixg@1a"));
        System.out.println(AngelPage.giveValue());
        Assert.assertEquals("XyopArJoNrixg@1a", AngelPage.giveValue());
        Assert.assertEquals(16, AngelPage.giveValueLength());
    }
    @Test
    public void shouldGiveDifferentOutputWhenSameInputButDifferentRegisterLowMixed() {
        AngelPage.setMaster("asdasdasd");
        AngelPage.setSiteName("gOoglE.cOM");
        AngelPage.generate();
        Assert.assertEquals(true, TestHelper.cyclicMatchWaiting("P27eztplagEn+@1a"));
        System.out.println(AngelPage.giveValue());
        Assert.assertEquals("P27eztplagEn+@1a", AngelPage.giveValue());
        Assert.assertEquals(16, AngelPage.giveValueLength());
    }
    @Test
    public void shouldGiveDifferentOutputWhenSameInputButDifferentRegisterMixedLow() {
        AngelPage.setMaster("aSDaSdaSD");
        AngelPage.setSiteName("google.com");
        AngelPage.generate();
        Assert.assertEquals(true, TestHelper.cyclicMatchWaiting("jv+5t8QkmICK0@1a"));
        System.out.println(AngelPage.giveValue());
        Assert.assertEquals("jv+5t8QkmICK0@1a", AngelPage.giveValue());
        Assert.assertEquals(16, AngelPage.giveValueLength());
    }
    @Test
    public void shouldGiveDifferentOutputWhenSameInputButDifferentRegisterMixedHigh() {
        AngelPage.setMaster("asdASDAsD");
        AngelPage.setSiteName("GOOGLE.COM");
        AngelPage.generate();
        Assert.assertEquals(true, TestHelper.cyclicMatchWaiting("5M8hfT+iPPgd9@1a"));
        System.out.println(AngelPage.giveValue());
        Assert.assertEquals("5M8hfT+iPPgd9@1a", AngelPage.giveValue());
        Assert.assertEquals(16, AngelPage.giveValueLength());
    }
    @Test
    public void shouldGiveDifferentOutputWhenSameInputButDifferentRegisterMixedMixed() {
        AngelPage.setMaster("asdASDAsD");
        AngelPage.setSiteName("GoOgLE.COm");
        AngelPage.generate();
        Assert.assertEquals(true, TestHelper.cyclicMatchWaiting("zMnetSZT+GDzz@1a"));
        System.out.println(AngelPage.giveValue());
        Assert.assertEquals("zMnetSZT+GDzz@1a", AngelPage.giveValue());
        Assert.assertEquals(16, AngelPage.giveValueLength());
    }
    @Test
    public void shouldWorkWhenAllInputNull() {
        AngelPage.setMaster("");
        AngelPage.setSiteName("");
        AngelPage.generate();
        Assert.assertEquals(true, TestHelper.cyclicMatchWaiting("BaefBs8/Z/cm2@1a"));
        Assert.assertEquals("BaefBs8/Z/cm2@1a", AngelPage.giveValue());
        Assert.assertEquals(16, AngelPage.giveValueLength());
    }
    @Test
    public void shouldWorkWhenSiteInputNull() {
        AngelPage.setMaster("text");
        AngelPage.setSiteName("");
        AngelPage.generate();
        Assert.assertEquals(true, TestHelper.cyclicMatchWaiting("qALs5fRkY5das@1a"));
        Assert.assertEquals("qALs5fRkY5das@1a", AngelPage.giveValue());
        Assert.assertEquals(16, AngelPage.giveValueLength());
    }
    @Test
    public void shouldWorkWhenMasterInputNull() {
        AngelPage.setMaster("");
        AngelPage.setSiteName("text");
        AngelPage.generate();
        Assert.assertEquals(true, TestHelper.cyclicMatchWaiting("Rct8qzIFl71fx@1a"));
        Assert.assertEquals("Rct8qzIFl71fx@1a", AngelPage.giveValue());
        Assert.assertEquals(16, AngelPage.giveValueLength());
    }
    @Test
    public void shouldWorkWhenInputMasterSpacedInputSiteNull() {
        AngelPage.setMaster("    ");
        AngelPage.setSiteName("");
        AngelPage.generate();
        Assert.assertEquals(true, TestHelper.cyclicMatchWaiting("yChD8UVjdMP3X@1a"));
        Assert.assertEquals("yChD8UVjdMP3X@1a", AngelPage.giveValue());
        Assert.assertEquals(16, AngelPage.giveValueLength());
    }
    @Test
    public void shouldWorkWhenInputSiteSpacedInputMasterNull() {
        AngelPage.setMaster("");
        AngelPage.setSiteName("    ");
        AngelPage.generate();
        Assert.assertEquals(true, TestHelper.cyclicMatchWaiting("W7ZHoAQxV+oWo@1a"));
        Assert.assertEquals("W7ZHoAQxV+oWo@1a", AngelPage.giveValue());
        Assert.assertEquals(16, AngelPage.giveValueLength());
    }
    @Test
    public void shouldWorkWhenInputMasterSpaced() {
        AngelPage.setMaster("    ");
        AngelPage.setSiteName("text1");
        AngelPage.generate();
        Assert.assertEquals(true, TestHelper.cyclicMatchWaiting("CqsTf7IUwD7ZW@1a"));
        Assert.assertEquals("CqsTf7IUwD7ZW@1a", AngelPage.giveValue());
        Assert.assertEquals(16, AngelPage.giveValueLength());
    }
    @Test
    public void shouldWorkWhenInputSiteSpaced() {
        AngelPage.setMaster("text1");
        AngelPage.setSiteName("    ");
        AngelPage.generate();
        Assert.assertEquals(true, TestHelper.cyclicMatchWaiting("vkP/KBX7BcN2e@1a"));
        Assert.assertEquals("vkP/KBX7BcN2e@1a", AngelPage.giveValue());
        Assert.assertEquals(16, AngelPage.giveValueLength());
    }
    @Test
    public void shouldWorkWhenLargeInputUsed() {
        AngelPage.setMaster("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        AngelPage.setSiteName("bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb");
        AngelPage.generate();
        Assert.assertEquals(true, TestHelper.cyclicMatchWaiting("jFljhvDp1Y9yi@1a"));
        Assert.assertEquals("jFljhvDp1Y9yi@1a", AngelPage.giveValue());
        Assert.assertEquals(16, AngelPage.giveValueLength());
    }
    @Test
    public void shouldWorkWhenInvalidSymbols() {
        AngelPage.setMaster("~!@#$%^&*()_+{}|\":?></\\");
        AngelPage.setSiteName("~!@#$%^&*()_+{}|\":?></\\");
        AngelPage.generate();
        Assert.assertEquals(true, TestHelper.cyclicMatchWaiting("mWxGz2VYwGgZK@1a"));
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
    }
    @Test
    public void shouldntDisableInputMaster() {
        AngelPage.setMaster("blahblah");
        AngelPage.setSiteName("blahblah");
        AngelPage.generate();
        Assert.assertEquals(true, AngelPage.masterEnabled());
    }
    @Test
         public void shouldntDisableInputSite() {
        AngelPage.setMaster("blahblah");
        AngelPage.setSiteName("blahblah");
        AngelPage.generate();
        Assert.assertEquals(true, AngelPage.siteEnabled());
    }
    @Test
    public void shouldntDisableInputGenerated() {
        AngelPage.setMaster("blahblah");
        AngelPage.setSiteName("blahblah");
        AngelPage.generate();
        Assert.assertEquals(true, AngelPage.generatedEnabled());
    }
    @Test
    public void correctInputTitlesBeforeAction() {
        Assert.assertEquals("Your master password", AngelPage.masterTitle());
        Assert.assertEquals("Site name", AngelPage.siteTitle());
        Assert.assertEquals("Generate", AngelPage.generateButtonTitle());
        Assert.assertEquals("Generated password", AngelPage.generatedTitle());
        AngelPage.setMaster("blahblah");
        AngelPage.setSiteName("blahblah");
        AngelPage.generate();
    }
    @Test
    public void correctInputTitlesAfterAction() {
        AngelPage.setMaster("blahblah");
        AngelPage.setSiteName("blahblah");
        AngelPage.generate();
        Assert.assertEquals("Your master password", AngelPage.masterTitle());
        Assert.assertEquals("Site name", AngelPage.siteTitle());
        Assert.assertEquals("Generate", AngelPage.generateButtonTitle());
        Assert.assertEquals("Generated password", AngelPage.generatedTitle());
    }
}
