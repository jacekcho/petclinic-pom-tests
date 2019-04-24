package com.petclinic;

import com.petclinic.driver.SeleniumBase;
import com.petclinic.pages.FindOwnersPage;
import com.petclinic.pages.HomePage;
import com.petclinic.pages.VeterinariansPage;
import org.testng.annotations.Test;

import static org.fest.assertions.Assertions.assertThat;

public class HomePageTest extends SeleniumBase {

    @Test
    public void shouldValidateHomePageTitle() {
        // when
        HomePage homePage = new HomePage().get();

        // then
        assertThat(homePage.getPageTitle()).isEqualTo("Welcome");
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
        assertThat(findOwnersPage.getPageTitle()).isEqualTo("Find Owners");
    }

    @Test
    public void shouldNavigateToVeterinariansPage() {
        // given
        HomePage homePage = new HomePage().get();

        // when
        VeterinariansPage veterinariansPage = homePage
                .getNavigationBarComponent()
                .clickVeterinariansButton();

        // then
        assertThat(veterinariansPage.getPageTitle()).isEqualTo("Veterinarians");
    }
}
