package com.kitcenter.app.homework.lesson24.LearningPlatform.page;


import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HomePage {

    private SelenideElement logoImg = $(By.cssSelector(".header-holder .logo>a"));
    private SelenideElement inicioNav = $(By.cssSelector(".main-nav .active-page"));

    public HomePage checkClickLogo() {
        logoImg.click();
        inicioNav.isEnabled();
        return this;
    }

    public HomePage checkClickInicio() {
        inicioNav.click();
        inicioNav.isEnabled();
        return this;
    }
}
