package com.petclinic.driver;

import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxDriverFactory implements DriverFactory<FirefoxDriver> {

    @Override
    public FirefoxDriver getDriver() {
        FirefoxDriverManager.firefoxdriver().setup();
        return new FirefoxDriver();
    }
}
