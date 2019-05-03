package com.petclinic.driver;

import com.petclinic.driver.factories.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DriversFactory {

    public static RemoteWebDriver getDriver(String browserType) {
        switch (browserType) {
            case "chrome":
                return chromeDriver();
            case "firefox":
                return firefoxDriver();
            case "ie":
                return internetExplorerDriver();
            case "tablet":
                return chromeDriverTablet();
            case "mobile":
                return chromeDriverMobile();
            default:
                throw new IllegalArgumentException(String.format("'%s' is a wrong browser type!", browserType));
        }
    }

    private static ChromeDriver chromeDriver() {
        return new ChromeDriverFactory().create();
    }

    private static ChromeDriver chromeDriverTablet() {
        return new ChromeTabletDriverFactory().create();
    }

    private static ChromeDriver chromeDriverMobile() {
        return new ChromeMobileDriverFactory().create();
    }

    private static FirefoxDriver firefoxDriver() {
        return new FireFoxDriverFactory().create();
    }

    private static InternetExplorerDriver internetExplorerDriver() {
        return new InternetExplorerDriverFactory().create();
    }
}
