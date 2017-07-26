package com.kitcenter.app.homework.lesson24.LearningPlatform.tests;

import com.kitcenter.app.homework.lesson24.LearningPlatform.core.TestBase;
import com.kitcenter.app.homework.lesson24.LearningPlatform.page.LoginLogoutPage;
import com.kitcenter.app.homework.lesson24.LearningPlatform.page.LogonPage;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;


public class C2LoginPageTest extends TestBase {

    LoginTestData loginData = new LoginTestData();

    @Test(testName = "C2")
    public void loginPageTest() {
        open(loginData.getLearningPlatform());
        LogonPage logonPage = new LogonPage();
        logonPage.checkLogon(LoginTestData.getLOGIN(), LoginTestData.getPASSWORD());
        LoginLogoutPage loginOk = new LoginLogoutPage();
        loginOk.getLogoutHoverResult();
    }

    @Test
    public void loginInputValueTest(){
        open(loginData.getLearningPlatform());
        LogonPage logonPage = new LogonPage();
        logonPage.checkLoginInput(LoginTestData.getLOGIN());
    }
}
