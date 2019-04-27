package com.petclinic.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.page;

public class OwnersListPage {

    @FindBy(css = "table[id='vets']")
    private SelenideElement ownersList;

    public OwnersListPage() {
        page(this);
    }

    public boolean isOwnersListDisplayed() {
        return ownersList.isDisplayed();
    }
}
