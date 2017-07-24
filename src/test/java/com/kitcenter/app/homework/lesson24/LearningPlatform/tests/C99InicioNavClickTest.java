package com.kitcenter.app.homework.lesson24.LearningPlatform.tests;

import com.kitcenter.app.homework.lesson24.LearningPlatform.core.TestBase;
import com.kitcenter.app.homework.lesson24.LearningPlatform.page.HomePage;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;


public class C99InicioNavClickTest extends TestBase {

    LoginTestData loginData = new LoginTestData();

    @Test(testName = "C99")
    public void inicioNavClickTest() {
        open(loginData.getLearningPlatform());
        loginData.logOn();
        HomePage inicioPage = new HomePage();
        inicioPage.checkClickInicio();
    }
}
