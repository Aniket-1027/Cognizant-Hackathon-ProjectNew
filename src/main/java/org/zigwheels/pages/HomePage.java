package org.zigwheels.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends CommonCode {
    public HomePage(WebDriver driver){

        super(driver);
    }

    @FindBy(xpath = "(//span[@class='c-p ml-5'])[3]")
    WebElement newBikes;

    @FindBy(xpath = "(//a[text()='Upcoming Bikes'])[1]")
    WebElement upcmngBikes;

    @FindBy(xpath = "//span[@class='c-p']")
    WebElement more;

    @FindBy(xpath = "//a[text()='Used Cars']")
    WebElement usedCars;

    @FindBy(xpath = "//div[@id='des_lIcon']")
    WebElement login;

    public void clickNewBikes(){
        super.clickByJS(newBikes);
    }

    public void clickUpcmngBikes(){
        super.clickByJS(upcmngBikes);
    }

    public void clickMore(){
        super.clickByJS(more);
    }

    public void clickUsedCars(){
        super.clickByJS(usedCars);
    }

    public  void clickLogin(){
        super.clickByJS(login);
    }
}