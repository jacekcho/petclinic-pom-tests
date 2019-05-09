package com.petclinic.driver.utils;

import com.petclinic.dictionary.Device;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;

public class CustomChromeOptions {

    public ChromeOptions getEmulationOptions(Device deviceType) {
        Map<String, String> emulation = new HashMap<>();
        emulation.put("deviceName", deviceType.getDeviceName());
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setExperimentalOption("mobileEmulation", emulation);
        return chromeOptions;
    }
}
