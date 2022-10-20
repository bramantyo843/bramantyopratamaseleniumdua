package org.bramantyopratamaujiantiga.pageobjekbramantyopratama.drivers;

import org.bramantyopratamaujiantiga.pageobjekbramantyopratama.drivers.strategies.DriveStrategy;
import org.bramantyopratamaujiantiga.pageobjekbramantyopratama.drivers.strategies.DriveStrategyImplementor;

import org.bramantyopratamaujiantiga.pageobjekbramantyopratama.Utils.Constants;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class DriverSingleton {
    private static DriverSingleton instance = null;
    private static WebDriver driver;

    private DriverSingleton(String driver) {
        instantiate(driver);
    }

    public void instantiate(String strategy) {
        DriveStrategy driverStrategy = DriveStrategyImplementor.chooseStrategy(strategy);
        driver = driverStrategy.setStrategy();
        driver.manage().timeouts().implicitlyWait(Constants.TIMEOUT, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }

    public static DriverSingleton getInstance(String driver) {
        if(instance == null) {
            instance = new DriverSingleton(driver);
        }

        return instance;
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void closeObjectInstance() {
        instance = null;
        driver.quit();
    }

}
