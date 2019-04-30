package com.petclinic.driver;

public interface DriverFactory<T> {

    public T getDriver();
}
