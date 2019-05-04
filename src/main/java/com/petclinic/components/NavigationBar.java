package com.petclinic.components;

import com.codeborne.selenide.SelenideElement;
import com.netflix.config.DynamicProperty;
import com.petclinic.pages.FindOwnersPage;
import com.petclinic.pages.HomePage;
import com.petclinic.pages.VeterinariansPage;
import com.petclinic.selenium.SeleniumBase;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.page;

public class NavigationBar {

    @FindBy(css = "a[title='home page']")
    private SelenideElement home;

    @FindBy(css = "a[title='find owners']")
    private SelenideElement findOwners;

    @FindBy(css = "a[title='veterinarians']")
    private SelenideElement veterinarians;

    @FindBy(className = "navbar-toggle")
    private SelenideElement navigationBarToggle;

    public NavigationBar() {
        page(this);
    }

    public HomePage clickHomePageButton() {
        if (SeleniumBase.isMobile()) {
            navigationBarToggle.click();
        }
        home.click();
        return new HomePage();
    }

    public FindOwnersPage clickFindOwnersButton() {
        if (SeleniumBase.isMobile()) {
            navigationBarToggle.click();
        }
        findOwners.click();
        return new FindOwnersPage();
    }

    public VeterinariansPage clickVeterinariansButton() {
        if (SeleniumBase.isMobile()) {
            navigationBarToggle.click();
        }
        veterinarians.click();
        return new VeterinariansPage();
    }

    private boolean isMobile() {
        return DynamicProperty.getInstance("browser").getString().equals("mobile");
    }

}