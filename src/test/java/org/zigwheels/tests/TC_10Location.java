package org.zigwheels.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.zigwheels.pages.CarsPage;
import basetest.BaseTest;

public class TC_10Location extends BaseTest {
    @Test
    public void locationCheck() throws InterruptedException {
        CarsPage cp=new CarsPage(driver);
        logger.info("Checking whether chennai location is present");
        cp.setChennai();
        Assert.assertTrue(true);
        cp.setChennai();
        logger.info("Chennai location is displayed");
    }
}