package com.kitcenter.app.homework.lesson24.LearningPlatform.tests;

import com.kitcenter.app.homework.lesson24.LearningPlatform.core.TestBase;
import com.kitcenter.app.homework.lesson24.LearningPlatform.page.LoginLogoutPage;
import com.kitcenter.app.homework.lesson24.LearningPlatform.page.LogonPage;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;


public class C63LogOutTest extends TestBase {

    LoginTestData loginData = new LoginTestData();

    @Test(testName = "C63")
    public void logoutTest() {
        open(loginData.getLearningPlatform());
        loginData.logOn();
        LoginLogoutPage loginLogout = new LoginLogoutPage();
        loginLogout.getLogout();
        LogonPage logonPage = new LogonPage();
        logonPage.checkLogout();
    }
}
