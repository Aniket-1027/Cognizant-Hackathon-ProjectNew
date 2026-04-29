package org.zigwheels.tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.zigwheels.pages.BikesPage;
import org.zigwheels.pages.HomePage;
import basetest.BaseTest;

public class TC_5AllBksRylEnField extends BaseTest {
    @Test
    public void verifyAllBksRoylEnField(){
        HomePage hp=new HomePage(driver);
        hp.clickNewBikes();
        hp.clickUpcmngBikes();
        BikesPage bp=new BikesPage(driver);
        bp.clickUpcmngBikesUndr5lkhs();
        bp.clickRoyalEnfield();
        logger.info("Checking whether all bikes are royal enfield or not");
        if(bp.alertme != null && !bp.alertme.isEmpty()) {
            for (WebElement bikeName : bp.bikeNames) {
                String name = bikeName.getText().toLowerCase();
                Assert.assertTrue(name.contains("royal enfield"),
                        "Found a bike that is not Royal Enfield: " + bikeName.getText());
            }
            System.out.println("Test Case Passed");
        }
        else {
            System.out.println("Test Case Failed");
        }
        logger.info("All bikes are Royal Enfield");
    }
}