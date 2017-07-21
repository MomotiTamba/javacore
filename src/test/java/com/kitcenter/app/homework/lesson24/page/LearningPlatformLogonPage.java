package com.kitcenter.app.homework.lesson24.page;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class LearningPlatformLogonPage {

    private SelenideElement searchAlert = $(By.cssSelector(".black-btn.migration-continue-btn"));
    private SelenideElement searchLogin = $(By.id("username"));
    private SelenideElement searchPassword = $(By.id("password"));
    private SelenideElement searchButtonLogin = $(By.id("login-btn"));
    private SelenideElement inicioNav = $(By.cssSelector(".main-nav .active-page"));


    public LearningPlatformLogonPage checkLogon(String LOGIN, String PASSWORD) {
        searchAlert.shouldBe(visible).click();
        searchLogin.val(LOGIN);
        searchPassword.val(PASSWORD);
        searchButtonLogin.shouldBe(visible).click();
        inicioNav.shouldBe(visible);
        return this;
    }

    public LearningPlatformLogonPage getLogon(String LOGIN, String PASSWORD) {
        searchAlert.click();
        searchLogin.val(LOGIN);
        searchPassword.val(PASSWORD);
        searchButtonLogin.click();
        return this;
    }

    public LearningPlatformLogonPage checkLogout() {
        searchLogin.isDisplayed();
        searchPassword.isDisplayed();
        return this;
    }
}
