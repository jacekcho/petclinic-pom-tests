package com.petclinic.common;

import com.petclinic.common.components.NavigationBar;

import static com.petclinic.utils.PropertiesManager.getBrowserType;

public class PetClinicCommon {

    public static NavigationBar getNavigationBarComponent() {
        return new NavigationBar();
    }

    public static boolean isMobile() {
        return getBrowserType().equals("mobile");
    }
}
