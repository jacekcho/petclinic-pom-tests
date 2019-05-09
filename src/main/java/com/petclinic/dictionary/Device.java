package com.petclinic.dictionary;

public enum Device {

    MOBILE("iPhone 6"),
    TABLET("iPad");

    private String deviceName;

    Device(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getDeviceName() {
        return deviceName;
    }
}
