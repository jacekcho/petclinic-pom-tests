package com.petclinic.driver;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverFactory implements DriverFactory<ChromeDriver> {

    @Override
    public ChromeDriver getDriver() {
        ChromeDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }
}
