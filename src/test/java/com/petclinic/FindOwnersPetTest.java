package com.petclinic;

import com.petclinic.driver.SeleniumBase;
import com.petclinic.pages.FindOwnersPage;
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
        assertThat(findOwnersPage.isOwnersListDisplayed()).isTrue();
    }


}
