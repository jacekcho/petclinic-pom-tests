package com.petclinic.driver;

import com.netflix.config.DynamicProperty;
import com.petclinic.driver.factories.ChromeDriverFactory;
import com.petclinic.driver.factories.FireFoxDriverFactory;
import com.petclinic.driver.factories.InternetExplorerDriverFactory;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DriversFactory {

    public static RemoteWebDriver getDriver() throws Exception {
        String browserType = DynamicProperty.getInstance("browser").getString();

        switch (browserType) {
            case "chrome":
                return chromeDriver();
            case "firefox":
                return firefoxDriver();
            case "ie":
                return internetExplorerDriver();
            default:
                throw new Exception("Wrong browser type! " + browserType);
        }
    }

    private static ChromeDriver chromeDriver() {
        return new ChromeDriverFactory().create();
    }

    private static FirefoxDriver firefoxDriver() {
        return new FireFoxDriverFactory().create();
    }

    private static InternetExplorerDriver internetExplorerDriver() {
        return new InternetExplorerDriverFactory().create();
    }
}
