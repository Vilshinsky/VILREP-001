package com.company.QAFactory;

import com.company.Common.TestHelper;

public class Massives {
    public static void checkAutocompleteValuesFrom() {
        String[] expected = {"Kyanivka","Kybyntsi","Kychyranky","Kyiv","Kyivska Rusanivka"};
        for(int i=0; i <= 499; i++) {
            TestHelper.waitElementByXpath("//blablabla").sendKeys(expected[i]);
            TestHelper.waitElementByXpath("//blabla").click();
            TestHelper.waitElementByXpath("//bla");

        }
    }
}
