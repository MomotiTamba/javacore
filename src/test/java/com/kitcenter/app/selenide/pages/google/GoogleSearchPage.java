package com.kitcenter.app.selenide.pages.google;


import com.codeborne.selenide.SelenideElement;
import com.kitcenter.app.selenium.AbstractPage;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class GoogleSearchPage extends AbstractPage {

    private SelenideElement search = $(By.name("q"));
    private String googleSearchBtn = "_fZl";

    public GoogleSearchPage searchFor(String searchText){
        search.val(searchText);
        jsClick(googleSearchBtn, "id");
        return this;
    }
}
