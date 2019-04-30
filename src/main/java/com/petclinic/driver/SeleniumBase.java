package com.petclinic.driver;

import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class SeleniumBase {

    private RemoteWebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = Drivers.chromeDriver();
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