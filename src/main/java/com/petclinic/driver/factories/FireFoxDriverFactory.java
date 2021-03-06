package com.petclinic.driver.factories;

import com.petclinic.driver.abstracts.DriverFactory;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxDriverFactory implements DriverFactory<FirefoxDriver> {

    @Override
    public FirefoxDriver create() {
        FirefoxDriverManager.firefoxdriver().setup();
        return new FirefoxDriver();
    }
}
