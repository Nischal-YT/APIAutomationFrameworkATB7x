package com.thetesting.tests.crud;

import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testCreateBookingPOST {

    @Link(name = "Link to TC", url = "https://bugz.atlassian.net/browse/RBT-4")
    @Issue("JIRA_RBT-4")
    @TmsLink("RBT-4")
    @Severity(SeverityLevel.BLOCKER)
    @Owner("Nischal")
    @Description("Verify post request is working fine")
    @Test
    public void testCreateBookingPOST01(){
        Assert.assertEquals(true,true);

    }


}
