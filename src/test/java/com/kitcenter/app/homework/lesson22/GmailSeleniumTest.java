package com.kitcenter.app.homework.lesson22;


import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import com.kitcenter.app.selenium.core.WebDriverTestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.testng.Assert.assertTrue;

public class GmailSeleniumTest extends WebDriverTestBase{

    private String gmailSearch = "https://www.gmail.com";
    private String logonName = "selenium.jtest@gmail.com";
    private String logonPassword = "ctcehbnb123";
    List<WebElement> elements;

    @Test
    public void gmailLogonTest() {
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
            assertTrue(webElement.isEnabled());
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
            assertTrue(webElement.isDisplayed());
        }
    }

    @Test
    public void gmailLogonTest1(){
        Configuration.browser = WebDriverRunner.CHROME;
        open(gmailSearch);
        $("div[class='Xb9hP'] input[id='identifierId']").val(logonName).pressEnter();
        $("#password > div.aCsJod.oJeWuf > div > div.Xb9hP > input").val(logonPassword).pressEnter();
        $("div[class='aio UKr6le'] a[href='https://mail.google.com/mail/#inbox']").shouldBe(visible).shouldHave(
                text("Inbox"));
    }
}
