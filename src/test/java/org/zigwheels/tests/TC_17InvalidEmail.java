package org.zigwheels.tests;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import org.zigwheels.pages.HomePage;
import org.zigwheels.pages.LoginPage;
import basetest.BaseTest;

import java.io.IOException;

public class TC_17InvalidEmail extends BaseTest {
    @Test
    public void enterInvalidEmail() throws InterruptedException, IOException {
        HomePage hp=new HomePage(driver);
        hp.clickLogin();
        LoginPage lp=new LoginPage(driver);
        wait.until(ExpectedConditions.visibilityOf(lp.google)).click();
        Thread.sleep(2000);
        BaseTest.takeScreenShot(driver, "Google.png");
        lp.clickGoogle();
        String oldWindow=driver.getWindowHandle();
        lp.enterEmail(p.getProperty("invalidemail"));
        lp.clickNext();
        driver.switchTo().window(oldWindow);
    }
}