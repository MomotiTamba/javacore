package com.kitcenter.app.homework.lesson24.LearningPlatform.page;


import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ProgressoNavHomePage {

    private SelenideElement progressoNav = $(By.id("nav-progress"));
    private SelenideElement miProgressoNav = $(By.id("nav-profile"));
    private SelenideElement progressoNavSugerenciasDelProfesor = $(By.id("nav-feedback"));
    private SelenideElement progressoNavRegistro = $(By.id("nav-history"));
    private SelenideElement progressoNavCuadernoDeNotas = $(By.id("nav-notebook"));
    private SelenideElement miProgressoHeader = $(By.cssSelector(".grid_3>h1"));
    private SelenideElement sugerenciasParaDanielHeader = $(By.cssSelector(".grid_8>div>h1"));
    private SelenideElement registroHeader = $(By.cssSelector(".grid_8>div>h1"));
    private SelenideElement cuadernoDeNotasHeader = $(By.cssSelector(".grid_8>div>h1"));
    private String miProgressoHeaderText = "Mi progreso";
    private String sugerenciasParaDanielText = "Sugerencias para";
    private String registroText = "Registro de actividades para";
    private String cuadernoDeNotasText = "Cuaderno de";

    public ProgressoNavHomePage checkNavProgresso() {
        progressoNav.click();
        miProgressoNav.click();
        miProgressoHeader.getText().equals(miProgressoHeaderText);
        return this;
    }

    public ProgressoNavHomePage checkNavProgressoSugerenciasDelProfesor() {
        progressoNav.click();
        progressoNavSugerenciasDelProfesor.click();
        sugerenciasParaDanielHeader.getText().equals(sugerenciasParaDanielText);
        return this;
    }

    public ProgressoNavHomePage checkNavRegistro() {
        progressoNav.click();
        progressoNavRegistro.click();
        registroHeader.getText().equals(registroText);
        return this;
    }

    public ProgressoNavHomePage checkNavCuadernoDeNotas() {
        progressoNav.click();
        progressoNavCuadernoDeNotas.click();
        cuadernoDeNotasHeader.getText().equals(cuadernoDeNotasText);
        return this;
    }
}
