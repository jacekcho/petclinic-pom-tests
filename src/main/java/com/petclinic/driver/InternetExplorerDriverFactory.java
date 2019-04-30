package com.petclinic.driver;

import io.github.bonigarcia.wdm.InternetExplorerDriverManager;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InternetExplorerDriverFactory implements DriverFactory<InternetExplorerDriver> {

    @Override
    public InternetExplorerDriver getDriver() {
        InternetExplorerDriverManager.iedriver().setup();
        return new InternetExplorerDriver();
    }
}
