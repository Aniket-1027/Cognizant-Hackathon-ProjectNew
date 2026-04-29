package org.zigwheels.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.zigwheels.pages.HomePage;
import basetest.BaseTest;

public class TC_9CarsURL extends BaseTest {
    @Test
    public void verify_carsUrl(){
        HomePage hp=new HomePage(driver);
        hp.clickMore();
        hp.clickUsedCars();
        logger.info("Whether the car url is valid or not");
        String url=p.getProperty("carsurl");
        String baseUrl= driver.getCurrentUrl();
        Assert.assertEquals(baseUrl, url);

        String url1=p.getProperty("carsinvurl");
        String baseUrl1= driver.getCurrentUrl();
        Assert.assertNotEquals(baseUrl1, url1);
        logger.info("Cars url verified Sucessfully");
    }
}