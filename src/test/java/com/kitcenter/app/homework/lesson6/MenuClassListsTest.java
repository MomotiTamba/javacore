package com.kitcenter.app.homework.lesson6;

import org.junit.*;
import org.junit.runners.MethodSorters;

import java.util.Scanner;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MenuClassListsTest {
    Scanner sc = new Scanner(System.in);
    MenuClassLists menuClassLists = new MenuClassLists();

    @BeforeClass
    public static void preConditionForClass() {

    }

    @Before
    public void preConditionForTest() {

    }

    @Test
    public void aLogicMainMenu() {
        menuClassLists.logicMainMenu();
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
