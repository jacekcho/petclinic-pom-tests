package com.petclinic.driver;

import com.netflix.config.DynamicStringProperty;
import com.petclinic.driver.factories.ChromeDriverFactory;
import com.petclinic.driver.factories.FireFoxDriverFactory;
import com.petclinic.driver.factories.InternetExplorerDriverFactory;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DriversFactory {

    private static DynamicStringProperty browserProperty = new DynamicStringProperty("browser", "chrome");

    public static RemoteWebDriver getDriver() {
        switch (browserProperty.getValue()) {
            case "chrome":
                return chromeDriver();
            case "firefox":
                return firefoxDriver();
            case "ie":
                return internetExplorerDriver();
            default:
                throw new IllegalArgumentException(String.format("'%s' is a wrong browser type!", browserProperty.getValue()));
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
