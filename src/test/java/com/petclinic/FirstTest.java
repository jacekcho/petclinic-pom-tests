package com.petclinic;

import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;
import static org.fest.assertions.Assertions.assertThat;

public class FirstTest {

    @Test
    public void firstTest() {
        // when
        open("http://onet.pl");

        // then
        assertThat(title()).isEqualTo("Onet – Jesteś na bieżąco");
    }
}
