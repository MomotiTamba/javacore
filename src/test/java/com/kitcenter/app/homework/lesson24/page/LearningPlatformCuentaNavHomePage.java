package com.kitcenter.app.homework.lesson24.page;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class LearningPlatformCuentaNavHomePage {

    private SelenideElement cuentaNav = $(By.id("account-menu-nav"));
    private SelenideElement mensajesNav = $(By.id("messages"));
    private SelenideElement sinLeerNav = $(By.cssSelector(".unread"));
    private SelenideElement avisosNav = $(By.cssSelector(".notification-messages.messages>span"));
    private SelenideElement preferenciasNav = $(By.xpath(".//*[@id='account-menu']/div/ul/li[2]/a"));
    private SelenideElement miPerfilNav = $(By.cssSelector(".active>a"));
    private SelenideElement salirNav = $(By.xpath(".//*[@id='account-menu']/div/ul/li[3]/a"));
    private SelenideElement loginInput = $(By.id("username"));

    public LearningPlatformCuentaNavHomePage checkCuentaMensajesNav() {
        cuentaNav.click();
        mensajesNav.click();
        sinLeerNav.shouldBe(visible);
        avisosNav.shouldBe(visible);
        return this;
    }

    public LearningPlatformCuentaNavHomePage checkCuentaPreferenciasNav() {
        cuentaNav.click();
        preferenciasNav.click();
        miPerfilNav.isSelected();
        return this;
    }

    public LearningPlatformCuentaNavHomePage checkCuentaSalirNav() {
        cuentaNav.click();
        salirNav.click();
        loginInput.shouldBe(visible);
        return this;
    }
}
