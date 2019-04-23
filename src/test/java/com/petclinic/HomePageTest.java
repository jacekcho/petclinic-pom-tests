package com.petclinic;

import com.petclinic.driver.SeleniumBase;
import com.petclinic.pages.FindOwnersPage;
import com.petclinic.pages.HomePage;
import org.testng.annotations.Test;

import static org.fest.assertions.Assertions.assertThat;

public class HomePageTest extends SeleniumBase {

    @Test
    public void shouldValidateHomePageTitle() {
        // when
        HomePage homePage = new HomePage().get();

        // then
        assertThat(homePage.getPageTitle()).isEqualTo("PetClinic :: a Spring Framework demonstration");
    }

    @Test
    public void shouldNavigateToFindOwnersPage() {
        // given
        HomePage homePage = new HomePage().get();

        // when
        FindOwnersPage findOwnersPage = homePage
                .getNavigationBarComponent()
                .clickFindOwnersButton();

        // then
        assertThat(findOwnersPage.getPageTitle()).isEqualTo("PetClinic :: a Spring Framework demonstration");
    }
}
