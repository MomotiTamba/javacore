package com.kitcenter.app.homework.lesson24.LearningPlatform.tests;

import com.kitcenter.app.homework.lesson24.LearningPlatform.core.TestBase;
import com.kitcenter.app.homework.lesson24.LearningPlatform.page.CuadernoDeNotasPage;
import org.testng.annotations.Test;


public class C23MiProgressoNavTest extends TestBase {

    C100ProgressoNavTests c100ProgressoNavTests = new C100ProgressoNavTests();

    @Test(testName = "C23")
    public void miProgressoNavTest() {
        c100ProgressoNavTests.progressoNavTest4();
        CuadernoDeNotasPage cuadernoDeNotas = new CuadernoDeNotasPage();
        cuadernoDeNotas.checkCuadernoDeNotasContent();
    }
}
