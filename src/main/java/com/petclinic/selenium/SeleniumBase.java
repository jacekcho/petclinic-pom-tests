package com.petclinic.selenium;

import com.codeborne.selenide.WebDriverRunner;
import com.netflix.config.DynamicStringProperty;
import com.petclinic.driver.DriversFactory;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class SeleniumBase {

    private RemoteWebDriver driver;

    private static String browserType = new DynamicStringProperty("browser", "chrome").getValue();

    @BeforeMethod
    public void setUp() {
        driver = DriversFactory.getDriver(browserType);
        setUpSelenide();
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null)
            driver.quit();
    }

    private void setUpSelenide() {
        WebDriverRunner.setWebDriver(driver);
    }

    public static boolean isMobile() { // move this method to the proper class
        return browserType.equals("mobile");
    }
}