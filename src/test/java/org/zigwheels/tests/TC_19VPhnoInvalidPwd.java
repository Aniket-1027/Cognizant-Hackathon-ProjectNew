package org.zigwheels.tests;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import org.zigwheels.pages.HomePage;
import org.zigwheels.pages.LoginPage;
import basetest.BaseTest;

public class TC_19VPhnoInvalidPwd extends BaseTest {
    @Test
    public void enterVPhonoInPwd(){
        HomePage hp=new HomePage(driver);
        hp.clickLogin();
        LoginPage lp=new LoginPage(driver);
        wait.until(ExpectedConditions.visibilityOf(lp.google)).click();
        String oldWindow=driver.getWindowHandle();
        lp.enterEmail(p.getProperty("vphoneno"));
        lp.enterPwd(p.getProperty("inpwd"));
        lp.clickNext();
        driver.switchTo().window(oldWindow);
    }
}