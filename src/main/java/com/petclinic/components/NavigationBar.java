package com.petclinic.components;

import com.codeborne.selenide.SelenideElement;
import com.petclinic.pages.FindOwnersPage;
import com.petclinic.pages.HomePage;
import com.petclinic.pages.VeterinariansPage;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.page;

public class NavigationBar {

    @FindBy(css = "a[title='home page']")
    private SelenideElement home;

    @FindBy(css = "a[title='find owners']")
    private SelenideElement findOwners;

    @FindBy(css = "a[title='veterinarians']")
    private SelenideElement veterinarians;

    public NavigationBar() {
        page(this);
    }

    public HomePage clickHomePageButton() {
        home.click();
        return new HomePage();
    }

    public FindOwnersPage clickFindOwnersButton() {
        findOwners.click();
        return new FindOwnersPage();
    }

    public VeterinariansPage clickVeterinariansButton() {
        veterinarians.click();
        return new VeterinariansPage();
    }

}