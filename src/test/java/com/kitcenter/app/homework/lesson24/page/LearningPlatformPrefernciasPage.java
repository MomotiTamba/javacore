package com.kitcenter.app.homework.lesson24.page;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LearningPlatformPrefernciasPage {

    private SelenideElement nombreInput = $(By.id("firstName"));
    private SelenideElement apellidoInput = $(By.id("lastName"));
    private SelenideElement guardarCambiosButton = $(By.id("personal-info-save"));
    private SelenideElement fieldErrorSpan = $(By.xpath(".//*[@id='person-info']/div[1]/div[1]/div[1]/div/span"));
    private String obligatorioText = "Obligatorio";
    private String noEsUnNombreValidoText = "No es un nombre válido";
    private String numbers = "1234567890";
    private String specialCharecters = "!\"#$%&/()=?¡";

    public LearningPlatformPrefernciasPage preferenciasValidateNombreInput() {
        nombreInput.clear();
        apellidoInput.click();
        guardarCambiosButton.click();
        fieldErrorSpan.getText().equals(obligatorioText);
        nombreInput.val(numbers);
        guardarCambiosButton.click();
        fieldErrorSpan.getText().equals(noEsUnNombreValidoText);
        nombreInput.val(specialCharecters);
        guardarCambiosButton.click();
        fieldErrorSpan.getText().equals(specialCharecters);
        return this;
    }
}
