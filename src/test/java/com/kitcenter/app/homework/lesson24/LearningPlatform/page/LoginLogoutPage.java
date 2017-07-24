package com.kitcenter.app.homework.lesson24.LearningPlatform.page;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class LoginLogoutPage {

    private SelenideElement logoutCuenta = $(By.cssSelector("#account-menu-nav"));
    private SelenideElement logoutSalir = $(By.xpath(".//*[@id='account-menu']/div/ul/li[3]/a"));
    private SelenideElement loginInput = $(By.id("username"));

    public SelenideElement getLogoutHoverResult() {
        logoutCuenta.hover();
        return logoutSalir.shouldBe(visible);
    }

    public SelenideElement getLogout() {
        logoutCuenta.click();
        logoutSalir.click();
        return loginInput.shouldBe(visible);
    }
}
