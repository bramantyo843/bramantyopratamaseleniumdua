package org.bramantyopratamaujiantiga;

import org.bramantyopratamaujiantiga.pageobjekbramantyopratama.drivers.DriverSingleton;
import org.bramantyopratamaujiantiga.pageobjekbramantyopratama.Utils.Constants;
import org.bramantyopratamaujiantiga.pageobjekbramantyopratama.pages.AddChart;
import org.bramantyopratamaujiantiga.pageobjekbramantyopratama.pages.LoginWeb;
import org.bramantyopratamaujiantiga.pageobjekbramantyopratama.pages.Register;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Main {
    public static void main(String[] args) {


            DriverSingleton.getInstance(Constants.CHROME);
            WebDriver driver = DriverSingleton.getDriver();
            driver.get(Constants.URL);

        JavascriptExecutor js =(JavascriptExecutor) driver;

         Register webTables = new Register();
            webTables.registrationForm("abcul", "abcul@email.com", "Abcul345!");

            LoginWeb login = new LoginWeb();
            login.registrationForm("abcul", "Abcul345!");

            js.executeScript("window.scrollBy(0,300)");

        //        driver.get("https://shop.demoqa.com/product/black-cross-back-maxi-dress/");
        //    AddChart chartsatu = new AddChart();
        //    chartsatu.registrationForm("");

            driver.get("https://shop.demoqa.com/product/pink-drop-shoulder-oversized-t-shirt/");
            AddChart pilih = new AddChart();
            pilih.regischart();
            js.executeScript("window.scrollBy(0,200)");


            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

           // driver.quit();

        }
}