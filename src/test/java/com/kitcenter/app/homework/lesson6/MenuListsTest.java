package com.kitcenter.app.homework.lesson6;

import org.junit.*;
import org.junit.runners.MethodSorters;

import java.util.Scanner;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MenuListsTest {
    Scanner sc = new Scanner(System.in);
    MenuLists menuLists = new MenuLists();

    @BeforeClass
    public static void preConditionForClass() {

    }

    @Before
    public void preConditionForTest() {

    }

    @Test
    public void aLogicMainMenu() {
        menuLists.logicMainMenu();
    }

    @After
    public void postConditionForTest() {
        System.out.println("Test successfully pass");
    }

    @AfterClass
    public static void postConditionForClass() {
        System.out.println("Post condition for class test");
    }
}
