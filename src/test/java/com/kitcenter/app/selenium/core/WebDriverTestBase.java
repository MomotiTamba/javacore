package com.kitcenter.app.selenium.core;

import io.github.bonigarcia.wdm.ChromeDriverManager;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;

import static com.kitcenter.app.selenide.util.PropertiesCache.getProperty;

@Listeners({TestListener.class})
public class WebDriverTestBase {

    public WebDriver webDriver;
    private long implicitWait = Long.parseLong(getProperty("wait.implicit"));
    private long pageWait = Long.parseLong(getProperty("wait.page"));
    private long scriptWait = Long.parseLong(getProperty("wait.script"));

    @BeforeClass
    public void setUp() {
        ChromeDriverManager.getInstance().setup();
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(implicitWait, TimeUnit.SECONDS);
        webDriver.manage().timeouts().pageLoadTimeout(pageWait, TimeUnit.SECONDS);
        webDriver.manage().timeouts().setScriptTimeout(scriptWait, TimeUnit.SECONDS);
    }

    @AfterClass
    public void tearDown() {
        webDriver.quit();
    }
}

