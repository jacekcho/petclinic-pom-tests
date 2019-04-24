package com.petclinic.driver;

import com.codeborne.selenide.WebDriverRunner;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class SeleniumBase {

    private ChromeDriver driver;

    @BeforeMethod
    public void setUp() {
        setUpDriver();
        setUpSelenide();
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null)
            driver.quit();
    }

    private void setUpDriver() {
        ChromeDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    private void setUpSelenide() {
        WebDriverRunner.setWebDriver(driver);
    }
}