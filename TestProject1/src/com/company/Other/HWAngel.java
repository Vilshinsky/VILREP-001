package com.company.Other;

import com.company.PageObjects.AngelPage;
import com.company.PageObjects.TestHelper;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HWAngel {
    @Before
    public void preconditionsApply() {
        TestHelper.setupChromeAndGo(AngelPage.pageUrl1);
    }


    @Test
    public void shouldGiveDifferentOutputAfterInversion1() {
        AngelPage.setMaster("mas1ter");
        AngelPage.setSiteName("google.com");
        TestHelper.cyclicElementFinding("tbody tr:nth-child(3) input");
        AngelPage.generate();
        Assert.assertEquals(true, AngelPage.cyclicMatchWaiting("/1QFaf1lPgO4S@1a"));
        System.out.println(AngelPage.getValue());
        Assert.assertEquals("/1QFaf1lPgO4S@1a", AngelPage.getValue());
        Assert.assertEquals(16, AngelPage.getValueLength());
    }
    @Test
    public void shouldGiveDifferentOutputAfterInversion2() {
        AngelPage.setMaster("google.com");
        AngelPage.setSiteName("mas1ter");
        TestHelper.cyclicElementFinding("tbody tr:nth-child(3) input");
        AngelPage.generate();
        Assert.assertEquals(true, AngelPage.cyclicMatchWaiting("ziRQzTjM/KBFG@1a"));
        System.out.println(AngelPage.getValue());
        Assert.assertEquals("ziRQzTjM/KBFG@1a", AngelPage.getValue());
        Assert.assertEquals(16, AngelPage.getValueLength());
    }
    @Test
    public void shouldGiveDifferentOutputWhenSameInputButDifferentRegisterHighHigh() {
        AngelPage.setMaster("ASDASDASD");
        AngelPage.setSiteName("GOOGLE.COM");
        TestHelper.cyclicElementFinding("tbody tr:nth-child(3) input");
        AngelPage.generate();
        Assert.assertEquals(true, AngelPage.cyclicMatchWaiting("zgnkRp9Ivvzo8@1a"));
        System.out.println(AngelPage.getValue());
        Assert.assertEquals("zgnkRp9Ivvzo8@1a", AngelPage.getValue());
        Assert.assertEquals(16, AngelPage.getValueLength());
    }
    @Test
    public void shouldGiveDifferentOutputWhenSameInputButDifferentRegisterLowLow() {
        AngelPage.setMaster("asdasdasd");
        AngelPage.setSiteName("google.com");
        TestHelper.cyclicElementFinding("tbody tr:nth-child(3) input");
        AngelPage.generate();
        Assert.assertEquals(true, AngelPage.cyclicMatchWaiting("XUjQQ/CBenGJ2@1a"));
        System.out.println(AngelPage.getValue());
        Assert.assertEquals("XUjQQ/CBenGJ2@1a", AngelPage.getValue());
        Assert.assertEquals(16, AngelPage.getValueLength());
    }
    @Test
    public void shouldGiveDifferentOutputWhenSameInputButDifferentRegisterHighLow() {
        AngelPage.setMaster("ASDASDASD");
        AngelPage.setSiteName("google.com");
        TestHelper.cyclicElementFinding("tbody tr:nth-child(3) input");
        AngelPage.generate();
        Assert.assertEquals(true, AngelPage.cyclicMatchWaiting("4n2vcjq29YAE+@1a"));
        System.out.println(AngelPage.getValue());
        Assert.assertEquals("4n2vcjq29YAE+@1a", AngelPage.getValue());
        Assert.assertEquals(16, AngelPage.getValueLength());
    }
    @Test
    public void shouldGiveDifferentOutputWhenSameInputButDifferentRegisterLowHigh() {
        AngelPage.setMaster("asdasdasd");
        AngelPage.setSiteName("GOOGLE.COM");
        TestHelper.cyclicElementFinding("tbody tr:nth-child(3) input");
        AngelPage.generate();
        Assert.assertEquals(true, AngelPage.cyclicMatchWaiting("ciiwxqBGtToBP@1a"));
        System.out.println(AngelPage.getValue());
        Assert.assertEquals("ciiwxqBGtToBP@1a", AngelPage.getValue());
        Assert.assertEquals(16, AngelPage.getValueLength());
    }
    @Test
    public void shouldGiveDifferentOutputWhenSameInputButDifferentRegisterHighMixed() {
        AngelPage.setMaster("ASDASDASD");
        AngelPage.setSiteName("GooGLe.Com");
        TestHelper.cyclicElementFinding("tbody tr:nth-child(3) input");
        AngelPage.generate();
        Assert.assertEquals(true, AngelPage.cyclicMatchWaiting("XyopArJoNrixg@1a"));
        System.out.println(AngelPage.getValue());
        Assert.assertEquals("XyopArJoNrixg@1a", AngelPage.getValue());
        Assert.assertEquals(16, AngelPage.getValueLength());
    }
    @Test
    public void shouldGiveDifferentOutputWhenSameInputButDifferentRegisterLowMixed() {
        AngelPage.setMaster("asdasdasd");
        AngelPage.setSiteName("gOoglE.cOM");
        TestHelper.cyclicElementFinding("tbody tr:nth-child(3) input");
        AngelPage.generate();
        Assert.assertEquals(true, AngelPage.cyclicMatchWaiting("P27eztplagEn+@1a"));
        System.out.println(AngelPage.getValue());
        Assert.assertEquals("P27eztplagEn+@1a", AngelPage.getValue());
        Assert.assertEquals(16, AngelPage.getValueLength());
    }
    @Test
    public void shouldGiveDifferentOutputWhenSameInputButDifferentRegisterMixedLow() {
        AngelPage.setMaster("aSDaSdaSD");
        AngelPage.setSiteName("google.com");
        TestHelper.cyclicElementFinding("tbody tr:nth-child(3) input");
        AngelPage.generate();
        Assert.assertEquals(true, AngelPage.cyclicMatchWaiting("jv+5t8QkmICK0@1a"));
        System.out.println(AngelPage.getValue());
        Assert.assertEquals("jv+5t8QkmICK0@1a", AngelPage.getValue());
        Assert.assertEquals(16, AngelPage.getValueLength());
    }
    @Test
    public void shouldGiveDifferentOutputWhenSameInputButDifferentRegisterMixedHigh() {
        AngelPage.setMaster("asdASDAsD");
        AngelPage.setSiteName("GOOGLE.COM");
        TestHelper.cyclicElementFinding("tbody tr:nth-child(3) input");
        AngelPage.generate();
        Assert.assertEquals(true, AngelPage.cyclicMatchWaiting("5M8hfT+iPPgd9@1a"));
        System.out.println(AngelPage.getValue());
        Assert.assertEquals("5M8hfT+iPPgd9@1a", AngelPage.getValue());
        Assert.assertEquals(16, AngelPage.getValueLength());
    }
    @Test
    public void shouldGiveDifferentOutputWhenSameInputButDifferentRegisterMixedMixed() {
        AngelPage.setMaster("asdASDAsD");
        AngelPage.setSiteName("GoOgLE.COm");
        TestHelper.cyclicElementFinding("tbody tr:nth-child(3) input");
        AngelPage.generate();
        Assert.assertEquals(true, AngelPage.cyclicMatchWaiting("zMnetSZT+GDzz@1a"));
        System.out.println(AngelPage.getValue());
        Assert.assertEquals("zMnetSZT+GDzz@1a", AngelPage.getValue());
        Assert.assertEquals(16, AngelPage.getValueLength());
    }
    @Test
    public void shouldWorkWhenAllInputNull() {
        AngelPage.setMaster("");
        AngelPage.setSiteName("");
        TestHelper.cyclicElementFinding("tbody tr:nth-child(3) input");
        AngelPage.generate();
        Assert.assertEquals(true, AngelPage.cyclicMatchWaiting("BaefBs8/Z/cm2@1a"));
        Assert.assertEquals("BaefBs8/Z/cm2@1a", AngelPage.getValue());
        Assert.assertEquals(16, AngelPage.getValueLength());
    }
    @Test
    public void shouldWorkWhenSiteInputNull() {
        AngelPage.setMaster("text");
        AngelPage.setSiteName("");
        TestHelper.cyclicElementFinding("tbody tr:nth-child(3) input");
        AngelPage.generate();
        Assert.assertEquals(true, AngelPage.cyclicMatchWaiting("qALs5fRkY5das@1a"));
        Assert.assertEquals("qALs5fRkY5das@1a", AngelPage.getValue());
        Assert.assertEquals(16, AngelPage.getValueLength());
    }
    @Test
    public void shouldWorkWhenMasterInputNull() {
        AngelPage.setMaster("");
        AngelPage.setSiteName("text");
        TestHelper.cyclicElementFinding("tbody tr:nth-child(3) input");
        AngelPage.generate();
        Assert.assertEquals(true, AngelPage.cyclicMatchWaiting("Rct8qzIFl71fx@1a"));
        Assert.assertEquals("Rct8qzIFl71fx@1a", AngelPage.getValue());
        Assert.assertEquals(16, AngelPage.getValueLength());
    }
    @Test
    public void shouldWorkWhenInputMasterSpacedInputSiteNull() {
        AngelPage.setMaster("    ");
        AngelPage.setSiteName("");
        TestHelper.cyclicElementFinding("tbody tr:nth-child(3) input");
        AngelPage.generate();
        Assert.assertEquals(true, AngelPage.cyclicMatchWaiting("yChD8UVjdMP3X@1a"));
        Assert.assertEquals("yChD8UVjdMP3X@1a", AngelPage.getValue());
        Assert.assertEquals(16, AngelPage.getValueLength());
    }
    @Test
    public void shouldWorkWhenInputSiteSpacedInputMasterNull() {
        AngelPage.setMaster("");
        AngelPage.setSiteName("    ");
        TestHelper.cyclicElementFinding("tbody tr:nth-child(3) input");
        AngelPage.generate();
        Assert.assertEquals(true, AngelPage.cyclicMatchWaiting("W7ZHoAQxV+oWo@1a"));
        Assert.assertEquals("W7ZHoAQxV+oWo@1a", AngelPage.getValue());
        Assert.assertEquals(16, AngelPage.getValueLength());
    }
    @Test
    public void shouldWorkWhenInputMasterSpaced() {
        AngelPage.setMaster("    ");
        AngelPage.setSiteName("text1");
        TestHelper.cyclicElementFinding("tbody tr:nth-child(3) input");
        AngelPage.generate();
        Assert.assertEquals(true, AngelPage.cyclicMatchWaiting("CqsTf7IUwD7ZW@1a"));
        Assert.assertEquals("CqsTf7IUwD7ZW@1a", AngelPage.getValue());
        Assert.assertEquals(16, AngelPage.getValueLength());
    }
    @Test
    public void shouldWorkWhenInputSiteSpaced() {
        AngelPage.setMaster("text1");
        AngelPage.setSiteName("    ");
        TestHelper.cyclicElementFinding("tbody tr:nth-child(3) input");
        AngelPage.generate();
        Assert.assertEquals(true, AngelPage.cyclicMatchWaiting("vkP/KBX7BcN2e@1a"));
        Assert.assertEquals("vkP/KBX7BcN2e@1a", AngelPage.getValue());
        Assert.assertEquals(16, AngelPage.getValueLength());
    }
    @Test
    public void shouldWorkWhenLargeInputUsed() {
        AngelPage.setMaster("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        AngelPage.setSiteName("bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb");
        TestHelper.cyclicElementFinding("tbody tr:nth-child(3) input");
        AngelPage.generate();
        Assert.assertEquals(true, AngelPage.cyclicMatchWaiting("jFljhvDp1Y9yi@1a"));
        Assert.assertEquals("jFljhvDp1Y9yi@1a", AngelPage.getValue());
        Assert.assertEquals(16, AngelPage.getValueLength());
    }
    @Test
    public void shouldWorkWhenInvalidSymbols() {
        AngelPage.setMaster("~!@#$%^&*()_+{}|\":?></\\");
        AngelPage.setSiteName("~!@#$%^&*()_+{}|\":?></\\");
        TestHelper.cyclicElementFinding("tbody tr:nth-child(3) input");
        AngelPage.generate();
        Assert.assertEquals(true, AngelPage.cyclicMatchWaiting("mWxGz2VYwGgZK@1a"));
        Assert.assertEquals("mWxGz2VYwGgZK@1a", AngelPage.getValue());
        Assert.assertEquals(16, AngelPage.getValueLength());
    }
    @Test
    public void shouldntClearUsedInputs() {
        AngelPage.setMaster("blahblah");
        AngelPage.setSiteName("blahblah");
        TestHelper.cyclicElementFinding("tbody tr:nth-child(3) input");
        AngelPage.generate();
        Assert.assertEquals("blahblah", AngelPage.getMasterValue());
        Assert.assertEquals("blahblah", AngelPage.getSiteNameValue());
    }
    @Test
    public void shouldntDisableInputMaster() {
        AngelPage.setMaster("blahblah");
        AngelPage.setSiteName("blahblah");
        TestHelper.cyclicElementFinding("tbody tr:nth-child(3) input");
        AngelPage.generate();
        Assert.assertEquals(true, AngelPage.isElementEnabled("tbody tr:nth-child(1) input"));
    }
    @Test
         public void shouldntDisableInputSite() {
        AngelPage.setMaster("blahblah");
        AngelPage.setSiteName("blahblah");
        TestHelper.cyclicElementFinding("tbody tr:nth-child(3) input");
        AngelPage.generate();
        Assert.assertEquals(true, AngelPage.isElementEnabled("tbody tr:nth-child(2) input"));
    }
    @Test
         public void shouldntDisableSubmitButton() {
        AngelPage.setMaster("blahblah");
        AngelPage.setSiteName("blahblah");
        TestHelper.cyclicElementFinding("tbody tr:nth-child(3) input");
        AngelPage.generate();
        Assert.assertEquals(true, AngelPage.isElementEnabled("tbody tr:nth-child(3) input"));
    }
    @Test
    public void shouldntDisableInputGenerated() {
        AngelPage.setMaster("blahblah");
        AngelPage.setSiteName("blahblah");
        TestHelper.cyclicElementFinding("tbody tr:nth-child(3) input");
        AngelPage.generate();
        Assert.assertEquals(true, AngelPage.isElementEnabled("tbody tr:nth-child(4) input"));
    }
    @Test
    public void correctInputTitlesBeforeAction() {
        Assert.assertEquals("Your master password", AngelPage.masterTitle());
        Assert.assertEquals("Site name", AngelPage.siteTitle());
        TestHelper.cyclicElementFinding("tbody tr:nth-child(3) input");
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
        TestHelper.cyclicElementFinding("tbody tr:nth-child(3) input");
        AngelPage.generate();
        Assert.assertEquals("Your master password", AngelPage.masterTitle());
        Assert.assertEquals("Site name", AngelPage.siteTitle());
        Assert.assertEquals("Generate", AngelPage.generateButtonTitle());
        Assert.assertEquals("Generated password", AngelPage.generatedTitle());
    }
}
