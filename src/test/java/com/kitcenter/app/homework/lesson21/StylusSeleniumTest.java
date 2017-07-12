package com.kitcenter.app.homework.lesson21;


import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class StylusSeleniumTest {

    private String stylusSearch = "https://stylus.ua";
    private String searchText = "Sony Z2";
    private WebDriver webDriver;
    List<WebElement> elements;

    @Test
    public void searchPhoneTest(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\muon\\KIT\\chromedriver_win32\\chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
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
            Assert.assertTrue(webElement.isDisplayed());
            webElement.click();
        }
        elements = webDriver.findElements(openedLinkLocator);
        for (WebElement webElement : elements){
            Assert.assertTrue(webElement.isDisplayed());
        }
        webDriver.quit();
    }
}
