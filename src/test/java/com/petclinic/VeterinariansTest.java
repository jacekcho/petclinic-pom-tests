package com.petclinic;

import com.petclinic.selenium.SeleniumBase;
import com.petclinic.pages.VeterinariansPage;
import org.testng.annotations.Test;

import static org.fest.assertions.Assertions.assertThat;

public class VeterinariansTest extends SeleniumBase {

    @Test
    public void shouldDisplayVeterinariansTable() {
        // when
        VeterinariansPage veterinariansPage = new VeterinariansPage().get();

        // then
        assertThat(veterinariansPage.isVeterinariansTableDisplayed()).isTrue();
    }
}
