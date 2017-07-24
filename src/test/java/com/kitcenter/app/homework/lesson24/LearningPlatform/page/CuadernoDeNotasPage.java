package com.kitcenter.app.homework.lesson24.LearningPlatform.page;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class CuadernoDeNotasPage {

    private SelenideElement cuadernoDeUsernameHeading = $(By.cssSelector(".page-heading"));
    private SelenideElement verIndiceDelCursoLink = $(By.cssSelector(".grid_2 .more"));
    private SelenideElement pagination = $(By.cssSelector(".my-notebook-paging"));
    private SelenideElement notes = $(By.cssSelector(".table-holder"));
    private SelenideElement fecha = $(By.cssSelector(".date"));
    private SelenideElement dateAndOur = $(By.cssSelector(".noteDate"));
    private SelenideElement unidadYLeccion = $(By.cssSelector(".unitAndLesson"));
    private SelenideElement unitLessonNumber = $(By.cssSelector(".noteUnitLesson"));
    private SelenideElement tituloDeLaLeccion = $(By.cssSelector(".title"));
    private SelenideElement lessonTitle = $(By.cssSelector(".noteLessonTitle"));
    private SelenideElement notas = $(By.cssSelector(".description"));
    private SelenideElement noteDescription = $(By.cssSelector(".noteText"));
    private String hasNoTakenNotes = "Aún no ha tomado ninguna nota";

    public CuadernoDeNotasPage checkCuadernoDeNotasContent() {
        if (cuadernoDeUsernameHeading.isDisplayed()) {
            verIndiceDelCursoLink.shouldBe(visible);
        } else {
            verIndiceDelCursoLink.getText().equals(hasNoTakenNotes);
        }
        pagination.shouldBe(visible);
        notes.shouldBe(visible);
        fecha.shouldBe(visible);
        dateAndOur.shouldBe(visible);
        unidadYLeccion.shouldBe(visible);
        unitLessonNumber.shouldBe(visible);
        tituloDeLaLeccion.shouldBe(visible);
        lessonTitle.shouldBe(visible);
        notas.shouldBe(visible);
        noteDescription.shouldBe(visible);
        return this;
    }
}
