package com.kitcenter.app.homework.lesson24.LearningPlatform.page;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class PrefernciasPage {

    private SelenideElement nombreInput = $(By.id("firstName"));
    private SelenideElement apellidoInput = $(By.id("lastName"));
    private SelenideElement guardarCambiosButton = $(By.id("personal-info-save"));
    private SelenideElement fieldErrorSpan = $(By.xpath(".//*[@id='person-info']/div[1]/div[1]/div[1]/div/span"));
    private SelenideElement femeninoRadio = $(By.xpath(".//*[@id='gender']/label[1]/span"));
    private SelenideElement masculinoRadio = $(By.xpath(".//*[@id='gender']/label[2]/span"));

    private String obligatorioText = "Obligatorio";
    private String noEsUnNombreValidoText = "No es un nombre válido";
    private String numbers = "1234567890";
    private String specialCharecters = "!\"#$%&/()=?¡";

    public PrefernciasPage preferenciasValidateNombreInput() {
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

    public PrefernciasPage checkFemeninoMasculinoRadio(){
        femeninoRadio.click();
        femeninoRadio.isSelected();
        masculinoRadio.click();
        masculinoRadio.isSelected();
        return this;
    }
}
