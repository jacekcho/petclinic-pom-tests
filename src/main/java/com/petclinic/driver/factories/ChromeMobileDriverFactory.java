package com.petclinic.driver.factories;

import com.petclinic.driver.abstracts.DriverFactory;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;

public class ChromeMobileDriverFactory implements DriverFactory<ChromeDriver> {

    @Override
    public ChromeDriver create() {  //TODO refactoring needed
        ChromeDriverManager.chromedriver().setup();
        Map<String, String> mobileEmulation = new HashMap<>();
        mobileEmulation.put("deviceName", "iPhone 6");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);
        return new ChromeDriver(chromeOptions);
    }
}
