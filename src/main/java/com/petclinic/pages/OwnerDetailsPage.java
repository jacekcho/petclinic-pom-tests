package com.petclinic.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.page;

public class OwnerDetailsPage {

    @FindBy(css = "table tr")
    private ElementsCollection tableRows;

    public OwnerDetailsPage() {
        page(this);
    }

    public String getOwnerName() throws Exception {
        return getRowByName("Name");
    }

    public String getOwnerAddress() throws Exception {
        return getRowByName("Address");
    }

    public String getOwnerCity() throws Exception {
        return getRowByName("City");
    }

    public String getOwnerTelephone() throws Exception {
        return getRowByName("Telephone");
    }

    private String getRowByName(String rowName) throws Exception {
        return tableRows.stream()
                .map(SelenideElement::getText)
                .filter(r -> r.contains(rowName))
                .findFirst()
                .orElseThrow(() -> new Exception("failed to find row with Owner " + rowName));
    }

}
