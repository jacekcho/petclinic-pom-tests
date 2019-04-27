package com.petclinic.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.LoadableComponent;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;
import static com.codeborne.selenide.WebDriverRunner.url;
import static org.fest.assertions.Assertions.assertThat;

public class FindOwnersPage extends LoadableComponent<FindOwnersPage> {

    @FindBy(css = "div[class^='container'] h2")
    private SelenideElement pageTitle;

    @FindBy(css = "button[type='submit']")
    private SelenideElement findOwnerButton;

    @FindBy(css = "a[href='/owners/new']")
    private SelenideElement addOwnerButton;

    @FindBy(id = "lastName")
    private SelenideElement searchByLastName;

    public FindOwnersPage() {
        page(this);
    }

    public String getPageTitle() {
        return pageTitle.getText();
    }

    public OwnerDetailsPage clickFindOwnerButton() {
        findOwnerButton.click();
        return new OwnerDetailsPage();
    }

    public AddOwnerPage clickAddOwnerButton() {
        addOwnerButton.click();
        return new AddOwnerPage();
    }

    public FindOwnersPage setSearchLastName(String searchLastName) {
        searchByLastName.setValue(searchLastName);
        return this;
    }

    @Override
    protected void load() {
        open("http://localhost:8080/owners/find");
    }

    @Override
    protected void isLoaded() throws Error {
        try {
            assertThat(url()).isEqualTo("http://localhost:8080/owners/find");
        } catch (IllegalStateException e) {
            throw new Error(e);
        }
    }

}
