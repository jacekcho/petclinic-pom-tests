package com.petclinic.driver.factories;

import io.github.bonigarcia.wdm.InternetExplorerDriverManager;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InternetExplorerDriverFactory implements DriverFactory<InternetExplorerDriver> {

    @Override
    public InternetExplorerDriver create() {
        InternetExplorerDriverManager.iedriver().setup();
        return new InternetExplorerDriver();
    }
}
