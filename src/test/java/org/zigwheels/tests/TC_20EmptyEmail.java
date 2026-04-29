package org.zigwheels.tests;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import org.zigwheels.pages.HomePage;
import org.zigwheels.pages.LoginPage;
import basetest.BaseTest;

public class TC_20EmptyEmail extends BaseTest {
    HomePage hp;
    LoginPage lp;
    @Test
    public void EmptyEmail(){
        hp=new HomePage(driver);
        hp.clickLogin();
        lp=new LoginPage(driver);
        wait.until(ExpectedConditions.visibilityOf(lp.google)).click();
        String oldWindow=driver.getWindowHandle();
        lp.enterEmail("");
        lp.clickNext();
        driver.switchTo().window(oldWindow);
    }
}