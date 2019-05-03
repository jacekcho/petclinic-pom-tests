package com.petclinic.driver.factories;

import com.petclinic.driver.abstracts.DriverFactory;
import io.github.bonigarcia.wdm.InternetExplorerDriverManager;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InternetExplorerDriverFactory implements DriverFactory<InternetExplorerDriver> {

    @Override
    public InternetExplorerDriver create() {
        InternetExplorerDriverManager.iedriver().setup();
        return new InternetExplorerDriver();
    }
}
