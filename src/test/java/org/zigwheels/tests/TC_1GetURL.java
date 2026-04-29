package org.zigwheels.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.zigwheels.pages.HomePage;
import basetest.BaseTest;
import utilities.Log;

public class TC_1GetURL extends BaseTest {
    @Test
    public void verify_url() throws InterruptedException {
        Log.info("Getting URL of the page");
        String url=p.getProperty("geturl");
        String baseUrl= driver.getCurrentUrl();
        Assert.assertEquals(baseUrl, url,"");
        HomePage hp=new HomePage(driver);
        hp.clickNewBikes();
        hp.clickUpcmngBikes();
        String url1=p.getProperty("getbikesurl");
        String baseUrl1= driver.getCurrentUrl();
        Assert.assertNotEquals(baseUrl1, url1);
        Log.info("URL verification completed");
        System.out.println("URL verification completed");
    }
}