package com.petclinic.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.page;

public class FindOwnersPage {

    @FindBy(css = "div[class^='container'] h2")
    private SelenideElement pageTitle;

    public FindOwnersPage() {
        page(this);
    }

    public String getPageTitle() {
        return pageTitle.getText();
    }

}
