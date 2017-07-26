package com.kitcenter.app.homework.lesson24.LearningPlatform.page;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Condition.value;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class LogonPage {

    private SelenideElement searchAlert = $(By.cssSelector(".black-btn.migration-continue-btn"));
    private SelenideElement searchLogin = $(By.id("username"));
    private SelenideElement searchPassword = $(By.id("password"));
    private SelenideElement searchButtonLogin = $(By.id("login-btn"));
    private SelenideElement inicioNav = $(By.cssSelector(".main-nav .active-page"));

    public LogonPage checkLoginInput(String LOGIN){
        searchAlert.shouldBe(visible).click();
        searchLogin.val(LOGIN).shouldHave(attribute("value", LOGIN));
        return this;
    }

    public LogonPage checkLogon(String LOGIN, String PASSWORD) {
        searchAlert.shouldBe(visible).click();
        searchLogin.val(LOGIN);
        searchPassword.val(PASSWORD);
        searchButtonLogin.shouldBe(visible).click();
        inicioNav.shouldBe(visible);
        return this;
    }

    public LogonPage getLogon(String LOGIN, String PASSWORD) {
        searchAlert.click();
        searchLogin.val(LOGIN);
        searchPassword.val(PASSWORD);
        searchButtonLogin.click();
        return this;
    }

    public LogonPage checkLogout() {
        searchLogin.isDisplayed();
        searchPassword.isDisplayed();
        return this;
    }
}
