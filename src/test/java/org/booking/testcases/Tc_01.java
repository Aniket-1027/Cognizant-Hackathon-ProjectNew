package org.booking.testcases;

import basetest.BaseTest;
import org.testng.annotations.Test;
import org.zigwheels.pages.HomePage;

public class Tc_01 extends BaseTest {
    @Test
    public void run() throws InterruptedException {
        HomePage hp = new HomePage(driver);
        hp.closePop();
        Thread.sleep(1000);
        hp.searchCity("Nairobi");
        Thread.sleep(1000);
        hp.startDate("30", "May", "2026");
        Thread.sleep(1000);
        hp.endDate("30", "June", "2026");
        hp.enterNumberOfAdults(4);
        hp.search();
    }
}
