package org.zigwheels.tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.zigwheels.pages.BikesPage;
import org.zigwheels.pages.HomePage;
import basetest.BaseTest;

public class TC_7AlrtMe extends BaseTest {
    @Test
    public void verifyAlertMetxt() {
        HomePage hp = new HomePage(driver);
        hp.clickNewBikes();
        hp.clickUpcmngBikes();
        BikesPage bp = new BikesPage(driver);
        bp.clickUpcmngBikesUndr5lkhs();
        bp.clickRoyalEnfield();
        logger.info("Checking whether Alert me option is displayed or not");
        if(bp.alertme != null && !bp.alertme.isEmpty()) {
            for (WebElement ele : bp.alertme) {
                Assert.assertTrue(ele.isDisplayed(), "Alert Me button not displayed");
            }
            System.out.println("Test Case Passed");
        }
        else {
            System.out.println("Test Case Failed");
        }
        logger.info("ALert me option displayed sucessfully");
    }
}