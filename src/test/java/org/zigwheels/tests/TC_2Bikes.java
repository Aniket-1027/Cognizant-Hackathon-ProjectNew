package org.zigwheels.tests;

import org.testng.annotations.Test;
import org.zigwheels.pages.BikesPage;
import org.zigwheels.pages.HomePage;
import basetest.BaseTest;
import java.io.IOException;

public class TC_2Bikes extends BaseTest {
    @Test
    public void BikeDetails() throws IOException {
        logger.info("To retrieve the data of the Royal Enfield Bikes under 5 lakhs");
        HomePage hp=new HomePage(driver);
        hp.clickNewBikes();
        hp.clickUpcmngBikes();
        BikesPage bp=new BikesPage(driver);
        bp.clickUpcmngBikesUndr5lkhs();
        BaseTest.takeScreenShot(driver, "HomePage.png");
        bp.clickRoyalEnfield();
        bp.exportDetailsToExcel();
        logger.info("Retrieved Bike Details Successfully");
        System.out.println("Retrieved Bike Details Successfully");
    }
}