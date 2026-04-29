package org.zigwheels.tests;

import org.testng.annotations.Test;
import org.zigwheels.pages.CarsPage;
import org.zigwheels.pages.HomePage;
import basetest.BaseTest;
import java.io.IOException;

public class TC_8Cars extends BaseTest {
    HomePage hp;
    CarsPage cp;
    @Test
    public void Cars() throws IOException {
        hp=new HomePage(driver);
        hp.clickMore();
        hp.clickUsedCars();
        cp=new CarsPage(driver);
        logger.info("Retrieving the car details");
        BaseTest.takeScreenShot(driver, "Cars.png");
        cp.setChennai();
        cp.clickReadMore();
        cp.exportCarDetails();
        logger.info("Retrieved all the car details sucessfully");
    }
}