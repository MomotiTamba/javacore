package com.kitcenter.app.homework.lesson24.LearningPlatform.tests;

import com.kitcenter.app.homework.lesson24.LearningPlatform.core.TestBase;
import com.kitcenter.app.homework.lesson24.LearningPlatform.page.PrefernciasPage;
import org.testng.annotations.Test;


public class C152VerifySexoRadioBtnTest extends TestBase {

    C103CuentaNavTest c103CuentaNavTest2 = new C103CuentaNavTest();

    @Test(testName = "C152")
    public void sexoRaddioBtnTest(){
        c103CuentaNavTest2.cuentaNavTest2();
        PrefernciasPage prefernciasPage = new PrefernciasPage();
        prefernciasPage.checkFemeninoMasculinoRadio();
    }
}
