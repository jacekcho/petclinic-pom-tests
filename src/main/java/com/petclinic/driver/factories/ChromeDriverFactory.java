package com.petclinic.driver.factories;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverFactory implements DriverFactory<ChromeDriver> {

    @Override
    public ChromeDriver create() {
        ChromeDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }
}
