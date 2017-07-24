package com.kitcenter.app.homework.lesson24.LearningPlatform.tests;


import com.kitcenter.app.homework.lesson24.LearningPlatform.page.*;

public class LoginTestData {

    private String learningPlatform = "https://learningplatform.stg.openenglish.com/login.html";
    private static final String LOGIN = "shiosaky@gmail.com";
    private static final String PASSWORD = "Test123";

    public String getLearningPlatform() {
        return learningPlatform;
    }

    public static String getLOGIN() {
        return LOGIN;
    }

    public static String getPASSWORD() {
        return PASSWORD;
    }

    public void logOn() {
        LogonPage loginPage = new LogonPage();
        loginPage.getLogon(getLOGIN(), getPASSWORD());
    }

    public void logOut() {
        LoginLogoutPage loginLogout = new LoginLogoutPage();
        loginLogout.getLogout();
    }
}