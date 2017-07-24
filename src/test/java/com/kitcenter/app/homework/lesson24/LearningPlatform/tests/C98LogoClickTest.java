package com.kitcenter.app.homework.lesson24.LearningPlatform.tests;


import com.kitcenter.app.homework.lesson24.LearningPlatform.page.HomePage;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class C98LogoClickTest {

    LoginTestData loginData = new LoginTestData();

    @Test(testName = "C98")
    public void logoClickTest() {
        open(loginData.getLearningPlatform());
        loginData.logOn();
        HomePage inicioPage = new HomePage();
        inicioPage.checkClickLogo();
    }
}
