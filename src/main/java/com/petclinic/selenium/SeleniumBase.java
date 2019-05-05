package com.petclinic.selenium;

import com.codeborne.selenide.WebDriverRunner;
import com.petclinic.driver.DriversFactory;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static com.petclinic.utils.PropertiesManager.getBrowserType;

public class SeleniumBase {

    private RemoteWebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = DriversFactory.getDriver(getBrowserType());
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

}