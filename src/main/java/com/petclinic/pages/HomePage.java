package com.petclinic.pages;

import com.codeborne.selenide.SelenideElement;
import com.petclinic.components.NavigationBar;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.LoadableComponent;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;
import static com.codeborne.selenide.WebDriverRunner.url;
import static org.fest.assertions.Assertions.assertThat;

public class HomePage extends LoadableComponent<HomePage> {

    @FindBy(css = "div[class^='container'] h2")
    private SelenideElement pageTitle;

    public HomePage() {
        page(this);
    }

    public String getPageTitle() {
        return pageTitle.getText();
    }

    public NavigationBar getNavigationBarComponent() {
        return new NavigationBar();
    }

    @Override
    protected void load() {
        open("http://localhost:8080/");
    }

    @Override
    protected void isLoaded() throws Error {
        try {
            assertThat(url()).isEqualTo("http://localhost:8080/");
        } catch (IllegalStateException e) {
            throw new Error(e);
        }
    }
}
