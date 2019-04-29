package com.petclinic.pages;

import com.codeborne.selenide.SelenideElement;
import com.netflix.config.DynamicProperty;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.LoadableComponent;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;
import static com.codeborne.selenide.WebDriverRunner.url;
import static org.fest.assertions.Assertions.assertThat;

public class VeterinariansPage extends LoadableComponent<VeterinariansPage> {

    @FindBy(css = "div[class^='container'] h2")
    private SelenideElement pageTitle;

    @FindBy(id = "vets")
    private SelenideElement veterinariansTable;

    private String veterinariansPageUrl = DynamicProperty.getInstance("petclinic.url").getString().concat("vets.html");

    public VeterinariansPage() {
        page(this);
    }

    public String getPageTitle() {
        return pageTitle.getText();
    }

    public boolean isVeterinariansTableDisplayed() {
        return veterinariansTable.isDisplayed();
    }

    @Override
    protected void load() {
        open(veterinariansPageUrl);
    }

    @Override
    protected void isLoaded() throws Error {
        try {
            assertThat(url()).isEqualTo(veterinariansPageUrl);
        } catch (IllegalStateException e) {
            throw new Error(e);
        }
    }
}
