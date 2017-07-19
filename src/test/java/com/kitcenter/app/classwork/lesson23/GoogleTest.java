package com.kitcenter.app.classwork.lesson23;

import static com.codeborne.selenide.CollectionCondition.size;

import com.kitcenter.app.selenide.core.SelenideTestBase;
import com.kitcenter.app.selenide.pages.google.GoogleSearchPage;
import com.kitcenter.app.selenide.pages.google.GoogleSearchResultPage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.CollectionCondition.texts;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;


public class GoogleTest extends SelenideTestBase {

    private String google = "http://google.com/ncr";
    private String searchText = "selenide";

    @Test
    public void searchInGoogleTest(){
        open(google);
        $(By.name("q")).val(searchText).pressEnter();
        $(By.xpath(".//*[@id='rso']/div/div/div[1]/div/div/h3/a")).shouldBe(visible).shouldHave(
                text("Selenide: concise UI tests in Java")
                /*text("Selenide.org")*/);
        $$("#ires .g").shouldHave(size(10));
    }

    @Test
    public void searchInGoogleWithPageObjectTest() {
        open(google);
        GoogleSearchPage googleSearch = new GoogleSearchPage();
        googleSearch.searchFor(searchText);
        GoogleSearchResultPage googleResult = new GoogleSearchResultPage();
        googleResult.getLinkResults().shouldHave(size(10)).first().shouldHave(text("Selenide: concise UI tests in Java"));
    }
}
