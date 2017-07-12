package com.kitcenter.app.homework.lesson22;


import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class GmailSeleniumTest {

    private String gmailSearch = "https://www.gmail.com";
    private String logonName = "selenium.jtest@gmail.com";
    private String logonPassword = "ctcehbnb123";

    private WebDriver webDriver;
    List<WebElement> elements;

    @Test
    public void gmailLogonTest() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\muon\\KIT\\chromedriver_win32\\chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        webDriver.get(gmailSearch);
        // find login
        By loginLocator = By.cssSelector("div[class='Xb9hP'] input[id='identifierId']");
        WebElement loginElement = webDriver.findElement(loginLocator);
        loginElement.sendKeys(logonName);
        // press button next
        By nextLoginLocator = By.cssSelector("#identifierNext > content");
        WebElement buttonLoginElement = webDriver.findElement(nextLoginLocator);
        buttonLoginElement.click();
        // find password
        By passwordLocator = By.cssSelector("#password > div.aCsJod.oJeWuf > div > div.Xb9hP > input");
        elements = webDriver.findElements(passwordLocator);
        for (WebElement webElement : elements) {
            Assert.assertTrue(webElement.isEnabled());
            webElement.sendKeys(logonPassword);
            webElement.submit();
        }
        // press button next
        By nextPasswordLocator = By.cssSelector("#passwordNext > content");
        WebElement buttonPasswordElement = webDriver.findElement(nextPasswordLocator);
        buttonPasswordElement.click();
        // find inbox
        By inboxLocator = By.cssSelector("div[class='aio UKr6le'] a[href='https://mail.google.com/mail/#inbox']");
        elements = webDriver.findElements(inboxLocator);
        for (WebElement webElement : elements) {
            webElement.click();
            Assert.assertTrue(webElement.isDisplayed());
        }
        webDriver.quit();
    }
}
