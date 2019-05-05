package com.petclinic.utils;

import com.netflix.config.DynamicStringProperty;

public class PropertiesManager {

    public static String getBrowserType() {
        return new DynamicStringProperty("browser", "chrome").getValue();
    }

}
