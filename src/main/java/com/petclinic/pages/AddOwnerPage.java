package com.petclinic.pages;

import com.codeborne.selenide.SelenideElement;
import org.apache.commons.lang3.NotImplementedException;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.page;

public class AddOwnerPage {

    @FindBy(id = "firstName")
    private SelenideElement firstName;

    @FindBy(id = "lastName")
    private SelenideElement lastName;

    @FindBy(id = "address")
    private SelenideElement address;

    @FindBy(id = "city")
    private SelenideElement city;

    @FindBy(id = "telephone")
    private SelenideElement telephone;

    public AddOwnerPage() {
        page(this);
    }

    public AddOwnerPage setFirstName(String firstName) {
        this.firstName.setValue(firstName);
        return this;
    }

    public AddOwnerPage setLastName(String lastName) {
        this.lastName.setValue(lastName);
        return this;
    }

    public AddOwnerPage setAddress(String address) {
        this.address.setValue(address);
        return this;
    }

    public AddOwnerPage setCity(String city) {
        this.city.setValue(city);
        return this;
    }

    public AddOwnerPage setTelephone(String telephone) {
        this.telephone.setValue(telephone);
        return this;
    }

    public OwnerDetailsPage clickAddOwnerButton() {
        throw new NotImplementedException("com.petclinic.pages.AddOwnerPage.clickAddOwnerButton has not been implemented yet!"); //TODO
    }
}
