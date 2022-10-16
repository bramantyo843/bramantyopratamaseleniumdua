package org.bramantyopratamaujiantiga.pageobjekbramantyopratama.pages;

import org.bramantyopratamaujiantiga.pageobjekbramantyopratama.drivers.DriverSingleton;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginWeb {

    public LoginWeb() {
        WebDriver driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    //  @FindBy(id = "addNewRecordButton")
    // WebElement btnAdd;

    @FindBy(id = "username")
    WebElement Username;

    @FindBy(id = "password")
    WebElement pwd;

    @FindBy(name = "login")
    WebElement logform;

    //Page Object
    public void registrationForm(String username,  String pwd){
        //btnAdd.click();
        this.Username.sendKeys(username);
        this.pwd.sendKeys(pwd);
        logform.click();
    }

}
