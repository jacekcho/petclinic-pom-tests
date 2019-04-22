package com.petclinic.pages;

import org.openqa.selenium.support.ui.LoadableComponent;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.url;
import static org.fest.assertions.Assertions.assertThat;

public class HomePage extends LoadableComponent<HomePage> {

    @Override
    protected void load() {
        open("http://localhost:8080/");
    }

    @Override
    protected void isLoaded() throws Error {
        assertThat(url()).isEqualTo("http://localhost:8080/");
    }
}
