package org.zigwheels.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.zigwheels.pages.CarsPage;
import org.zigwheels.pages.HomePage;
import basetest.BaseTest;

public class TC_14DuplicateCars extends BaseTest {
    @Test
    public void findDuplicateCars(){
        logger.info("to check the duplicate cars are present or not");
        HomePage hp=new HomePage(driver);
        hp.clickMore();
        hp.clickUsedCars();
        CarsPage cp=new CarsPage(driver);
        cp.setChennai();
        cp.clickReadMore();
        cp.carsTableLength();
        Assert.assertEquals(cp.carDetails.size(),cp.carDetailsSet.size(),"No Duplicate Cars Found");
        logger.info("No duplicate cars are found");
    }
}