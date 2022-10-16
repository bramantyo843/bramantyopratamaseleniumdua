package org.bramantyopratamaujiantiga.pageobjekbramantyopratama.pages;

import org.bramantyopratamaujiantiga.pageobjekbramantyopratama.drivers.DriverSingleton;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register {
    private WebDriver driver;

    public Register() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

  //  @FindBy(id = "addNewRecordButton")
    // WebElement btnAdd;

    @FindBy(id = "reg_username")
    WebElement RegUsername;

    @FindBy(id = "reg_email")
    WebElement RegEmail;

    @FindBy(id = "reg_password")
    WebElement RegPasword;

    @FindBy(name = "login")
    WebElement log;

    //Page Object
    public void registrationForm(String Regusername, String Regemail, String Regpwd){
        //btnAdd.click();
        this.RegUsername.sendKeys(Regusername);
        this.RegEmail.sendKeys(Regemail);
        this.RegPasword.sendKeys(Regpwd);
        log.click();
    }

}
