package org.zigwheels.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.zigwheels.pages.HomePage;
import org.zigwheels.pages.LoginPage;
import basetest.BaseTest;

public class TC_15GoogleDIsplayed extends BaseTest {
    @Test
    public void isGoogleDisplayed(){
        HomePage hp=new HomePage(driver);
        hp.clickLogin();
        LoginPage lp=new LoginPage(driver);
        boolean google=lp.google.isDisplayed();
        Assert.assertTrue(true);
    }
}