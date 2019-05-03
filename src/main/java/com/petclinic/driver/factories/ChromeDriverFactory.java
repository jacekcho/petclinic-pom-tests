package com.petclinic.driver.factories;

import com.petclinic.driver.abstracts.DriverFactory;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverFactory implements DriverFactory<ChromeDriver> {

    @Override
    public ChromeDriver create() {
        ChromeDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }
}
