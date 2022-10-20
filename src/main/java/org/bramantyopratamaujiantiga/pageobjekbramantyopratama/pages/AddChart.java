package org.bramantyopratamaujiantiga.pageobjekbramantyopratama.pages;

import org.bramantyopratamaujiantiga.pageobjekbramantyopratama.drivers.DriverSingleton;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddChart {

    public AddChart() {
        WebDriver driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    //  @FindBy(id = "addNewRecordButton")
    // WebElement btnAdd;

    @FindBy(xpath = "//*[@id=\"pa_color\"]")
    WebElement Colormanagemen;

    @FindBy(xpath = "//*[@id=\"pa_size\"]")
    WebElement Sizemanagemen;

    @FindBy(xpath = "//*[@id=\"product-1497\"]/div[1]/div[2]/form/div/div[2]/button")
    WebElement addbutn;

    //Page Object
    public void regischart() {
        //btnAdd.click();
        Colormanagemen.sendKeys("P");
        Sizemanagemen.sendKeys("3");

        addbutn.click();
    }


    }
