package com.petclinic.driver.factories;

public interface DriverFactory<T> {
    public T create();
}
