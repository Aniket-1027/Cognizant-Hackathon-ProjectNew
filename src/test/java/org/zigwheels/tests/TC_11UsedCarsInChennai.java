package org.zigwheels.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.zigwheels.pages.CarsPage;
import org.zigwheels.pages.HomePage;
import basetest.BaseTest;

public class TC_11UsedCarsInChennai extends BaseTest {
    @Test
    public void verifyusedCarsInChennai(){
        logger.info("To check whether used cars in chennai is displayed or not");
        HomePage hp=new HomePage(driver);
        hp.clickMore();
        hp.clickUsedCars();
        CarsPage cp=new CarsPage(driver);
        cp.setChennai();
        boolean usedCars=cp.usedCarsInChennai.isDisplayed();
        Assert.assertTrue(usedCars);
        logger.info("Used cars option is displayed successfully");
    }
}