package org.zigwheels.tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.zigwheels.pages.BikesPage;
import org.zigwheels.pages.HomePage;
import basetest.BaseTest;

public class TC_4AllBksUndr5lkhs extends BaseTest {

    @Test
    public void verifyBikesPrice(){
        HomePage hp=new HomePage(driver);
        hp.clickNewBikes();
        hp.clickUpcmngBikes();
        BikesPage bp=new BikesPage(driver);
        logger.info("Checking whether Bikes under five lakhs displayed or not");
        if(bp.alertme != null && !bp.alertme.isEmpty()) {
            for (WebElement bikePrice : bp.bikePrice) {
                String priceText = bikePrice.getText().replaceAll("[^0-9]", ""); // remove non-numeric chars
                int price = Integer.parseInt(priceText);
                Assert.assertTrue(price < 500000,
                        "Found a bike with price >= 5 lakhs: " + bikePrice.getText());
            }
            System.out.println("Test Case Passed");
        }
        else {
            System.out.println("Test Case Failed");
        }
        logger.info("Bikes under Five lakhs are displayed");
    }
}