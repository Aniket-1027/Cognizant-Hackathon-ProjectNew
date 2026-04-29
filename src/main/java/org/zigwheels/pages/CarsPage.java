package org.zigwheels.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.ExportVehicleDetails;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class CarsPage extends CommonCode {
    public int cnt;
    public int cartablecnt;
    //    public int checkedcnt;
    public List<String> carDetails = new ArrayList<>();
    public HashSet<String> carDetailsSet = new HashSet<>(carDetails);
    public int rowscount = carDetails.size();

    public CarsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[text()='Chennai']")
    public WebElement chennai;

    @FindBy(xpath = "//h1[@id='usedcarttlID']")
    public WebElement usedCarsInChennai;

    @FindBy(xpath = "//span[text()='Read More']")
    WebElement readMore;

    @FindBy(xpath = "//tbody/tr/td[1]")
    public List<WebElement> carNames;

    public void setChennai() {
        super.clickByJS(chennai);
    }

    public void clickReadMore() {
        super.clickByJS(readMore);
    }

    public void exportCarDetails() throws IOException {
        for (int i = 0; i < 5; i++) {
            carDetails.add(carNames.get(i).getText());
            cartablecnt += 1;
        }
        ExportVehicleDetails.writeCarDetails(carDetails);
    }

    public void carsTableLength() {
        for (String carDetail : carDetails) {
            cnt += 1;
        }
    }
}
