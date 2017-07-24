package com.kitcenter.app.homework.lesson24.LearningPlatform.tests;

import com.kitcenter.app.homework.lesson24.LearningPlatform.core.TestBase;
import com.kitcenter.app.homework.lesson24.LearningPlatform.page.PrefernciasPage;
import org.testng.annotations.Test;

public class C150VerifyNombreFieldTest extends TestBase {

    C103CuentaNavTest c103CuentaNavTest = new C103CuentaNavTest();

    @Test(testName = "C150")
    public void verifyNombreFieldTest() {
        c103CuentaNavTest.cuentaNavTest2();
        PrefernciasPage prefernciasPage = new PrefernciasPage();
        prefernciasPage.preferenciasValidateNombreInput();
    }
}
