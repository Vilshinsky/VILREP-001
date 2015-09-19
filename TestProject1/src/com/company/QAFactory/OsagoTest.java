package com.company.QAFactory;

import com.company.Common.TestHelper;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Admin on 15.09.15.
 */
public class OsagoTest {
    @Before
    public void preconditionsApply() {
        TestHelper.setupChromeAndGo(OsagoPage.pageUrl);
    }
    @After
    public void postconditionsApply() {
        TestHelper.quit();
    }

    @Test
    public void shouldShowUticoCompanyForLightVehicleEngine1600() {
        OsagoPage.setVehicle("легковой автомобиль");
        OsagoPage.setEngineCapacity("объем двигателя до 1600 см³ включительно");
        Assert.assertTrue(OsagoPage.checkCompanyExistInList());
        Assert.assertEquals("777 грн.", OsagoPage.checkAmount());
    }
}
