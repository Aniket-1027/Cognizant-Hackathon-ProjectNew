package org.zigwheels.tests;

import org.testng.annotations.Test;
import org.zigwheels.pages.BikesPage;
import org.zigwheels.pages.HomePage;
import basetest.BaseTest;
import java.io.IOException;

public class TC_6AllBikes extends BaseTest {
    @Test
    public void m1() throws IOException {
        HomePage hp=new HomePage(driver);
        hp.clickNewBikes();

        hp.clickUpcmngBikes();
        logger.info("Retrieving all the bikes details displayed or not");
        BaseTest.takeScreenShot(driver, "AllBikesUnderBudget.png");
        BikesPage bp=new BikesPage(driver);
        bp.clickUpcmngBikesUndr5lkhs();
        bp.clickRoyalEnfield();
        bp.exportAllBikeDetails();
        logger.info("all the bike details are displayed successfully");
    }
}