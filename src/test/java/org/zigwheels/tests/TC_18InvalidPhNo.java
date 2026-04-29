package org.zigwheels.tests;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import org.zigwheels.pages.HomePage;
import org.zigwheels.pages.LoginPage;
import basetest.BaseTest;

import java.io.IOException;

public class TC_18InvalidPhNo extends BaseTest {
    @Test
    public void enterPhoneNum() throws IOException {
        HomePage hp=new HomePage(driver);
        hp.clickLogin();
        LoginPage lp=new LoginPage(driver);
        wait.until(ExpectedConditions.visibilityOf(lp.google)).click();
        String oldWindow=driver.getWindowHandle();
        lp.enterEmail(p.getProperty("invalidphno"));
        BaseTest.takeScreenShot(driver, "HomePage.png");
        lp.clickNext();
        driver.switchTo().window(oldWindow);
    }
}