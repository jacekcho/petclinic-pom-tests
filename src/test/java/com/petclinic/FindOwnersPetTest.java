package com.petclinic;

import com.petclinic.driver.SeleniumBase;
import com.petclinic.pages.FindOwnersPage;
import com.petclinic.pages.OwnerDetailsPage;
import com.petclinic.pages.OwnersListPage;
import org.testng.annotations.Test;

import static org.fest.assertions.Assertions.assertThat;

public class FindOwnersPetTest extends SeleniumBase {

    @Test
    public void shouldDisplayListOfAllOwners() {
        // given
        FindOwnersPage findOwnersPage = new FindOwnersPage().get();

        // when
        findOwnersPage.clickFindOwnerButton();

        // then
        assertThat(new OwnersListPage().isOwnersListDisplayed()).isTrue();
    }

    @Test
    public void shouldFindSpecificUser() throws Exception {
        // given
        FindOwnersPage findOwnersPage = new FindOwnersPage().get();

        // when
        OwnerDetailsPage ownerDetailsPage = findOwnersPage
                .setSearchLastName("Franklin")
                .clickFindOwnerButton();

        // then
        assertThat(ownerDetailsPage.getOwnerName()).contains("George Franklin");
    }


}
