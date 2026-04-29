package org.zigwheels.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.zigwheels.pages.BikesPage;
import basetest.BaseTest;

public class TC_3UpcomingDisplayed extends BaseTest {
    @Test
    public void upcomingBikesRange(){
        logger.info("Checking whether Upcoming Bikes displayed or not");
        BikesPage bp=new BikesPage(driver);
        boolean val=bp.upcmngBikesUndr5lkhs.isDisplayed();
        Assert.assertTrue(val,"Upcoming Bikes Under 5 Lakhs");
        logger.info("Upcoming Bikes Displayed Successfully");
    }
}