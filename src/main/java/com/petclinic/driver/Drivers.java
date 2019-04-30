package com.petclinic.driver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Drivers {

    public static ChromeDriver chromeDriver() {
        return new ChromeDriverFactory().getDriver();
    }

    public static FirefoxDriver firefoxDriver() {
        return new FireFoxDriverFactory().getDriver();
    }

    public static InternetExplorerDriver internetExplorerDriver() {
        return new InternetExplorerDriverFactory().getDriver();
    }
}
