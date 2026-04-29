package org.zigwheels.tests;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import org.zigwheels.pages.HomePage;
import org.zigwheels.pages.LoginPage;
import basetest.BaseTest;

public class TC_16VEmailInPwd extends BaseTest {
    @Test
    public void ValidAndInvalid(){
        HomePage hp=new HomePage(driver);
        logger.info("To verify with the valid email and invalid password");
        hp.clickLogin();
        LoginPage lp=new LoginPage(driver);
        String oldWindow=driver.getWindowHandle();
        wait.until(ExpectedConditions.visibilityOf(lp.google)).click();
//        lp.enterEmail("srilaxmi1104@gmail.com");
        lp.enterEmail(p.getProperty("vemail"));
        lp.clickNext();
        lp.enterPwd(p.getProperty("invalidpwd"));
        driver.switchTo().window(oldWindow);
        logger.info("Unable to login ");
    }
}