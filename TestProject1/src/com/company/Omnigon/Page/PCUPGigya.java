package com.company.Omnigon.Page;

import com.company.Common.TestHelper;
import org.openqa.selenium.interactions.Actions;

public class PCUPGigya {
    public static void goToFavorites() {
        cursorOverAvatar();
        cyclicWaitingDropdownOpens();
        TestHelper.waitElementByXpath("//a[text()='Manage profile']").click();
        TestHelper.waitElementByXpath("//*[@id='gigya-profile-form']/div[1]/a[3]").click();
    }
    public static void cursorOverAvatar() {
        TestHelper.waitSec(3);
        Actions actions = new Actions(TestHelper.driver);
        actions.moveToElement(TestHelper.waitElementByXpath("//div[contains(@class,'user-menu')]"))
                .build().perform();
    }
    public static boolean cyclicWaitingDropdownOpens() {
        for (int i = 0; i < 250; i++)    {
            if (TestHelper.waitElementByXpath("//a[text()='Manage profile']").isDisplayed()) {
                break;
            }
            TestHelper.waitMsec(1);
        }
        return true;
    }
}
