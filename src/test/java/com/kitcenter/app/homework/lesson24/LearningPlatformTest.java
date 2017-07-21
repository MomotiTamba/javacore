package com.kitcenter.app.homework.lesson24;


import com.kitcenter.app.homework.lesson24.core.LearningPlatformTestBase;
import com.kitcenter.app.homework.lesson24.page.*;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;


public class LearningPlatformTest extends LearningPlatformTestBase {

    private String learningPlatform = "https://learningplatform.stg.openenglish.com/login.html";
    private static final String LOGIN = "shiosaky@gmail.com";
    private static final String PASSWORD = "Test123";

    public void logon() {
        LearningPlatformLogonPage loginPage = new LearningPlatformLogonPage();
        loginPage.getLogon(LOGIN, PASSWORD);
    }

    public void logout() {
        LearningPlatformLoginLogoutPage loginLogout = new LearningPlatformLoginLogoutPage();
        loginLogout.getLogout();
    }

    @Test(testName = "C2")
    public void A_loginPageTest() {
        open(learningPlatform);
        LearningPlatformLogonPage logonPage = new LearningPlatformLogonPage();
        logonPage.checkLogon(LOGIN, PASSWORD);
        LearningPlatformLoginLogoutPage loginOk = new LearningPlatformLoginLogoutPage();
        loginOk.getLogoutHoverResult();
    }

    @Test(testName = "C63")
    public void B_logoutTest() {
        open(learningPlatform);
        logon();
        LearningPlatformLoginLogoutPage loginLogout = new LearningPlatformLoginLogoutPage();
        loginLogout.getLogout();
        LearningPlatformLogonPage logonPage = new LearningPlatformLogonPage();
        logonPage.checkLogout();
    }

    @Test(testName = "C98")
    public void C_logoClickTest() {
        open(learningPlatform);
        logon();
        LearningPlatformHomePage inicioPage = new LearningPlatformHomePage();
        inicioPage.checkClickLogo();
    }

    @Test(testName = "C99")
    public void D_inicioNavClickTest() {
        open(learningPlatform);
        logon();
        LearningPlatformHomePage inicioPage = new LearningPlatformHomePage();
        inicioPage.checkClickInicio();
    }

    @Test(testName = "C100_Scenario1")
    public void E_progressoNavTest1() {
        open(learningPlatform);
        logon();
        LearningPlatformProgressoNavHomePage progressoPage = new LearningPlatformProgressoNavHomePage();
        progressoPage.checkNavProgresso();
    }

    @Test(testName = "C100_Scenario2")
    public void F_progressoNavTest2() {
        open(learningPlatform);
        logon();
        LearningPlatformProgressoNavHomePage progressoPage = new LearningPlatformProgressoNavHomePage();
        progressoPage.checkNavProgressoSugerenciasDelProfesor();
    }

    @Test(testName = "C100_Scenario3")
    public void G_progressoNavTest3() {
        open(learningPlatform);
        logon();
        LearningPlatformProgressoNavHomePage progressoPage = new LearningPlatformProgressoNavHomePage();
        progressoPage.checkNavRegistro();
    }

    @Test(testName = "C100_Scenario4")
    public void H_progressoNavTest4() {
        open(learningPlatform);
        logon();
        LearningPlatformProgressoNavHomePage progressoPage = new LearningPlatformProgressoNavHomePage();
        progressoPage.checkNavCuadernoDeNotas();
    }

    @Test(testName = "C23")
    public void I_miProgressoNavTest() {
        H_progressoNavTest4();
        LearningPlatformCuadernoDeNotas cuadernoDeNotas = new LearningPlatformCuadernoDeNotas();
        cuadernoDeNotas.checkCuadernoDeNotasContent();
    }

    @Test(testName = "C103_Scenario1")
    public void J_cuentaNavTest1() {
        open(learningPlatform);
        logon();
        LearningPlatformCuentaNavHomePage cuentaNavHomePage = new LearningPlatformCuentaNavHomePage();
        cuentaNavHomePage.checkCuentaMensajesNav();
    }

    @Test(testName = "C103_Scenario2")
    public void K_cuentaNavTest2() {
        open(learningPlatform);
        logon();
        LearningPlatformCuentaNavHomePage cuentaNavHomePage = new LearningPlatformCuentaNavHomePage();
        cuentaNavHomePage.checkCuentaPreferenciasNav();
    }

    @Test(testName = "C103_Scenario3")
    public void L_cuentaNavTest3() {
        open(learningPlatform);
        logon();
        LearningPlatformCuentaNavHomePage cuentaNavHomePage = new LearningPlatformCuentaNavHomePage();
        cuentaNavHomePage.checkCuentaSalirNav();
    }

    @Test(testName = "C150")
    public void M_verifyNombreFieldTest() {
        K_cuentaNavTest2();
        LearningPlatformPrefernciasPage prefernciasPage = new LearningPlatformPrefernciasPage();
        prefernciasPage.preferenciasValidateNombreInput();
    }
}