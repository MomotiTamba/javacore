package com.kitcenter.runners.homework.lesson11;

import com.kitcenter.app.homework.lesson11.ArrayParser;
import com.kitcenter.app.homework.lesson11.MenuListLesson11;


public class HomeWork11Runner {
    public static void main(String[] args) {

        MenuListLesson11 menuListLesson11 = new MenuListLesson11();
        //menuListLesson11.mainMenuListLesson11();
        ArrayParser arrayParser = new ArrayParser();
        arrayParser.userKeywordLine("The weather is great", "is");
    }
}
