package com.kitcenter.app.homework.lesson24.LearningPlatform.tests;

import com.kitcenter.app.homework.lesson24.LearningPlatform.core.TestBase;
import com.kitcenter.app.homework.lesson24.LearningPlatform.page.CuentaNavHomePage;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;


public class C103CuentaNavTest extends TestBase {

    LoginTestData loginData = new LoginTestData();

    @Test(testName = "C103_Scenario1")
    public void cuentaNavTest1() {
        open(loginData.getLearningPlatform());
        loginData.logOn();
        CuentaNavHomePage cuentaNavHomePage = new CuentaNavHomePage();
        cuentaNavHomePage.checkCuentaMensajesNav();
    }

    @Test(testName = "C103_Scenario2")
    public void cuentaNavTest2() {
        open(loginData.getLearningPlatform());
        loginData.logOn();
        CuentaNavHomePage cuentaNavHomePage = new CuentaNavHomePage();
        cuentaNavHomePage.checkCuentaPreferenciasNav();
    }

    @Test(testName = "C103_Scenario3")
    public void cuentaNavTest3() {
        open(loginData.getLearningPlatform());
        loginData.logOn();
        CuentaNavHomePage cuentaNavHomePage = new CuentaNavHomePage();
        cuentaNavHomePage.checkCuentaSalirNav();
    }
}
