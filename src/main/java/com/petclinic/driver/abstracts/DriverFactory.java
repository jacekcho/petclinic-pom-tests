package com.petclinic.driver.abstracts;

public interface DriverFactory<T> {
    public T create();
}
