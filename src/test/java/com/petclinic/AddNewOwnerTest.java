package com.petclinic;

import com.petclinic.selenium.SeleniumBase;
import com.petclinic.pages.AddOwnerPage;
import com.petclinic.pages.FindOwnersPage;
import com.petclinic.pages.OwnerDetailsPage;
import org.testng.annotations.Test;

import static com.petclinic.utils.Generators.*;
import static org.fest.assertions.Assertions.assertThat;

public class AddNewOwnerTest extends SeleniumBase {

    private String firstName = randomFirstName();
    private String lastName = randomLastName();
    private String address = randomAddress();
    private String city = randomCity();
    private String telephone = randomTelephoneNumber();

    @Test
    public void shouldAddNewOwner() throws Exception {
        // given
        AddOwnerPage addOwnerPage = new FindOwnersPage()
                .get()
                .clickAddOwnerButton();

        // when
        OwnerDetailsPage ownerDetailsPage = addOwnerPage
                .setFirstName(firstName)
                .setLastName(lastName)
                .setAddress(address)
                .setCity(city)
                .setTelephone(telephone)
                .clickAddOwnerButton();

        // then
        assertThat(ownerDetailsPage.getOwnerName()).contains(firstName + " " + lastName);
        assertThat(ownerDetailsPage.getOwnerAddress()).contains(address);
        assertThat(ownerDetailsPage.getOwnerCity()).contains(city);
        assertThat(ownerDetailsPage.getOwnerTelephone()).contains(telephone);
    }
}
