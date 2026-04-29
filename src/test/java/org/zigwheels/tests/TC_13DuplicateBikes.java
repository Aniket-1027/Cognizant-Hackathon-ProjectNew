package org.zigwheels.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.zigwheels.pages.BikesPage;
import org.zigwheels.pages.HomePage;
import basetest.BaseTest;

public class TC_13DuplicateBikes extends BaseTest{

    @Test
    public void findDuplicateBikes(){
        logger.info("To check whether there are any duplicates are present");
        HomePage hp=new HomePage(driver);
        hp.clickNewBikes();
        hp.clickUpcmngBikes();
        BikesPage bp=new BikesPage(driver);
        bp.clickUpcmngBikesUndr5lkhs();
        bp.clickRoyalEnfield();
        bp.checkBikes();
        Assert.assertEquals(bp.oldcnt,bp.newcnt,"No Duplicate Bikes Found");
        logger.info("No duplicates are present");
    }
}