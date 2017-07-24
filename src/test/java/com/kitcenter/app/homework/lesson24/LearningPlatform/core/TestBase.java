package com.kitcenter.app.homework.lesson24.LearningPlatform.core;


import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import io.github.bonigarcia.wdm.OperaDriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Selenide.close;

public class TestBase {

    public String browser = System.getProperty("browser", "chrome");

    @BeforeClass
    public void setUp() {
        switch (browser) {
            case WebDriverRunner.CHROME:
                ChromeDriverManager.getInstance().setup();
                break;
            case WebDriverRunner.FIREFOX:
                FirefoxDriverManager.getInstance().setup();
                break;
            case WebDriverRunner.OPERA:
                OperaDriverManager.getInstance().setup();
                break;
        }
        Configuration.browser = browser;
        //Configuration.holdBrowserOpen = true;
    }

    @BeforeMethod
    public void openBrowser() {
        Configuration.browser = browser;
    }

    @AfterMethod
    public void closeBrowser() {
        close();
    }
}
