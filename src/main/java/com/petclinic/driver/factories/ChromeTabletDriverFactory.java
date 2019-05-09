package com.petclinic.driver.factories;

import com.petclinic.dictionary.Device;
import com.petclinic.driver.abstracts.DriverFactory;
import com.petclinic.driver.utils.CustomChromeOptions;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeTabletDriverFactory implements DriverFactory<ChromeDriver> {

    @Override
    public ChromeDriver create() {
        ChromeDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new CustomChromeOptions().getEmulationOptions(Device.TABLET);
        return new ChromeDriver(chromeOptions);
    }
}
