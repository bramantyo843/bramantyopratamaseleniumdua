package org.bramantyopratamaujiantiga;

import org.bramantyopratamaujiantiga.pageobjekbramantyopratama.drivers.DriverSingleton;
import org.bramantyopratamaujiantiga.pageobjekbramantyopratama.Utils.Constants;
import org.bramantyopratamaujiantiga.pageobjekbramantyopratama.pages.LoginWeb;
import org.bramantyopratamaujiantiga.pageobjekbramantyopratama.pages.Register;

import org.openqa.selenium.WebDriver;

public class Main {
    public static void main(String[] args) {


            DriverSingleton.getInstance(Constants.CHROME);
            WebDriver driver = DriverSingleton.getDriver();
            driver.get(Constants.URL);

            Register webTables = new Register();
            webTables.registrationForm("Text 1", "text@email.com", "Masuk345!");

            LoginWeb login = new LoginWeb();
            login.registrationForm("Text 1", "Masuk345!");

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            driver.quit();

        }
}