package com.kitcenter.app.homework.lesson21;

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

public class StylusSeleniumTest extends WebDriverTestBase {

    private String stylusSearch = "https://stylus.ua";
    private String searchText = "Sony Z2";
    List<WebElement> elements;

    @Test
    public void searchPhoneTest(){
        webDriver.get(stylusSearch);
        By searchLocator = By.cssSelector("div[id='head-search'] input[type='text']");
        WebElement searchField = webDriver.findElement(searchLocator);
        searchField.sendKeys(searchText);
        By buttonFindLocator = By.cssSelector("div[id='head-search'] input[type='submit']");
        WebElement searchButton = webDriver.findElement(buttonFindLocator);
        searchButton.click();
        By searchLinkLocator = By.xpath(".//*[@id='search-list']/ul/li[5]/a/span");
        By openedLinkLocator = By.xpath(".//*[@id='product-block']/header/div[1]/h1");
        elements = webDriver.findElements(searchLinkLocator);
        for (WebElement webElement : elements){
            assertTrue(webElement.isDisplayed());
            webElement.click();
        }
        elements = webDriver.findElements(openedLinkLocator);
        for (WebElement webElement : elements){
            assertTrue(webElement.isDisplayed());
        }
    }

    @Test
    public void searchPhoneTest1(){
        Configuration.browser = WebDriverRunner.CHROME;
        open(stylusSearch);
        $("div[id='head-search'] input[type='text']").val(searchText);
        $("div[id='head-search'] input[type='submit']").click();
        $(By.xpath(".//*[@id='search-list']/ul/li[5]/a/span")).shouldBe(visible).click();
        $(By.xpath(".//*[@id='product-block']/header/div[1]/h1")).shouldBe(visible).shouldHave(text("Смартфон Sony Xperia Z2 Black"));
    }
}
