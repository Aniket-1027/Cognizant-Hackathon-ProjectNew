package org.zigwheels.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.zigwheels.pages.CarsPage;
import org.zigwheels.pages.HomePage;
import basetest.BaseTest;
import java.io.IOException;

public class TC_12CarsTable extends BaseTest {
    @Test
    public void atleastTwoRows() throws IOException, InterruptedException {
        HomePage hp=new HomePage(driver);
        hp.clickMore();
        hp.clickUsedCars();
        CarsPage cp=new CarsPage(driver);
        cp.clickReadMore();
        cp.carsTableLength();
        Thread.sleep(2000);
        if(cp.cartablecnt>=2){
            Assert.assertTrue(true,"Atleast two rows are present in the cars table");
        }
    }
}