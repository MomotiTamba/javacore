package com.kitcenter.app.homework.lesson24.LearningPlatform.tests;

import com.kitcenter.app.homework.lesson24.LearningPlatform.core.TestBase;
import com.kitcenter.app.homework.lesson24.LearningPlatform.page.ProgressoNavHomePage;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;


public class C100ProgressoNavTests extends TestBase {

    LoginTestData loginData = new LoginTestData();

    @Test(testName = "C100_Scenario1")
    public void progressoNavTest1() {
        open(loginData.getLearningPlatform());
        loginData.logOn();
        ProgressoNavHomePage progressoPage = new ProgressoNavHomePage();
        progressoPage.checkNavProgresso();
    }

    @Test(testName = "C100_Scenario2")
    public void progressoNavTest2() {
        open(loginData.getLearningPlatform());
        loginData.logOn();
        ProgressoNavHomePage progressoPage = new ProgressoNavHomePage();
        progressoPage.checkNavProgressoSugerenciasDelProfesor();
    }

    @Test(testName = "C100_Scenario3")
    public void progressoNavTest3() {
        open(loginData.getLearningPlatform());
        loginData.logOn();
        ProgressoNavHomePage progressoPage = new ProgressoNavHomePage();
        progressoPage.checkNavRegistro();
    }

    @Test(testName = "C100_Scenario4")
    public void progressoNavTest4() {
        open(loginData.getLearningPlatform());
        loginData.logOn();
        ProgressoNavHomePage progressoPage = new ProgressoNavHomePage();
        progressoPage.checkNavCuadernoDeNotas();
    }
}
